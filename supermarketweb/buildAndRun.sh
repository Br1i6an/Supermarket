#!/bin/sh
mvn clean package && docker build -t co.edu.usta.tunja.web/supermarketweb .
docker rm -f supermarketweb || true && docker run -d -p 9080:9080 -p 9443:9443 --name supermarketweb co.edu.usta.tunja.web/supermarketweb