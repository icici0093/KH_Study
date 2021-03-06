# Day 17(네트워크 프로그래밍)  

### Network  
  - 하나 이상의 단말이 매개체를 통해 연결되어 통신이 가능한 상태  
  - 목적 : 
    1. 여러 개의 통신기기들을 서로 연결하여 데이터를 주고받거나 자원(프린터 등) 등을 공유하기 위함  
    2. 자바에서 제공하는 java.net 패키지를 사용하면 어플리케이션끼리 데이터 통신 가능  

### 서버(Server)  
  - 다양한 서비스를 제공하는 컴퓨터 또는 프로그램  
  
### 클라이언트(Client)  
  - 서비스를 요청해서 사용하는(제공받는) 컴퓨터 또는 프로그램  
  
### Protocol  
  - 원활한 통신을 하기 위해 지정한 **통신규약**  
  - 접속이나 전달방식, 데이터 형식, 검증 방법 등을 맞추기 위한 약속  
  ex) HTTP, IP, FTP, TCP, UDP  
  
### IP  
  - 컴퓨터에 부여된 고유의 식별 주소  
  - IP Address  
    - IPv4  
      1. 주소 체계는 32bit  
      2. 최대 약 40억개의 서로 다른 주소를 부여  
    - IPv6  
      1. 128bit(16bit씩 8마디)  
      2. 최대 1조개의 서로 다른 주소 부여  
  
### TCP(Transmission Control Protocol)  
  - 데이터 전달의 **신뢰성을 최대한 보장**하기 위한 방식  
  - **연결지향** : 데이터를 전달할 논리적인 연결을 먼저 구성 (3way-Handshake)  
  - **신뢰성** : 순차적으로 데이터를 전송함. 확인 응답 및 오류시 재전송  

### UDP(User Datagram Protocol)  
  - 데이터의 빠른 전달을 보장하기 위해 사용  
  - **빠른 속도 보장**을 위해 대부분의 기능을 제한함  
    - 비 신뢰성 : 확인 응답 및 재전송 작업이 없음  
    - 비 연결 지향성 : 세션을 맺지 않음  
  - 빠른 데이터 전송을 위해 사용(실시간 스트리밍 서비스)  

### Port  
  - 네트워크상의 응용프로그램을 지정하는 번호(프로그램 식별 번호)  
  - TCP, UDP는 각각 0~65535번의 Port번호를 가지며 번호를 가지고 서비스를 구분함  
  - 모든 응용 프로그램은 하나 이상의 포트 생성 가능, 포트를 이용하여 상대 응용프로그램과 데이터 교환  
  - Well-known Port(0 ~ 1023)  
    - FTP(21), Telnet(23), 웹 서비스(80), DNS(53)  
    
### Network Model  
  - 데이터를 만들때 최상의 **효율성과 안정성을 보장**하기 위해 만들어 놓은 구조 형태  
  - 통신이 일어나는 절차를 각 기능별로 모듈화시켜 만들어 놓은 계층적인 구조  
  - OSI 7 Layer, TCP/IP  
  
### 소켓(Socket)  
  - 프로세스간의 통신을 담당하며, InputStream과 OutputStream을 가지고 있으며 두가지 스트림을 통해 프로세스간의 통신(입출력)이 이루어짐  
  - 즉, **서버와 클라이언트가 통신을 하기 위한 매개체**  
  
  - 소켓 프로그래밍 :  
    - TCP/IP 네트워크를 이용하여 쉽게 통신 프로그램을 작성하도록 지원하는 기반 기술  
    - 자바로 소켓 통신할 수 있는 라이브러리 지원  
    - 소켓끼리 데이터를 주고받으며, 소켓은 특정 IP포트 번호와 결합함  
    
- chattingex  
• [ClientProgram](https://github.com/icici0093/KH_Study/blob/main/code/Day_18_Socket/src/chattingex/ClientProgram.java)  
• [ServerProgram](https://github.com/icici0093/KH_Study/blob/main/code/Day_18_Socket/src/chattingex/ServerProgram.java)  

- socketex  
• [ClientProgram](https://github.com/icici0093/KH_Study/blob/main/code/Day_18_Socket/src/socketex/ClientProgram.java)  
• [ServerProgram](https://github.com/icici0093/KH_Study/blob/main/code/Day_18_Socket/src/socketex/ServerProgram.java)  

- chatting  
• [ChattingClient](https://github.com/icici0093/KH_Study/blob/main/code/Day_18_Socket/src/chatting/ChattingClient.java)  
• [ChattingServer](https://github.com/icici0093/KH_Study/blob/main/code/Day_18_Socket/src/chatting/ChattingServer.java)  




