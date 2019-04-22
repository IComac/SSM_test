# ************************************************************
# MySQL: 5.7
# Database: myblog
# Generation Time: 2019-04-13 11:24:33 +0000
# ************************************************************

# Dump of table SSM_mybatis
# -----------------------------------------------

DROP TABLE IF EXISTS `ssm_mybatis`;

CREATE TABLE `ssm_mybatis` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`name` varchar(30),
	PRIMARY KEY(id)
) DEFAULT CHARSET=utf8;

LOCK TABLES `ssm_mybatis` WRITE;

INSERT INTO `ssm_mybatis` (`id`, `name`)
VALUES
	(null, "category1"),
	(null, "category2"),
	(null, "category3"),
	(null, "category4"),
	(null, "category5");

UNLOCK TABLES;