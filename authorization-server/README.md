#AuthorizationServerApplication
This is the Auth Server of a microservice built with SpringBoot stack

->Run as AuthorizationServerApplication.java or mvn spring-boot:run inside root directory of this application
->POSTMAN Parameters:
->http://localhost:9092/oauth/token?grant_type=password&username=admin&password=123456
-> Authorization Header -> Basic Y29uY3JldGU6MTIzNDU= (concrete:12345 in BASE64)
-> 123456 Bcrypt = $2a$10$r0RFDmpneBVryx.ihHK9gu6FFJQi4nTxQUqzdSTvrPpaKZMxigqpy
					