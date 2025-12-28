#FROM mysql:8.0
#
#COPY init.sql /docker-entrypoint-initdb.d/
#
#EXPOSE 3306

FROM mysql:8.0

ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=ecommerce_db
ENV MYSQL_USER=ecommerce_user
ENV MYSQL_PASSWORD=ecommerce_user

COPY init.sql /docker-entrypoint-initdb.d/

EXPOSE 3306
