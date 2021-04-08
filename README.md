# 🌱 Spring Boot Tutorial

Spring Boot Tutorial with Amigoscode  2021년 3월 25일 

---

<br>

### Spring Boot 기반의 기초적인 REST API
Spring Boot Tutorial | Full Course [2021] [NEW] : <https://youtu.be/9SGDpanrc8U>

<br>
<br>

 ### 환경 설정

  |                  |                                              |
  |------------------|----------------------------------------------|
  | Project          | Maven                                        |
  | Language         | Java 8                                       |
  | Spring Boot ver. | 2.4.4                                        |
  | Database         | PostgreSQL                                   |
  | IDE              | STS 4                                        |
  | Dependencies     | Spring Web <br> Spring Data <br> JPA PostgreSQL Driver |
  | Packaging        | Jar                                          |

<details>
  <summary> 개발 환경(영상) </summary>
  <div markdown="1">

  |                  |                                              |
  |------------------|----------------------------------------------|
  | Project          | Maven                                        |
  | Language         | Java 11                                      |
  | Spring Boot ver. | 2.4.1                                        |
  | Database         | PostgreSQL                                   |
  | IDE              | IntelliJ                                     |
  | Dependencies     | Spring Web <br> Spring Data <br> JPA PostgreSQL Driver|
  | Packaging        | Jar                                          |

  </div>
</details>

<br>
<br>       
         
### 접속 주소

`http://localhost:8090(포트번호)/api/v1/students`

<br>

### Class Fields

```java
	private Long id;
	private String name;
	private String email;
	private LocalDate dob;
	@Transient
	private Integer age;
```
<br>
<br>
<br>


 ### REST API

- **Get Mapping**

DB에 저장된 Student Class의 정보를 JSON형식으로 화면에 표시

<br>

- **Post Mapping**

Request Body에 Student Class의 정보를 JSON형식으로 담아 전송하면,  
email 정보 중복 확인 후 DB에 저장

<br>

- **Delete Mapping**

`http://localhost:8090/api/v1/students/**id**`

경로에 id 정보를 담아 전송하면 해당 id값의 학생이 존재하는지 확인 후,  
DB에서 삭제

<br>

- **Put Mapping**

`http://localhost:8090/api/v1/students/**id?name=값&email=값**`

경로에 id 정보를 담고 변경할 name 값과 email 값을 파라미터로 전송하면   
해당 id값의 학생이 존재하는지 확인 후, 파라미터 입력값이 null인지 검사   
입력값이 null이 아니고 email의 경우 중복되지 않으면, DB 정보 업데이트  
(파라미터 두 값 모두 옵션, 필수 입력값 아님)

<br>
<br>
<br>
<br>


***

 ###### 2021년 4월 8일 작성.
