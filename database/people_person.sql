-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: people
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `person` (
  `id` int NOT NULL AUTO_INCREMENT,
  `document_type_id` int NOT NULL,
  `document_number` varchar(20) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `birth_date` date NOT NULL,
  `phone` varchar(20) NOT NULL,
  `creation_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `document_type_id` (`document_type_id`),
  CONSTRAINT `person_ibfk_1` FOREIGN KEY (`document_type_id`) REFERENCES `documenttype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (15,5,'1010101','Carlos','Solorzano','Une, Cundinamarca','2019-12-15','3168765432','2023-03-03 15:34:06'),(16,8,'22222','Julian ','Rey','Bogota','2022-12-01','123','2023-03-03 15:35:47'),(17,5,'12345678','Adriana','Mora','Barranca','2023-03-02','31612345678','2023-03-03 15:40:06'),(18,7,'999999','Ivan','Pino','Bogotá','2000-02-01','3129999999','2023-03-03 19:28:03');
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-03 14:39:17
