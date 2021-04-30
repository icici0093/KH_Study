<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax</title>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
	<h1>Ajax 개요</h1>
	<p>
		Ajax는 Asynchronous Javascript And XML이란 용어로
		<br>
		서버로부터 데이터를 가져와 전체 페이지를 새로 고치지 않고
		일부만 로드할 수 있게 하는 기법
		<br>
		비동기식 요청을 함.
	</p>
	<h3>
		동기식 / 비동기식이란?
	</h3>
	<p>
		동기식은 서버와 클라이언트가 동시에 통신하여 프로세스를 수행 및 종료까지 같이하는 방식
		<br>
		이에 반해 비동기식은 페이지 리로딩없이 서버요청 사이사이 추가적인 요청과 처리가 가능
	</p>
	<h3>ajax 구현(Javascript)</h3>
	<h4>1. ajax로 서버에 전송값 보내기</h4>
	<p>버튼 클릭시 전송값을 서버에서 출력</p>
	<input type="text" id="msg1">
	<button onclick="jsFunc();">보내기(JS)</button>
	<h3>ajax 구현(jQuery)</h3>
	<h4>2. ajax(jQuery)로 서버에 전송값 보내기</h4>
	<p>버튼 클릭시 전송값을 서버에서 출력</p>
	<input type="text" id="msg2">
	<button id="jquery-btn2">보내기(jQuery)</button>
	<h3>3. 버튼 클릭시 서버에서 보낸 값 수신</h3>
	<button id="jquery-btn3">서버에서 보낸 값 확인</button>
	<p id="confirmArea"></p>
	<br><br><br><br><br><br><br><br><br><br><br>
	<h4>4. 서버로 전송값 보내고 결과 문자열 받아서 처리하기</h4>
	<p>숫자 2개를 전송하고 더한 값 받기</p>
	첫번째 수 : <input type="text" id="num1"><br> 
	두번째 수 : <input type="text" id="num2"><br>
	<button id="jquery-btn4">전송 및 결과 확인</button>
	<p id="paragraph4"></p>
	<br><br><br><br><br><br><br><br><br><br><br>
	<h1>JSON 개요</h1>
	<p>
		Ajax 서버 통신시 데이터 전송을 위한 포맷
		<br>
		JSON(Javscript Object Notation) : 자바스크립트 객체 표기법
		<br>
		JSON을 사용하면 모든 데이터형을 서버와 주고 받을 수 있다.(사용목적)
		<br> 숫자, 문자열, boolean, 배열, 객체, null
		<br>
		'{'으로 시작하여 '}'로 끝나며 그 속에 데이터를 표기하고 'key : value(값)' 쌍으로 구성된다.
		<pre>
			{
				"name" : "이순신",
				"age" : 27,
				"birth" : "1990-01-01",
				"gender" : "남",
				"marry" : true,
				"address" : "서울특별시 중구 인사동",
				"family" : {  
							"father" : "아버지",
							"mother" : "어머니",
							"brother" : "동생"
						}
			}
		</pre>
	</p>	
	
	<h4>5. 서버로 전송값 보내고 결과 JSON으로 받아서 처리</h4>
	<p id="p5"></p>
	<button id="btn-5">실행 및 결과확인</button>
	<br><br><br><br><br><br><br><br><br><br><br>
	<h4>6. 서버로 전송값 보내고 결과 JSONArray로 받아서 처리</h4>
	유저 번호 입력 : <input type="text" id="findNum"><br>
	<p id="p6"></p>
	<button id="btn-6">실행 및 결과확인</button>
	<br><br><br><br><br><br><br><br><br><br><br>
	<h4>7. 서버에 값을 보내서 리스트로 받아 select 표현하기</h4>
	<select id="sel1">
		<option value="1">1</option>
		<option value="2">2</option>
	</select>
	<select id="sel2"></select>
	<br><br><br><br><br><br><br><br><br><br><br>
	<h4>8. GSON을 이용한 List 변환</h4>
	<button id="btn-8">실행</button>
	<p id="p8"></p>
	<br><br><br><br><br><br><br><br><br><br><br>
	<script>
		function jsFunc() {
			// 1. XMLHttpRequest 객체 생성
			var xhttp = new XMLHttpRequest();
			var msg = document.getElementById("msg1").value;
			// 2. 요청정보 설정
			xhttp.open("GET", "/ajax/test1?msg="+msg, true);
			// 3. 데이터 처리에 따른 동작함수 설정
			xhttp.onreadystatechange = function() {
				// readyState -> 0(Uninitialized), 1(Loading), 2(Loaded), 3(Interactive), 4(Completed)
				// status -> 200(요청성공), 403(접근거부), 404(페이지 없음), 500(서버 오류 발생)
				if(this.readyState == 4 && this.status == 200) {
					console.log("서버 전송 성공");
				}else if(this.readyState == 4 && this.status == 404) {
					console.log("서버 전송 실패..");
				}
			}
			xhttp.send();
		}
		
		$("#jquery-btn2").on("click", function() {
			var msg = $("#msg2").val();
			$.ajax({
				url : "/ajax/test2",
				data : { "msg" : msg },
				type : "get",
				success : function() {
					console.log("서버 전송 성공!");
				},
				error : function() {
					console.log("오류 발생!");
				}
			});
		});
		
		$("#jquery-btn3").on("click", function() {
			$.ajax({
				url : "/ajax/test3",
				type : "get",
				success : function(data) {
					$("#confirmArea").html(data);
				},
				error : function() {
					console.log("전송 실패!!");
				}
			});
		});
		
		$("#jquery-btn4").on("click", function() {
			var number1 = $("#num1").val();
			var number2 = $("#num2").val();
			$.ajax({
				url : "/ajax/test4",
				data : { "num1" : number1, "num2" : number2 },
				type : "get",
				success : function(data) {
					$("#paragraph4").html("처리된 값은 : " + data);
				},
				error : function() {
					console.log("전송 처리 실패");
				}
			});
		});
		$("#btn-5").on("click", function() {
			$.ajax({
				url : "/ajax/test5",
				type : "get",
				success : function(data) {
					$("#p5").html("번호 : "+ data.userNo + "/ 이름 : " + data.userName + "/ 주소 : " + data.userAddr);
				},
				error : function() {
					console.log("전송 처리 실패!");
				},
				complete : function() {
					console.log("complete 완료")
				}
			});
		});
		
		$("#btn-6").on("click", function() {
			var findNum = $("#findNum").val();
			$.ajax({
				url : "/ajax/test6",
				type : "get",
				data : {"findNum" : findNum},
				success : function(data) {
					var resultText = "";
					for(var i=0; i<data.length; i++) {
						var userNo = data[i].userNo;
						var userName = data[i].userName;
						var userAddr = data[i].userAddr;
						resultText += "번호 : " + userNo + " / 이름 : " + userName + " / 주소 : " + userAddr + "<br>";
					}
					$("#p6").html(resultText);
				},
				error : function() {
					console.log("전송 처리 실패");
				},
				complete : function() {
					console.log("성공이든 실패든 출력");
				}
			});
		});
		$("#sel1").on("change", function() {
			var sel1 = $("#sel1").val();
			$.ajax({
				url : "/ajax/test7",
				data : { "sel1" : sel1 },
				type : "get",
				success : function(data) {
					var sel2 = $("#sel2");
					// #sel2 를 한번 비워줘야 함.
					//sel2.html(""); 
					sel2.find("option").remove();
					for(var i=0; i < data.length; i++) {
						var num = data[i].num;
						sel2.append("<option>"+num+"</option>");
					}
				},
				error : function() {
					console.log("통신 실패!");
				}
			});
		});
		
		$("#btn-8").on("click", function() {
			$.ajax({
				url : "/ajax/test8",
				type : "get",
				success : function(data) {
					var resultText = "";
					for(var i=0; i<data.length; i++) {
						var userNo = data[i].userNo;
						var userName = data[i].userName;
						var userAddr = data[i].userAddr;
						resultText += "번호 : " + userNo + " / 이름 : " + userName + " / 주소 : " + userAddr + "<br>";
					}
					$("#p8").html(resultText);
				},
				error : function() {
					console.log("통신 실패!!");
				}
			});
		});
	</script>	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>