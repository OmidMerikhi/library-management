CREATE TABLE `book`
(
    id                INT NOT NULL AUTO_INCREMENT,
    title             VARCHAR(100) NULL,
    writer            VARCHAR(100) NULL,
    warehouse_address VARCHAR(100) NULL,
    count             INT NULL,
    PRIMARY KEY (`id`)
);