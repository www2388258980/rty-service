/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : rty

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2020-02-23 11:43:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rty_dial_persons
-- ----------------------------
DROP TABLE IF EXISTS `rty_dial_persons`;
CREATE TABLE `rty_dial_persons` (
  `DIAL_PERSON_ID` varchar(20) NOT NULL,
  `FIRST_NAME` varchar(100) DEFAULT NULL,
  `TELECOM_NUMBER` varchar(20) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `FIRST_CHAR` varchar(255) DEFAULT NULL,
  `DEPARTMENT_ID` varchar(20) DEFAULT NULL,
  `STATUS` varchar(255) DEFAULT NULL,
  `CREATED_BY` varchar(255) DEFAULT NULL,
  `MODIFIED_BY` varchar(255) DEFAULT NULL,
  `BILL_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_BILL_ID` varchar(255) DEFAULT NULL,
  `OP_TYPE` varchar(255) DEFAULT NULL,
  `EFFECTIVE_DATE` datetime DEFAULT NULL,
  `LAST_UPDATED_STAMP` datetime DEFAULT NULL,
  `CREATED_STAMP` datetime DEFAULT NULL,
  PRIMARY KEY (`DIAL_PERSON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
