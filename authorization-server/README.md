#AuthorizationServerApplication
This is the Auth Server of a microservice built with SpringBoot stack

->Run as AuthorizationServerApplication.java or mvn spring-boot:run inside root directory of this application
->POSTMAN Parameters:
->http://localhost:9092/oauth/token?grant_type=password&username=admin&password=teste1234
-> Authorization Header -> Basic Y29uY3JldGU6dGVzdGUxMjM0 (concrete:teste1234 in BASE64)
-> teste1234 Bcrypt = $2a$04$oXKb7sQARTN3RF5DwPGkjORUuy2w6Pp9pcXAQuvfMwBHzfKzioG72
					