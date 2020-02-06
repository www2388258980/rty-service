/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : rty

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-09-11 15:32:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for enumeration
-- ----------------------------
DROP TABLE IF EXISTS `enumeration`;
CREATE TABLE `enumeration` (
  `ENUM_ID` varchar(20) NOT NULL,
  `ENUM_TYPE_ID` varchar(20) DEFAULT NULL,
  `ENUM_CODE` varchar(60) DEFAULT NULL,
  `SEQUENCE_ID` varchar(20) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `LAST_UPDATED_TX_STAMP` datetime DEFAULT NULL,
  `CREATED_STAMP` datetime DEFAULT NULL,
  `COMMENTS` varchar(4000) DEFAULT NULL,
  `ENUM_CODE_NUMBER` int(19) DEFAULT NULL,
  PRIMARY KEY (`ENUM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of enumeration
-- ----------------------------
INSERT INTO `enumeration` VALUES ('VPN_TYPE_00', 'VPN_CONNECT_TYPE', 'PUB_BOSS_C', '01', '公网-BOSS接入层', '2019-09-11 15:27:52', '2019-09-11 15:27:58', 'Y', null);
INSERT INTO `enumeration` VALUES ('VPN_TYPE_01', 'VPN_CONNECT_TYPE', 'PUB_BOSS_C', '02', '公网-BOSS访问层', '2019-09-11 15:28:43', '2019-09-11 15:28:49', 'Y', null);
INSERT INTO `enumeration` VALUES ('VPN_TYPE_02', 'VPN_CONNECT_TYPE', 'PUB_BOSS_C', '03', 'OA-BOSS接入层', '2019-09-11 15:29:22', '2019-09-11 15:29:28', 'Y', null);
