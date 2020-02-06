/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : rty

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-09-11 14:49:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for vpn_dial_record
-- ----------------------------
DROP TABLE IF EXISTS `vpn_dial_record`;
CREATE TABLE `vpn_dial_record` (
  `VPN_DIAL_RECORD_ID` varchar(20) NOT NULL,
  `FIRST_NAME` varchar(100) DEFAULT NULL,
  `VPN_DIAL_CAUSE` varchar(4000) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `DIAL_DATE` datetime DEFAULT NULL,
  `CREATED_DATE` datetime DEFAULT NULL,
  `LAST_UPDATED_STAMP` datetime DEFAULT NULL,
  `CREATED_STAMP` datetime DEFAULT NULL,
  `CREATED_BY_USER_LOGIN` varchar(255) DEFAULT NULL,
  `TELECOM_NUMBER` varchar(20) DEFAULT NULL,
  `DEPARTMENT_ID` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`VPN_DIAL_RECORD_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
