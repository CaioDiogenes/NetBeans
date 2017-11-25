DROP SCHEMA IF EXISTS banco ;
CREATE SCHEMA IF NOT EXISTS banco DEFAULT CHARACTER SET utf8 ;
USE banco ;

DROP TABLE IF EXISTS banco.servicos ;
CREATE TABLE IF NOT EXISTS banco.servicos(
    `nome` VARCHAR(255),
    `preco` VARCHAR(50)
)

select * from servicos;
