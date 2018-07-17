/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : db_hwc

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-07-14 16:54:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_ceshi
-- ----------------------------
DROP TABLE IF EXISTS `t_ceshi`;
CREATE TABLE `t_ceshi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `datatime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_ceshi
-- ----------------------------
INSERT INTO `t_ceshi` VALUES ('12', '2', 'lishi', '2018-07-14 16:42:49');
INSERT INTO `t_ceshi` VALUES ('13', '1', 'zhangsan', '2018-07-14 16:46:54');
INSERT INTO `t_ceshi` VALUES ('14', '2', 'lishi', '2018-07-14 16:50:30');
INSERT INTO `t_ceshi` VALUES ('15', '4', 'wangwu', '2018-07-14 16:53:31');

-- ----------------------------
-- Table structure for t_dati
-- ----------------------------
DROP TABLE IF EXISTS `t_dati`;
CREATE TABLE `t_dati` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(11) DEFAULT NULL,
  `flag` int(11) DEFAULT NULL,
  `csid` int(11) DEFAULT NULL,
  `dati` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=150 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dati
-- ----------------------------
INSERT INTO `t_dati` VALUES ('110', '1', '1', '12', '2');
INSERT INTO `t_dati` VALUES ('111', '7', '1', '12', '8');
INSERT INTO `t_dati` VALUES ('112', '8', '1', '12', '9');
INSERT INTO `t_dati` VALUES ('113', '4', '1', '12', '5');
INSERT INTO `t_dati` VALUES ('114', '5', '1', '12', '6');
INSERT INTO `t_dati` VALUES ('115', '10', '1', '12', '11');
INSERT INTO `t_dati` VALUES ('116', '11', '1', '12', '3');
INSERT INTO `t_dati` VALUES ('117', '2', '1', '12', '3');
INSERT INTO `t_dati` VALUES ('118', '6', '1', '12', '7');
INSERT INTO `t_dati` VALUES ('119', '9', '1', '12', '10');
INSERT INTO `t_dati` VALUES ('120', '12', '1', '13', '13');
INSERT INTO `t_dati` VALUES ('121', '9', '0', '13', '3');
INSERT INTO `t_dati` VALUES ('122', '7', '0', '13', '3');
INSERT INTO `t_dati` VALUES ('123', '4', '0', '13', '3');
INSERT INTO `t_dati` VALUES ('124', '10', '0', '13', '3');
INSERT INTO `t_dati` VALUES ('125', '2', '1', '13', '3');
INSERT INTO `t_dati` VALUES ('126', '11', '1', '13', '3');
INSERT INTO `t_dati` VALUES ('127', '8', '0', '13', '3');
INSERT INTO `t_dati` VALUES ('128', '6', '0', '13', '3');
INSERT INTO `t_dati` VALUES ('129', '5', '0', '13', '3');
INSERT INTO `t_dati` VALUES ('130', '5', '1', '14', '6');
INSERT INTO `t_dati` VALUES ('131', '11', '0', '14', '4');
INSERT INTO `t_dati` VALUES ('132', '8', '0', '14', '6');
INSERT INTO `t_dati` VALUES ('133', '6', '0', '14', '44');
INSERT INTO `t_dati` VALUES ('134', '2', '0', '14', '24');
INSERT INTO `t_dati` VALUES ('135', '10', '0', '14', '4');
INSERT INTO `t_dati` VALUES ('136', '12', '0', '14', '4');
INSERT INTO `t_dati` VALUES ('137', '7', '0', '14', '4');
INSERT INTO `t_dati` VALUES ('138', '1', '0', '14', '44');
INSERT INTO `t_dati` VALUES ('139', '9', '0', '14', '4');
INSERT INTO `t_dati` VALUES ('140', '6', '0', '15', '5');
INSERT INTO `t_dati` VALUES ('141', '5', '0', '15', '5');
INSERT INTO `t_dati` VALUES ('142', '8', '0', '15', '5');
INSERT INTO `t_dati` VALUES ('143', '11', '0', '15', '5');
INSERT INTO `t_dati` VALUES ('144', '1', '0', '15', '5');
INSERT INTO `t_dati` VALUES ('145', '4', '1', '15', '5');
INSERT INTO `t_dati` VALUES ('146', '2', '0', '15', '5');
INSERT INTO `t_dati` VALUES ('147', '7', '0', '15', '3');
INSERT INTO `t_dati` VALUES ('148', '12', '0', '15', '3');
INSERT INTO `t_dati` VALUES ('149', '10', '0', '15', '3');

-- ----------------------------
-- Table structure for t_shiti
-- ----------------------------
DROP TABLE IF EXISTS `t_shiti`;
CREATE TABLE `t_shiti` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `timu` varchar(255) DEFAULT NULL,
  `daan` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_shiti
-- ----------------------------
INSERT INTO `t_shiti` VALUES ('1', '1+1=', '2');
INSERT INTO `t_shiti` VALUES ('2', '1+2=', '3');
INSERT INTO `t_shiti` VALUES ('4', '1+4=', '5');
INSERT INTO `t_shiti` VALUES ('5', '1+5=', '6');
INSERT INTO `t_shiti` VALUES ('6', '1+6=', '7');
INSERT INTO `t_shiti` VALUES ('7', '1+7=', '8');
INSERT INTO `t_shiti` VALUES ('8', '1+8=', '9');
INSERT INTO `t_shiti` VALUES ('9', '1+9=', '10');
INSERT INTO `t_shiti` VALUES ('10', '1+10=', '11');
INSERT INTO `t_shiti` VALUES ('11', '2+1=', '3');
INSERT INTO `t_shiti` VALUES ('12', '1+12=', '13');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  `sex` varchar(40) DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'zhangsan', '123456', '男', '1');
INSERT INTO `t_user` VALUES ('2', 'lishi', '123456', '女', '1');
INSERT INTO `t_user` VALUES ('3', 'admin', '123456', '男', '2');
INSERT INTO `t_user` VALUES ('4', 'wangwu', '123456', '男', '1');
