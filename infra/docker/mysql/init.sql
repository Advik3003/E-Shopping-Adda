CREATE DATABASE IF NOT EXISTS product_db;

CREATE USER IF NOT EXISTS 'ecommerce_user'@'%' IDENTIFIED BY 'ecommerce_user';

GRANT ALL PRIVILEGES ON product_db.* TO 'ecommerce_user'@'%';

FLUSH PRIVILEGES;

