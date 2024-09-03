FROM ubuntu:latest
LABEL microservicehost="todo"
RUN apt update
RUN apt install nginx -y
RUN rm -rf /var/www/html/index.html
WORKDIR /var/www/html/
RUN mv todo6/*  .
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]