/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : rty

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-09-11 14:44:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for vpn_dial_persons_history
-- ----------------------------
DROP TABLE IF EXISTS `vpn_dial_persons_history`;
CREATE TABLE `vpn_dial_persons_history` (
  `HISTORY_ID` varchar(20) NOT NULL,
  `DIAL_PERSON_ID` varchar(20) DEFAULT NULL,
  `OLD_FIRST_NAME` varchar(255) DEFAULT NULL,
  `OLD_TELECOM_NUMBER` varchar(255) DEFAULT NULL,
  `OLD_STATUS` varchar(255) DEFAULT NULL,
  `OLD_DESCRIPTION` varchar(255) DEFAULT NULL,
  `OLD_FIRST_CHAR` varchar(255) DEFAULT NULL,
  `OLD_DEPARTMENT_ID` varchar(255) DEFAULT NULL,
  `OLD_CREATED_BY` varchar(255) DEFAULT NULL,
  `OLD_MODIFIED_BY` varchar(255) DEFAULT NULL,
  `OLDBILL_ID` varchar(255) DEFAULT NULL,
  `OLD_MODIFIED_BILL_ID` varchar(255) DEFAULT NULL,
  `FIRST_NAME` varchar(255) DEFAULT NULL,
  `TELECOM_NUMBER` varchar(255) DEFAULT NULL,
  `STATUS` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `FIRST_CHAR` varchar(255) DEFAULT NULL,
  `DEPARTMENT_ID` varchar(255) DEFAULT NULL,
  `CREATED_BY` varchar(255) DEFAULT NULL,
  `MODIFIED_BY` varchar(255) DEFAULT NULL,
  `BILL_ID` varchar(255) DEFAULT NULL,
  `MODIFIED_BILL_ID` varchar(255) DEFAULT NULL,
  `OP_TYPE` varchar(255) DEFAULT NULL,
  `LAST_UPDATED_STAMP` datetime NOT NULL,
  `CREATED_STAMP` datetime DEFAULT NULL,
  `EFFECTIVE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`HISTORY_ID`),
  KEY `DIAL_PERSON_ID` (`DIAL_PERSON_ID`),
  CONSTRAINT `vpn_dial_persons_history_ibfk_1` FOREIGN KEY (`DIAL_PERSON_ID`) REFERENCES `vpn_dial_persons` (`DIAL_PERSON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
