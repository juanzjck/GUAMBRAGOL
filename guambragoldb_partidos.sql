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
-- Table structure for table `partidos`
--

DROP TABLE IF EXISTS `partidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partidos` (
  `idPartidos` int(11) NOT NULL AUTO_INCREMENT,
  `idFechaPartido` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `hora` int(11) NOT NULL,
  `idCancha` int(11) NOT NULL,
  `idClubLocal` int(11) NOT NULL,
  `idClubVisitante` int(11) NOT NULL,
  `categoria` varchar(45) NOT NULL,
  `golesLocal` int(11) NOT NULL,
  `golesVisitante` int(11) NOT NULL,
  `idArbitro` int(11) NOT NULL,
  PRIMARY KEY (`idPartidos`),
  KEY `fkIDclubLocal_idx` (`idClubLocal`),
  KEY `fkidarbitro_idx` (`idArbitro`),
  KEY `idfkcancha_idx` (`idCancha`),
  KEY `idfkvisitante_idx` (`idClubVisitante`),
  KEY `idfkfechaparti_idx` (`idFechaPartido`),
  CONSTRAINT `fkidarbitro` FOREIGN KEY (`idArbitro`) REFERENCES `arbitro` (`idArbitro`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fkidlocal` FOREIGN KEY (`idClubLocal`) REFERENCES `club` (`idClub`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idfkcancha` FOREIGN KEY (`idCancha`) REFERENCES `cancha` (`idCancha`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idfkfechaparti` FOREIGN KEY (`idFechaPartido`) REFERENCES `fechapartido` (`idFechaPartido`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `idfkvisitante` FOREIGN KEY (`idClubVisitante`) REFERENCES `club` (`idClub`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partidos`
--

LOCK TABLES `partidos` WRITE;
/*!40000 ALTER TABLE `partidos` DISABLE KEYS */;
INSERT INTO `partidos` VALUES (1,1,'2020-01-10',23,9,1,1,'h',0,0,1);
/*!40000 ALTER TABLE `partidos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-31 17:24:22
