SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `arcoplan` ;
CREATE SCHEMA IF NOT EXISTS `arcoplan` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `arcoplan` ;

-- -----------------------------------------------------
-- Table `arcoplan`.`catalog`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `arcoplan`.`catalog` (
  `idcatalog` INT NOT NULL AUTO_INCREMENT,
  `numberOfEnvironment` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcatalog`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `arcoplan`.`environment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `arcoplan`.`environment` (
  `idenvironment` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `descriptionEnvironment` VARCHAR(45) NULL,
  `catalog_idcatalog1` INT NULL,
  PRIMARY KEY (`idenvironment`),
  INDEX `fk_environment_catalog1_idx` (`catalog_idcatalog1` ASC),
  CONSTRAINT `fk_environment_catalog1`
    FOREIGN KEY (`catalog_idcatalog1`)
    REFERENCES `arcoplan`.`catalog` (`idcatalog`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `arcoplan`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `arcoplan`.`product` (
  `idproduto` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `value` INT NULL,
  `description` VARCHAR(255) NULL,
  `manufacturingDate` DATE NULL,
  `environment_idenvironment` INT NULL,
  PRIMARY KEY (`idproduto`),
  INDEX `fk_product_environment1_idx` (`environment_idenvironment` ASC),
  CONSTRAINT `fk_product_environment1`
    FOREIGN KEY (`environment_idenvironment`)
    REFERENCES `arcoplan`.`environment` (`idenvironment`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `arcoplan`.`environment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `arcoplan`.`environment` (
  `idenvironment` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `descriptionEnvironment` VARCHAR(45) NULL,
  `catalog_idcatalog1` INT NULL,
  PRIMARY KEY (`idenvironment`),
  INDEX `fk_environment_catalog1_idx` (`catalog_idcatalog1` ASC),
  CONSTRAINT `fk_environment_catalog1`
    FOREIGN KEY (`catalog_idcatalog1`)
    REFERENCES `arcoplan`.`catalog` (`idcatalog`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `arcoplan`.`contact`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `arcoplan`.`contact` (
  `idcontact` INT NOT NULL AUTO_INCREMENT,
  `emailContact` VARCHAR(45) NOT NULL,
  `phoneContact` VARCHAR(45) NOT NULL,
  `typeAddressContact` VARCHAR(45) NOT NULL,
  `streetAddressContact` VARCHAR(45) NOT NULL,
  `numberAddressContact` VARCHAR(45) NOT NULL,
  `cepAddressContact` VARCHAR(45) NOT NULL,
  `cityAddressContact` VARCHAR(45) NOT NULL,
  `stateAddressContact` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcontact`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `arcoplan`.`juridicalClient`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `arcoplan`.`juridicalClient` (
  `idclient` INT NOT NULL AUTO_INCREMENT,
  `nameJuridicalClient` VARCHAR(45) NOT NULL,
  `ageJuridicalClient` INT NULL,
  `cnpjJuridicalClient` VARCHAR(45) NOT NULL,
  `genderJuridicalClient` CHAR NULL,
  `contact_idcontact` INT NOT NULL,
  PRIMARY KEY (`idclient`, `contact_idcontact`),
  INDEX `fk_juridicalClient_contact1_idx` (`contact_idcontact` ASC),
  CONSTRAINT `fk_juridicalClient_contact1`
    FOREIGN KEY (`contact_idcontact`)
    REFERENCES `arcoplan`.`contact` (`idcontact`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `arcoplan`.`physicalClient`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `arcoplan`.`physicalClient` (
  `idclient` INT NOT NULL AUTO_INCREMENT,
  `namePhysicalClient` VARCHAR(45) NOT NULL,
  `agePhysicalClient` INT NULL,
  `genderPhysicalClient` VARCHAR(45) NOT NULL,
  `cpfPhysicalClient` VARCHAR(45) NOT NULL,
  `contact_idcontact` INT NOT NULL,
  PRIMARY KEY (`idclient`, `contact_idcontact`),
  INDEX `fk_physicalClient_contact1_idx` (`contact_idcontact` ASC),
  CONSTRAINT `fk_physicalClient_contact1`
    FOREIGN KEY (`contact_idcontact`)
    REFERENCES `arcoplan`.`contact` (`idcontact`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `arcoplan`.`service`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `arcoplan`.`service` (
  `idservice` INT NOT NULL AUTO_INCREMENT,
  `typeService` VARCHAR(45) NULL,
  `catalog_idcatalog1` INT NOT NULL,
  `juridicalClient_idclient1` INT NOT NULL,
  `physicalClient_idclient1` INT NOT NULL,
  PRIMARY KEY (`idservice`, `catalog_idcatalog1`, `juridicalClient_idclient1`, `physicalClient_idclient1`),
  INDEX `fk_service_catalog2_idx` (`catalog_idcatalog1` ASC),
  INDEX `fk_service_juridicalClient2_idx` (`juridicalClient_idclient1` ASC),
  INDEX `fk_service_physicalClient2_idx` (`physicalClient_idclient1` ASC),
  CONSTRAINT `fk_service_catalog2`
    FOREIGN KEY (`catalog_idcatalog1`)
    REFERENCES `arcoplan`.`catalog` (`idcatalog`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_service_juridicalClient2`
    FOREIGN KEY (`juridicalClient_idclient1`)
    REFERENCES `arcoplan`.`juridicalClient` (`idclient`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_service_physicalClient2`
    FOREIGN KEY (`physicalClient_idclient1`)
    REFERENCES `arcoplan`.`physicalClient` (`idclient`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `arcoplan`.`maintenance`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `arcoplan`.`maintenance` (
  `idmaintenance` INT NOT NULL AUTO_INCREMENT,
  `dateMaintenance` DATE NOT NULL,
  `localMaintenance` VARCHAR(45) NULL,
  `valueMaintenance` DOUBLE NOT NULL,
  `service_idservice1` INT NOT NULL,
  `service_catalog_idcatalog1` INT NOT NULL,
  PRIMARY KEY (`idmaintenance`, `service_idservice1`, `service_catalog_idcatalog1`),
  INDEX `fk_maintenance_service2_idx` (`service_idservice1` ASC, `service_catalog_idcatalog1` ASC),
  CONSTRAINT `fk_maintenance_service2`
    FOREIGN KEY (`service_idservice1` , `service_catalog_idcatalog1`)
    REFERENCES `arcoplan`.`service` (`idservice` , `catalog_idcatalog1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `arcoplan`.`defect`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `arcoplan`.`defect` (
  `iddefect` INT NOT NULL AUTO_INCREMENT,
  `typeDefect` VARCHAR(45) NOT NULL,
  `dateDefect` VARCHAR(45) NULL,
  `descriptionDefect` VARCHAR(45) NOT NULL,
  `maintenance_idmaintenance1` INT NOT NULL,
  `maintenance_service_idservice1` INT NOT NULL,
  `maintenance_service_catalog_idcatalog1` INT NOT NULL,
  PRIMARY KEY (`iddefect`, `maintenance_idmaintenance1`, `maintenance_service_idservice1`, `maintenance_service_catalog_idcatalog1`),
  INDEX `fk_defect_maintenance2_idx` (`maintenance_idmaintenance1` ASC, `maintenance_service_idservice1` ASC, `maintenance_service_catalog_idcatalog1` ASC),
  CONSTRAINT `fk_defect_maintenance2`
    FOREIGN KEY (`maintenance_idmaintenance1` , `maintenance_service_idservice1` , `maintenance_service_catalog_idcatalog1`)
    REFERENCES `arcoplan`.`maintenance` (`idmaintenance` , `service_idservice1` , `service_catalog_idcatalog1`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
