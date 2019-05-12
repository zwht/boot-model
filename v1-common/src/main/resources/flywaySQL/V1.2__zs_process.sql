/*
 Navicat Premium Data Transfer

 Source Server         : cfmy
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost
 Source Database       : cfmy1

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 01/23/2019 21:11:30 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `zs_process`
-- ----------------------------
DROP TABLE IF EXISTS `zs_process`;
CREATE TABLE `zs_process` (
  `id` varchar(45) NOT NULL,
  `gx_id` varchar(45) DEFAULT NULL,
  `user_id` varchar(45) DEFAULT NULL,
  `corporation_id` varchar(45) DEFAULT NULL,
  `price` int(4) DEFAULT NULL,
  `userPrice` int(4) DEFAULT NULL,
  `type` int(4) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `state` int(4) DEFAULT NULL,
  `product_id` varchar(45) DEFAULT NULL,
  `ticket_id` varchar(45) DEFAULT NULL,
  `flag` smallint(6) DEFAULT NULL COMMENT '逻辑删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
