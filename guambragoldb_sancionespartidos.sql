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
-- Table structure for table `sancionespartidos`
--

DROP TABLE IF EXISTS `sancionespartidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sancionespartidos` (
  `idSancionesPartidos` int(11) NOT NULL,
  `idPartido` int(11) NOT NULL,
  `idJugador` int(11) NOT NULL,
  `idSanciones` int(11) NOT NULL,
  PRIMARY KEY (`idSancionesPartidos`),
  KEY `IDFKJugador_idx` (`idJugador`),
  KEY `fkJugador_idx` (`idJugador`),
  KEY `idfkpartido_idx` (`idPartido`),
  KEY `fkpartido_idx` (`idPartido`),
  KEY `idfksansion_idx` (`idSanciones`),
  CONSTRAINT `fkpartido` FOREIGN KEY (`idPartido`) REFERENCES `partidos` (`idPartidos`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idfkjugador` FOREIGN KEY (`idJugador`) REFERENCES `jugador` (`idJugador`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idfksansion` FOREIGN KEY (`idSanciones`) REFERENCES `sanciones` (`idSanciones`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-31 17:30:49
