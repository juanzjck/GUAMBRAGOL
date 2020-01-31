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
-- Table structure for table `tablaposiciones`
--

DROP TABLE IF EXISTS `tablaposiciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tablaposiciones` (
  `idTablaPosiciones` int(11) NOT NULL AUTO_INCREMENT,
  `idPartido` int(11) NOT NULL,
  `idEquipo` int(11) NOT NULL,
  `partidoGanar` int(11) NOT NULL,
  `partidosPerdidos` int(11) NOT NULL,
  `partidosEmpatados` int(11) NOT NULL,
  `golesAfavor` int(11) NOT NULL,
  `golesContra` int(11) NOT NULL,
  PRIMARY KEY (`idTablaPosiciones`),
  KEY `fkpartID_idx` (`idPartido`),
  KEY `fkidequipo_idx` (`idEquipo`),
  CONSTRAINT `fkidequipo` FOREIGN KEY (`idEquipo`) REFERENCES `club` (`idClub`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fkidpartido` FOREIGN KEY (`idPartido`) REFERENCES `partidos` (`idPartidos`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tablaposiciones`
--

LOCK TABLES `tablaposiciones` WRITE;
/*!40000 ALTER TABLE `tablaposiciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `tablaposiciones` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-31 17:33:40