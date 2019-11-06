/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : vpn

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-09-11 15:32:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for common_rd_organization
-- ----------------------------
DROP TABLE IF EXISTS `common_rd_organization`;
CREATE TABLE `common_rd_organization` (
  `ID` varchar(64) NOT NULL,
  `NAME` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of common_rd_organization
-- ----------------------------
INSERT INTO `common_rd_organization` VALUES ('10032', '信息系统运营部');
INSERT INTO `common_rd_organization` VALUES ('9001', '基础设施维护部');
INSERT INTO `common_rd_organization` VALUES ('9007', '业务系统开发部');
INSERT INTO `common_rd_organization` VALUES ('9013', '运营管理部');
INSERT INTO `common_rd_organization` VALUES ('9014', '服务支撑部');
INSERT INTO `common_rd_organization` VALUES ('9015', '数据资产运营部信息系统运营部');
