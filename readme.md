1. Set the -**Dspring.profiles.active=prod** in VM options to run environment based yaml file
2. Health check endpoints
   http://localhost:8084/actuator/health
3. docker build -t my-spring-boot-app .
   <br> docker run -p 8084:8084 my-spring-boot-app
4. Different port mapping (8080:8083):

You can map a different port on your host machine to the container, e.g.:
docker run -p 8080:8083 my-spring-boot-app
In this case:
Access the app on http://localhost:8080 (host port).
Docker will forward the r  equest to 8083 inside the container.

The EXPOSE 8080 instruction in a Dockerfile is used to document that the container's application listens on port 8080. It serves as a signal to anyone running or interacting with the container, indicating which port the application inside the container expects to be accessed.

Detailed Explanation:
Documenting the Port:

The EXPOSE instruction does not publish or open the port to the host machine by itself.
It tells users of the image (or tools like Docker Compose) that the application inside the container is designed to listen on port 8080.

Summary: <br>
**EXPOSE 8080: A declaration in the Dockerfile to inform users that the application listens on port 8080. <br>
-p 8080:8080 (or --publish): Actually maps and exposes the port to the host machine for external access.**