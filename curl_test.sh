#!/bin/bash

# Employee
echo -e "\nAdd employee 1 Psyky"
curl -X POST -H "Content-Type: application/json;" -d '{"name":"Psyky"}' http://localhost:8080/aphrbe/employee 

echo -e "\nGet employee 1 Psyky"
curl -X GET http://localhost:8080/aphrbe/employee/1

echo -e "\nedit employee 1 Psyky into Psyke"
curl -X PUT -H "Content-Type: application/json;" -d '{"id":1,"name":"Psyke"}' http://localhost:8080/aphrbe/employee 

echo -e "\nget employee 1 Psyke"
curl -X GET http://localhost:8080/aphrbe/employee/1

echo -e "\nAdd employee 2 Dady"
curl -X POST -H "Content-Type: application/json;" -d '{"name":"Dady"}' http://localhost:8080/aphrbe/employee 

echo -e "\nGet all employee"
curl -X GET http://localhost:8080/aphrbe/employee


#Project
echo -e "\nAdd project 1 APHR"
curl -X POST -H "Content-Type: application/json;" -d '{"name":"APHR"}' http://localhost:8080/aphrbe/project 

echo -e "\nGet project 1 APHR"
curl -X GET http://localhost:8080/aphrbe/project/1

echo -e "\nEdit Project 1 APHR into APHRBE"
curl -X PUT -H "Content-Type: application/json;" -d '{"id":1,"name":"APHRBE"}' http://localhost:8080/aphrbe/project 

echo -e "\nGET project 1 APHRBE"
curl -X GET http://localhost:8080/aphrbe/project/1

echo -e "\nAdd project 2 APHRFE"
curl -X POST -H "Content-Type: application/json;" -d '{"name":"APHRFE"}' http://localhost:8080/aphrbe/project 

echo -e "\nGet all projects"
curl -X GET http://localhost:8080/aphrbe/project

#Report

echo -e "\nadd report e1 p1 20230701 0900 4hs"
curl -X POST -H "Content-Type: application/json;" -d '{"employee":1,"project":1,"date":"2023-07-01T09:00","hours":4}' http://localhost:8080/aphrbe/report 

echo -e "\nget report 1 = e1 p1 20230701 0900 4hs"
curl -X GET http://localhost:8080/aphrbe/report/1

echo -e "\nedit report 1 e1 p1 20230701 0900 4hs into e1 p1 20230701 0900 8hs"
curl -X PUT -H "Content-Type: application/json;" -d '{"id":1,"employee":1,"project":1,"date":"2023-07-01T09:00","hours":8}' http://localhost:8080/aphrbe/report 

echo -e "\nGet report 1 = e1 p1 20230701 0900 8hs"
curl -X GET http://localhost:8080/aphrbe/report/1

echo -e "\nadd report 2 e2 p1 20230702 0900 8hs"
curl -X POST -H "Content-Type: application/json;" -d '{"employee":2,"project":1,"date":"2023-07-02T09:00","hours":8}' http://localhost:8080/aphrbe/report 

echo -e "\nadd report 2 e1 p2 20230702 0900 4hs"
curl -X POST -H "Content-Type: application/json;" -d '{"employee":1,"project":2,"date":"2023-07-02T09:00","hours":4}' http://localhost:8080/aphrbe/report 

echo -e "\nGet all reports"
curl -X GET http://localhost:8080/aphrbe/report

echo -e "\nGet all reports groupby projects"
curl -X GET http://localhost:8080/aphrbe/report/projects

echo -e "\nGet all reports groupby projects and then employeers"
curl -X GET http://localhost:8080/aphrbe/report/projectsemployeer

echo -e "\nGet all reports groupby employeers"
curl -X GET http://localhost:8080/aphrbe/report/employeerprojectr

#Delete
#curl -X DELETE http://localhost:8080/aphrbe/employee/1
#echo ""
#curl -X DELETE http://localhost:8080/aphrbe/employee/2
#echo ""
#curl -X DELETE http://localhost:8080/aphrbe/project/1
#echo ""
#curl -X DELETE http://localhost:8080/aphrbe/project/2
#echo ""
#curl -X DELETE http://localhost:8080/aphrbe/report/1
#echo ""
#curl -X DELETE http://localhost:8080/aphrbe/report/2
#echo ""
#curl -X DELETE http://localhost:8080/aphrbe/report/3
#echo ""
#curl -X GET http://localhost:8080/aphrbe/employee
#echo ""
#curl -X GET http://localhost:8080/aphrbe/project
#echo ""
