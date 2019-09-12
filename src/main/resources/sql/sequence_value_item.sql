/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : vpn

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-09-12 10:39:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sequence_value_item
-- ----------------------------
DROP TABLE IF EXISTS `sequence_value_item`;
CREATE TABLE `sequence_value_item` (
  `SEQ_NAME` varchar(60) NOT NULL,
  `SEQ_ID` int(19) DEFAULT NULL,
  `LAST_UPDATED_STAMP` datetime DEFAULT NULL,
  `LAST_UPDATED_TX_STAMP` datetime DEFAULT NULL,
  `CREATED_STAMP` datetime DEFAULT NULL,
  `CREATED_TX_STAMP` datetime DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sequence_value_item
-- ----------------------------
INSERT INTO `sequence_value_item` VALUES ('VpnDialPersons', '1', '2019-09-12 10:37:35', '2019-09-12 10:37:37', '2019-09-12 10:37:39', '2019-09-12 10:37:42');
INSERT INTO `sequence_value_item` VALUES ('VpnDialPersonsHistory', '1', '2019-09-12 10:38:16', '2019-09-12 10:38:19', '2019-09-12 10:38:21', '2019-09-12 10:38:22');
INSERT INTO `sequence_value_item` VALUES ('VpnDialRecord', '1', '2019-09-12 10:36:35', '2019-09-12 10:36:38', '2019-09-12 10:36:41', '2019-09-12 10:36:44');
INSERT INTO `sequence_value_item` VALUES ('VpnOADialPersons', '1', '2019-09-12 10:38:33', '2019-09-12 10:38:35', '2019-09-12 10:38:37', '2019-09-12 10:38:39');
INSERT INTO `sequence_value_item` VALUES ('VpnOADialPersonsHistory', '1', '2019-09-12 10:38:49', '2019-09-12 10:38:51', '2019-09-12 10:38:53', '2019-09-12 10:38:55');
