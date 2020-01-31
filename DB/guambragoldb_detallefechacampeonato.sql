CREATE DATABASE  IF NOT EXISTS `guambragoldb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `guambragoldb`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: guambragoldb
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `detallefechacampeonato`
--

DROP TABLE IF EXISTS `detallefechacampeonato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallefechacampeonato` (
  `idDetalleFechaCampeonao` int(11) NOT NULL AUTO_INCREMENT,
  `idCampeonato` int(11) NOT NULL,
  `idFechaPartido` int(11) NOT NULL,
  PRIMARY KEY (`idDetalleFechaCampeonao`),
  KEY `fkidcambios_idx` (`idCampeonato`),
  KEY `idfkfechapartido_idx` (`idFechaPartido`),
  CONSTRAINT `fkidcambios` FOREIGN KEY (`idCampeonato`) REFERENCES `campeonato` (`idCampeonato`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idfkfechapartido` FOREIGN KEY (`idFechaPartido`) REFERENCES `fechapartido` (`idFechaPartido`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallefechacampeonato`
--

LOCK TABLES `detallefechacampeonato` WRITE;
/*!40000 ALTER TABLE `detallefechacampeonato` DISABLE KEYS */;
/*!40000 ALTER TABLE `detallefechacampeonato` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-31 17:33:38
