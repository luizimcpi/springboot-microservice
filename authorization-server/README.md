#AuthorizationServerApplication

This is the Auth Server of a microservice built with SpringBoot stack

Requirements:
```
Maven
JDK 8
```
```
First
Run as ConfigServerApplication.java or mvn spring-boot:run inside root directory of the application
```
```
Then
Run as EurekaServerApplication.java or mvn spring-boot:run inside root directory of the application
```
```
Finally
Run as AuthorizationServerApplication.java or mvn spring-boot:run inside root directory of this application
```

POSTMAN PARAMETERS
```
URL
http://localhost:9092/oauth/token?grant_type=password&username=admin&password=123456
```
```
Authorization Header
Basic Y29kZXJlZjokMmEkMTAkcDlQazBmUU5BUVNlc0k0dnV2S0EwT1phbkREMg== (Basic + "coderef:12345" in BASE 64)
```
```
Method: POST
Content-Type: application/json
```

