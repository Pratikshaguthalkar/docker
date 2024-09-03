FROM ubuntu:latest
LABEL microservicehost="indexpage"
RUN apt update 
RUN apt install apache2 unzip -y
RUN rm -rf /var/www/html/index.html
# RUN apt update
# RUN apt install nginx -y
# RUN rm -rf /var/www/html/index.html
WORKDIR /var/www/html/
COPY . .
EXPOSE 80
CMD ["apachectl", "-D", "FOREGROUND"]