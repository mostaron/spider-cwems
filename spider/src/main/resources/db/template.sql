DROP DATABASE neil;
CREATE DATABASE IF NOT EXISTS neil default charset utf8 COLLATE utf8_general_ci;
use neil;


-- ----------------------------
-- Table structure for t_chapter
-- ----------------------------
DROP TABLE IF EXISTS `t_chapter`;
CREATE TABLE `t_chapter` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `chapter_order` int(11) NOT NULL,
  `chapter_name` varchar(255) DEFAULT NULL,
  `content` text,
  PRIMARY KEY (`id`)
);

-- ----------------------------
-- Table structure for t_fiction
-- ----------------------------
DROP TABLE IF EXISTS `t_fiction`;
CREATE TABLE `t_fiction` (
  `name` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
);
