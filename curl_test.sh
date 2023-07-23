#!/bin/bash

# Employee
curl -X POST -H "Content-Type: application/json;" -d '{"name":"Psyky"}' http://localhost:8080/aphrbe/employee 
echo ""
curl -X GET http://localhost:8080/aphrbe/employee/1
echo ""
curl -X PUT -H "Content-Type: application/json;" -d '{"id":1,"name":"Psyke"}' http://localhost:8080/aphrbe/employee 
echo ""
curl -X GET http://localhost:8080/aphrbe/employee/1
echo ""
curl -X POST -H "Content-Type: application/json;" -d '{"name":"Dady"}' http://localhost:8080/aphrbe/employee 
echo ""
curl -X GET http://localhost:8080/aphrbe/employee
echo ""

#Project
curl -X POST -H "Content-Type: application/json;" -d '{"name":"APHR"}' http://localhost:8080/aphrbe/project 
echo ""
curl -X GET http://localhost:8080/aphrbe/project/1
echo ""
curl -X PUT -H "Content-Type: application/json;" -d '{"id":1,"name":"APHRBE"}' http://localhost:8080/aphrbe/project 
echo ""
curl -X GET http://localhost:8080/aphrbe/project/1
echo ""
curl -X POST -H "Content-Type: application/json;" -d '{"name":"APHRFE"}' http://localhost:8080/aphrbe/project 
echo ""
curl -X GET http://localhost:8080/aphrbe/project


#Report

curl -X POST -H "Content-Type: application/json;" -d '{"employee":1,"project":1,"date":"2023-07-01T09:00","hours":4}' http://localhost:8080/aphrbe/report 
echo ""
curl -X GET http://localhost:8080/aphrbe/report/1
echo ""
curl -X PUT -H "Content-Type: application/json;" -d '{"id":1,"name":"APHRBE"}' http://localhost:8080/aphrbe/report 
echo ""
curl -X GET http://localhost:8080/aphrbe/report/1
echo ""
curl -X POST -H "Content-Type: application/json;" -d '{"employee":2,"project":1,"date":"2023-07-02T09:00","hours":8}' http://localhost:8080/aphrbe/report 
echo ""
curl -X POST -H "Content-Type: application/json;" -d '{"employee":1,"project":2,"date":"2023-07-02T09:00","hours":4}' http://localhost:8080/aphrbe/report 
echo ""
curl -X GET http://localhost:8080/aphrbe/report
echo ""
curl -X GET http://localhost:8080/aphrbe/report

#Delete
curl -X DELETE http://localhost:8080/aphrbe/employee/1
echo ""
curl -X DELETE http://localhost:8080/aphrbe/employee/2
echo ""
curl -X DELETE http://localhost:8080/aphrbe/project/1
echo ""
curl -X DELETE http://localhost:8080/aphrbe/project/2
echo ""
curl -X DELETE http://localhost:8080/aphrbe/report/1
echo ""
curl -X DELETE http://localhost:8080/aphrbe/report/2
echo ""
curl -X DELETE http://localhost:8080/aphrbe/report/3
echo ""
curl -X GET http://localhost:8080/aphrbe/employee
echo ""
curl -X GET http://localhost:8080/aphrbe/project
echo ""
