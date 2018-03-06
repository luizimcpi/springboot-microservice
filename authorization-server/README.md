#AuthorizationServerApplication
This is the Auth Server of a microservice built with SpringBoot stack

->Run as AuthorizationServerApplication.java or mvn spring-boot:run inside root directory of this application
->POSTMAN Parameters:
->http://localhost:9092/oauth/token?grant_type=password&username=admin&password=teste1234
-> Authorization Header -> Basic Y29uY3JldGU6dGVzdGUxMjM0 (concrete:teste1234 in BASE64)
-> teste1234 Bcrypt = $2b$10$IqgjKxMTzJRbxSFHuJnP8.XvV4Oy3qUDDjDvNfpvgZfI8TBPTmbrW
					