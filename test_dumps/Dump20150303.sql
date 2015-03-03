-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: adaptation
-- ------------------------------------------------------
-- Server version	5.1.73-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adaptation_employee`
--

DROP TABLE IF EXISTS `adaptation_employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adaptation_employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `phone_numbers` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `skype` varchar(255) DEFAULT NULL,
  `working_directory` varchar(255) DEFAULT NULL,
  `birthday` bigint(20) DEFAULT NULL,
  `hired` bit(1) DEFAULT NULL,
  `instaff` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adaptation_employee`
--

LOCK TABLES `adaptation_employee` WRITE;
/*!40000 ALTER TABLE `adaptation_employee` DISABLE KEYS */;
INSERT INTO `adaptation_employee` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'Ім\'я1','Прізвище1','4','','qqq','','',0,'\0',''),(3,'Ім\'я3','Прізвище3','0','','ww@qq','','',0,'',''),(4,'Ім\'я5','Прізвище6','0','','','','',0,'','\0'),(5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'Ім\'я','Прізвище','0','','random','','',2015,'','\0'),(7,'Ім\'я10','Прізвище10','0','','mail','','',2015,'',''),(8,'Один','Два',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'Три','Чотири','1-2','','',NULL,NULL,567458,NULL,NULL);
/*!40000 ALTER TABLE `adaptation_employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `adaptation_episode`
--

DROP TABLE IF EXISTS `adaptation_episode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adaptation_episode` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `series_id` int(11) NOT NULL,
  `episode_number` int(11) DEFAULT NULL,
  `timing` int(11) DEFAULT NULL,
  `channel` varchar(255) DEFAULT NULL,
  `request_date` bigint(20) DEFAULT NULL,
  `demand_date` bigint(20) DEFAULT NULL,
  `air_date` bigint(20) DEFAULT NULL,
  `confirm_date` bigint(20) DEFAULT NULL,
  `confirmed_by` int(11) DEFAULT NULL,
  `ardome_name` varchar(255) DEFAULT NULL,
  `notes` varchar(1023) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_series_idx` (`series_id`),
  KEY `fk_ep_confirm_empl_idx` (`confirmed_by`),
  CONSTRAINT `fk_ep_confirm_empl` FOREIGN KEY (`confirmed_by`) REFERENCES `adaptation_employee` (`id`),
  CONSTRAINT `fk_ep_series` FOREIGN KEY (`series_id`) REFERENCES `adaptation_series` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adaptation_episode`
--

LOCK TABLES `adaptation_episode` WRITE;
/*!40000 ALTER TABLE `adaptation_episode` DISABLE KEYS */;
/*!40000 ALTER TABLE `adaptation_episode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `adaptation_series`
--

DROP TABLE IF EXISTS `adaptation_series`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adaptation_series` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `notes` varchar(1023) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adaptation_series`
--

LOCK TABLES `adaptation_series` WRITE;
/*!40000 ALTER TABLE `adaptation_series` DISABLE KEYS */;
/*!40000 ALTER TABLE `adaptation_series` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `adaptation_task`
--

DROP TABLE IF EXISTS `adaptation_task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adaptation_task` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adaptation_task`
--

LOCK TABLES `adaptation_task` WRITE;
/*!40000 ALTER TABLE `adaptation_task` DISABLE KEYS */;
/*!40000 ALTER TABLE `adaptation_task` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-03 17:19:31
