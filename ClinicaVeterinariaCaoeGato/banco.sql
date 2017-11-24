
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS banco ;
CREATE SCHEMA IF NOT EXISTS servicos DEFAULT CHARACTER SET utf8 ;
USE banco ;

DROP TABLE IF EXISTS banco.`servicos` ;
CREATE TABLE IF NOT EXISTS banco.`servicos` (
    `nome` VARCHAR(255) NOT NULL,
    `preco` INT NOT NULL,
    PRIMARY KEY (`nome`)
)  ENGINE=INNODB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
