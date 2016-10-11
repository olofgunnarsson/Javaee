# JavaEE

#About
Simple rest application that can create and fetch a user.

App introduces

- JPA
- JAX-RS
- Entity-boundary-control programming pattern
- Docker
- Wildfly

##Prerequisites
Install docker: https://www.docker.com/products/overview

##Instructions
- ./mvnw clean install
- docker-compose build
- docker-compose up
 
##Test
When app is running:

- curl -XPOST $docker_ip:8888/javaee-1.0-SNAPSHOT/user/tester
- curl $docker_ip:8888/javaee-1.0-SNAPSHOT/user/1