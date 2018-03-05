#AuthServerApplication
This is the Auth Server of a microservice built with SpringBoot stack

-> First Run ConfigServerApplication from config-server project
-> Then Run EurekaServerApplication from eureka-server project
-> Finally Run as AuthServerApplication.java or mvn spring-boot:run inside root directory of this application
-> Open POSTMAN and send a POST request to http://localhost:9092/oauth/token?grant_type=password&username=admin&password=12345
-> With Authorization Header:"=> Basic Y29uY3JldGU6MTIzNDU= <= " (concrete:12345 in BASE 64)
-> Content Type: JSON
