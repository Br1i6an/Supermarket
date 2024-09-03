@echo off
call mvn clean package
call docker build -t co.edu.usta.tunja.web/supermarketweb .
call docker rm -f supermarketweb
call docker run -d -p 9080:9080 -p 9443:9443 --name supermarketweb co.edu.usta.tunja.web/supermarketweb