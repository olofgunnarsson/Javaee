# javaee
Java EE

##Instructions
./mvnw install
 docker build -t kits-tomee .
 docker run -it --rm -p 8888:8080 kits-tomee 
 
##Test
curl $docker_ip:8888/javaee-1.0-SNAPSHOT/