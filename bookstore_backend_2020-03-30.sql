# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.19)
# Database: bookstore_backend
# Generation Time: 2020-03-30 14:04:39 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table BOOK
# ------------------------------------------------------------

DROP TABLE IF EXISTS `BOOK`;

CREATE TABLE `BOOK` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL DEFAULT '',
  `cover` varchar(255) NOT NULL DEFAULT '',
  `author` varchar(255) NOT NULL DEFAULT '',
  `publishdate` varchar(255) NOT NULL DEFAULT '',
  `press` varchar(255) NOT NULL DEFAULT '',
  `abs` varchar(255) NOT NULL DEFAULT '',
  `price` int(11) NOT NULL DEFAULT '999',
  `cid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cid` (`cid`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `CATEGORY` (`cid`) ON DELETE SET NULL ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `BOOK` WRITE;
/*!40000 ALTER TABLE `BOOK` DISABLE KEYS */;

INSERT INTO `BOOK` (`id`, `title`, `cover`, `author`, `publishdate`, `press`, `abs`, `price`, `cid`)
VALUES
	(1,'三体','https://i.loli.net/2019/04/10/5cada7e73d601.jpg','刘慈欣','2019-05-05','重庆出版社','文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……',25,1),
	(2,'三体','https://i.loli.net/2019/04/10/5cada7e73d601.jpg','刘慈欣','2019-05-05','重庆出版社','文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……',25,2),
	(3,'三体','https://i.loli.net/2019/04/10/5cada7e73d601.jpg','刘慈欣','2019-05-05','重庆出版社','文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……',25,3),
	(4,'三体','https://i.loli.net/2019/04/10/5cada7e73d601.jpg','刘慈欣','2019-05-05','重庆出版社','文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……',25,4),
	(5,'四体','https://i.loli.net/2019/04/10/5cada7e73d601.jpg','刘慈欣','2019-05-08','重庆出版社','文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……',0,5),
	(6,'三体','https://i.loli.net/2019/04/10/5cada7e73d601.jpg','刘慈欣','2019-05-05','重庆出版社','文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……',25,6),
	(7,'三体','https://i.loli.net/2019/04/10/5cada7e73d601.jpg','刘慈欣','2019-05-05','重庆出版社','文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……',25,7),
	(8,'三体','https://i.loli.net/2019/04/10/5cada7e73d601.jpg','刘慈欣','2019-05-05','重庆出版社','文化大革命如火如荼进行的同时。军方探寻外星文明的绝秘计划“红岸工程”取得了突破性进展。但在按下发射键的那一刻，历经劫难的叶文洁没有意识到，她彻底改变了人类的命运。地球文明向宇宙发出的第一声啼鸣，以太阳为中心，以光速向宇宙深处飞驰……',25,8),
	(10,'1','1','1','1','1','1',0,9);

/*!40000 ALTER TABLE `BOOK` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table CART
# ------------------------------------------------------------

DROP TABLE IF EXISTS `CART`;

CREATE TABLE `CART` (
  `cartid` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `bookid` int(11) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT '',
  `price` int(11) DEFAULT NULL,
  PRIMARY KEY (`cartid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `CART` WRITE;
/*!40000 ALTER TABLE `CART` DISABLE KEYS */;

INSERT INTO `CART` (`cartid`, `uid`, `bookid`, `number`, `title`, `price`)
VALUES
	(1,2,3,7,'',0),
	(2,2,1,5,'',0),
	(3,4,1,6,'',0),
	(4,NULL,NULL,16,'',25),
	(5,NULL,NULL,16,'',25),
	(6,NULL,NULL,3,'',25),
	(7,NULL,NULL,47,'',25);

/*!40000 ALTER TABLE `CART` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table CATEGORY
# ------------------------------------------------------------

DROP TABLE IF EXISTS `CATEGORY`;

CREATE TABLE `CATEGORY` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `CATEGORY` WRITE;
/*!40000 ALTER TABLE `CATEGORY` DISABLE KEYS */;

INSERT INTO `CATEGORY` (`cid`, `cname`)
VALUES
	(1,'童书'),
	(2,'科技'),
	(3,'文学'),
	(4,'教辅'),
	(5,'艺术'),
	(6,'社科'),
	(7,'金融'),
	(8,'生活'),
	(9,'');

/*!40000 ALTER TABLE `CATEGORY` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table USER
# ------------------------------------------------------------

DROP TABLE IF EXISTS `USER`;

CREATE TABLE `USER` (
  `uid` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL DEFAULT '',
  `password` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `USER` WRITE;
/*!40000 ALTER TABLE `USER` DISABLE KEYS */;

INSERT INTO `USER` (`uid`, `username`, `password`)
VALUES
	(1,'test','123456'),
	(2,'www','111'),
	(3,'ciniki','chen1234'),
	(4,'test2','232323');

/*!40000 ALTER TABLE `USER` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
