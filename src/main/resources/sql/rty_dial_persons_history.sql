/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : rty

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2020-02-23 11:44:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rty_dial_persons_history
-- ----------------------------
DROP TABLE IF EXISTS `rty_dial_persons_history`;
CREATE TABLE `rty_dial_persons_history` (
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
  KEY `DIAL_PERSON_ID` (`DIAL_PERSON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
