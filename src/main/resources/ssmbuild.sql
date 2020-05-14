/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : ssmbuild

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-05-14 17:38:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `bookID` int(11) NOT NULL AUTO_INCREMENT COMMENT '书ID',
  `bookName` varchar(255) NOT NULL COMMENT '书名',
  `bookCounts` int(11) NOT NULL COMMENT '数量',
  `detail` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`bookID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('1', 'Java', '1', '从入门到放弃');
INSERT INTO `books` VALUES ('2', 'MySQL', '10', '从删库到跑路');
INSERT INTO `books` VALUES ('3', 'Linux', '5', '从入门到进牢');
