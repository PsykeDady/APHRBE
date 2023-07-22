#!/bin/bash

rm aphrdb.mv.db

curl -X POST -H "Content-Type: application/json;" -d '{"name":"Psyky"}' http://localhost:8080/aphrbe/employee 


curl -X GET http://localhost:8080/aphrbe/employee/0

curl -X PUT -H "Content-Type: application/json;" -d '{"id":0,"name":"Psyke"}' http://localhost:8080/aphrbe/employee 

curl -X GET http://localhost:8080/aphrbe/employee/0

curl -X POST -H "Content-Type: application/json;" -d '{"name":"Dady"}' http://localhost:8080/aphrbe/employee 

curl -X GET http://localhost:8080/aphrbe/employee/

curl -X DELETE -H "Content-Type: application/json;" -d '{"id":0}' http://localhost:8080/aphrbe/employee 

curl -X DELETE -H "Content-Type: application/json;" -d '{"id":1}' http://localhost:8080/aphrbe/employee 
