/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : fir

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2018-07-25 19:24:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rate
-- ----------------------------
DROP TABLE IF EXISTS `rate`;
CREATE TABLE `rate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `from` varchar(15) DEFAULT NULL,
  `to` varchar(15) DEFAULT NULL,
  `rate` varchar(15) DEFAULT NULL,
  `begin_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '0-有效；1-无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rate
-- ----------------------------
INSERT INTO `rate` VALUES ('1', 'USD', 'CNY', '6.00', '2018-07-24 20:00:11', '2018-08-24 20:01:03', '0');
INSERT INTO `rate` VALUES ('2', 'GBP', 'CNY', '8.91', '2018-07-24 20:02:18', '2018-08-24 20:02:21', '0');
INSERT INTO `rate` VALUES ('3', 'EUR', 'CNY', '7.94', '2018-07-24 20:03:04', '2018-08-24 20:03:09', '0');
INSERT INTO `rate` VALUES ('4', 'JPY', 'CNY', '0.06', '2018-07-24 20:04:14', '2018-08-24 20:04:18', '0');
INSERT INTO `rate` VALUES ('5', 'AUD', 'CNY', '0.86', '2018-07-24 20:06:06', '2018-08-24 20:06:08', '0');
INSERT INTO `rate` VALUES ('6', 'CNY', 'USD', '0.15', '2018-07-24 20:06:50', '2018-07-24 20:06:52', '0');
INSERT INTO `rate` VALUES ('7', 'CNY', 'GBP', '0.11', '2018-07-24 20:07:29', '2018-08-24 20:07:33', '0');
INSERT INTO `rate` VALUES ('8', 'CNY', 'EUR', '0.13', '2018-07-24 20:08:21', '2018-08-24 20:08:25', '0');
INSERT INTO `rate` VALUES ('9', 'CNY', 'JPY', '16.35', '2018-07-24 20:09:04', '2018-08-24 20:09:09', '0');
INSERT INTO `rate` VALUES ('10', 'CNY', 'AUD', '0.19', '2018-07-24 20:09:59', '2018-08-24 20:10:04', '0');
