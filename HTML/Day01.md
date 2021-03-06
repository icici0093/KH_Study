# Day 01  

### HTML  
  - 인터넷 : 전 세계의 컴퓨터가 서로 연결되어 정보를 교환할 수 있는 하나의 거대한 컴퓨터 통신망  
  - 웹(web)  
    - World Wide Web의 줄임말. 인터넷에 연결된 컴퓨터들을 통해 사람들이 정보를 공유할 수 있는 전세계적인 공간  
    - 네트워크에 연결된 시스템의 "정보"를 한 위치에서 "검색"할 수 있는 서비스  
## Web 서버  
  - 웹 서버 : 네트워크를 통해 서로 연결된 컴퓨터들간에 서버와 클라이언트의 역할을 나누고, HTML이라는 **웹문서**를 통해 정보와 자료를 주고받는 시스템  
  - HTML : 웹에서 정보를 표현할 목적으로 만든 마크 업 언어(Hyper Text Markup Language)  
    - 웹 페이지를 작성하기 위해 사용되는 언어로 웹 브라우저에게 보일 문자열과 이를 감싸는 일종의 해석기호인 태그들로 이루어짐  
  - Markup : 문서의 논리적인 구조를 정의하고, 출력장치에 어떠한 형태로 보여질 것인지를 지시하는 역할  
  - Hyper Text : 하나의 웹 문서에서 제공하는 연결 주소(링크)를 통해 다른 문서로 이동하는 것  
  
### Hyper Text Markup Language  
  - <html></html>  
    - html 문서의 시작, 끝을 표시  
    - lang 속성은 이 페이지가 어느나라 언어로 되어있는지 표시  
      - 검색엔진이 페이지 검색시에 참고, 검색 사이트에서 특정언어 제외할 때 사용  
  - <!-- -->  
    - 주석  
  - <head></head>  
    - 머리란 의미로써 html에 필요한 내용들을 넣는 곳  
  - <meta ~ >  
    - 헤더 내부에서 사용하는 태그로써 메타 데이터라는 뜻으로, html 문서가 가지고있는 유용한 정보를 담아 두는 곳, 문서 정보를 검색엔진에 전달  
      - 문자셋 설정 : <meta charset="UTF-8">
      - 웹 페이지에 대한 설명 : <meta name="description" content="head 설명 페이지 입니다.">  
      - 검색 엔진에 대한 키워드 : <meta name="keywords" content="HTML,CSS,XML,JavaScript">  
      - 페이지 작성자 : <meta name="author" content="Yoon pilju">  
      - 30초마다 문서 새로고침 : <meta http-equiv="refresh" content="30">  
  - <title></title>  
    - 페이지의 제목을 나타내는 태그  
    - 브라우저 창 이름을 설정할 수 있음  
  - <script></script>  
    - 페이지에서 스크립트를 사용하기 위해 사용  
    - head와 body 두 곳에서 사용 가능  
  - <style></style>  
    - 태그의 스타일을 지정해주는 태그, css속성들을 HTML 내에 직접 쓸 때 사용  
  - <base>  
    - 페이지의 링크가 상대경로로 되었을 때 그 기준이 될 경로를 지정  
    - 링크를 어떻게 오픈할 것인지 결정  
  - <link>  
    - 문서를 외부의 문서와 연결하기 위해 사용  
    - css파일이나 웹 폰트를 사용할 때 주로 연결  
  - <!DOCTYPE>   
    - 문서의 형식을 알려주는 태그  
    - html5 : <!DOCTYPE html>    
  
### 주의사항  
  - 태그는 대소문자를 구분하지않음, 소문자 권장  
  - 시작태그로 시작하면 반드시 종료태그로 종료  
  - 파일 확장자는 반드시 html로 설정할 것  
  - 문자의 공백은 한 개만 인식함. 공백을 추가하기 위해서는 '&nbsp'사용  

• [1. 글자 관련 태그](https://github.com/icici0093/KH_Study/blob/main/HTML/workspace/KH_HTML_CSS/1.textTag.html)  
• [2. 목록 관련 태그](https://github.com/icici0093/KH_Study/blob/main/HTML/workspace/KH_HTML_CSS/2.listTag.html)  
• [3. 표 관련 태그](https://github.com/icici0093/KH_Study/blob/main/HTML/workspace/KH_HTML_CSS/3.tableTag.html)  
• [4. 영역 관련 태그](https://github.com/icici0093/KH_Study/blob/main/HTML/workspace/KH_HTML_CSS/4.areaTag.html)  
• [5. 미디어 관련 태그](https://github.com/icici0093/KH_Study/blob/main/HTML/workspace/KH_HTML_CSS/5.multimediaTag.html)  

• [exercise_table](https://github.com/icici0093/KH_Study/blob/main/HTML/workspace/KH_HTML_CSS/exercise/exercise_table.html)  
    
  
