# JavaEE

##Prerequisites
Install docker: https://www.docker.com/products/overview

##Instructions
./mvnw clean install
docker-compose build
docker-compose up
 
##Test
curl -XPOST $docker_ip:8888/javaee-1.0-SNAPSHOT/app/user/tester
curl $docker_ip:8888/javaee-1.0-SNAPSHOT/app/user/1