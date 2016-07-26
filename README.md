# izea-web-services

# Overview

This project contains an implementation for the [Izea Webservices Interview](https://github.com/IZEA/interview/tree/master/web_services), within it 
contains two different versions one using node.js and the other using dropwizard. Simple task of the server is to handle a request with a string and return it reversed.

## Dependencies
- docker
- java1.8 and maven for building the dropwizard project

# node.js
The node.js service is a simple implementation using the express module and the node:slim docker image.

## Building the Container
To build, run the docker build command from the node.js. This will pickup the dockerfile in the same working dir. 
```
cd ./node.js/
docker build -t <user>/<image-name> .
```
Make sure to give the image an appropriate tag with the `-t` optional such as `newhire/reverse-web-nodejs`.

The resulting image can be seen by running the images command.
```
docker images
```

## Run the Container
Once built, the container is ready to run.
```
docker run -p <localport>:8080 -d <image>
```
You will need to pick an open port on your host machine to forward on requests to the web server and '-d' lets docker know to detach and run the process in the background.
So an example would be: 
```
docker run -p 48080:8080 -d newhire/reverse-web-nodejs
```

Docker should return a id which can be seen by:
```
docker ps
```

## Query the Service   
Now that webserver is up, send a request by browsing to the following:
```
http://localhost:48080/reverse/<value> 
or 
curl -G http://localhost:48080/reverse/<value> 

```
The services is expecting a GET request @ reverse/value where the value is the string to be reversed.

## Stopping the Container
To stop:
```
docker stop <name/id>
```
