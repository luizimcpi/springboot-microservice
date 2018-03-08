#PersonServiceApplication

This is the Person Service of a microservice built with SpringBoot stack

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
Now
Run as AuthorizationServerApplication.java or mvn spring-boot:run inside root directory of the application
```
```
Finally
Run as PersonServiceH2Application.java or mvn spring-boot:run inside root directory of this application
```

POSTMAN PARAMETERS (First Tab)
```
URL
http://localhost:9092/oauth/token?grant_type=password&username=admin&password=123456
```
```
Authorization Header
Basic Y29uY3JldGU6JDJhJDEwJHA5UGswZlFOQVFTZXNJNHZ1dktBME9aYW5ERDI= (Basic + "concrete:$2a$10$p9Pk0fQNAQSesI4vuvKA0OZanDD2" in BASE 64)
```
```
Method: POST
Content-Type: application/json
```
*Copy the access_token*

POSTMAN PARAMETERS (Second Tab)
```
URL
http://localhost:9093/api/person
```
```
Authorization Header
Bearer + "access_token"
```
```
Method: POST
Content-Type: application/json
```
```
Body Content
{
    "name": "Luiz Henrique Silva Evangelista",
    "email": "luiz.hse@hotmail.com"
}
```
*Done ! A new Person has been created*
```
Method: GET
URL
http://localhost:9093/api/person (List of people)

Method: GET
URL
http://localhost:9093/api/person/{id} (Specific person by id)

Method: DELETE
URL
http://localhost:9093/api/person/{id} (Delete Specific person by id)
```

