/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : fir

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-07-25 19:24:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for convert
-- ----------------------------
DROP TABLE IF EXISTS `convert`;
CREATE TABLE `convert` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` varchar(15) NOT NULL,
  `rate` varchar(15) NOT NULL,
  `from` varchar(15) NOT NULL,
  `to` varchar(15) NOT NULL,
  `rate_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
