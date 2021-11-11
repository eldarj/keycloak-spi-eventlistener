#!/bin/bash
CONTAINER_NAME=mykeycloak

mvn -s ~/.m2/default-settings.xml clean package

chmod 777 target/*.jar

docker rmi my/keycloak:latest
docker build -t my/keycloak:latest .
docker stop $CONTAINER_NAME && docker rm $CONTAINER_NAME

docker run -d --name $CONTAINER_NAME -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin my/keycloak:latest