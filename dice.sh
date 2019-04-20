#!/bin/sh

mvn clean package

#if [[ "$?" -ne 0 ]] ; then
#  echo 'Project compilation failed!'; exit $rc
#fi

java -jar target/dice-dc-0.0.0.1-jar-with-dependencies.jar
