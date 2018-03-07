# springboot-microservice

This is a microservice built with SpringBoot stack

Requirements:
```
Maven
JDK 8
MySQL with "oauth" schema created
You can adjust the db config here -> https://github.com/luizimcpi/springboot-microservice-config/blob/master/authorization-server.yml
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
Run as AuthorizationServerApplication.java or mvn spring-boot:run inside root directory of the application
```

POSTMAN PARAMETERS
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

