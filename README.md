# PanGu GateWay Service
This is api gateway for micoservice
This can be a common service used by multiple service
This is build by Zuul

## Usage Guild
- Directly Run
gradle build
gradle bootRun
gradle bootRun --debug-jvm

- Run by Docker
https://spring.io/guides/gs/spring-boot-docker/#initial

gradle build docker
docker run -p 5555:5555 -t pangu/apigateway

- Debug for Docker
docker run -e "JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,address=8000,server=y,suspend=n" -p 5555:5555 -p 8000:8000 -t pangu/apigateway

- stop Docker service
docker ps
docker stop "container id"
docker rm "container id"

## PanGu GateWay Service
http://localhost:5555/actuator/routes

http://localhost:5555/api/userservice/user/admin
http://localhost:5555/api/ruleservice/rule?code=ruleVar1

## Parse JWT Token
https://www.jsonwebtoken.io/