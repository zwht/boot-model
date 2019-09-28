/*
 Navicat Premium Data Transfer

 Source Server         : localhost-密码：123456
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : workflow

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 12/05/2019 20:27:27
*/


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cm_code
-- ----------------------------
DROP TABLE IF EXISTS `cm_code`;
CREATE TABLE `cm_code` (
  `id` bigint(20) NOT NULL,
  `value` smallint(6) NOT NULL COMMENT '码值',
  `group_id` bigint(20) NOT NULL COMMENT '分组ID',
  `name` varchar(20) NOT NULL COMMENT '码值描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of cm_code
-- ----------------------------
BEGIN;
INSERT INTO `cm_code` VALUES (273970016683167744, 100, 273239076856008704, '公司管理员');
INSERT INTO `cm_code` VALUES (273970300419444736, 101, 273239076856008704, '销售');
INSERT INTO `cm_code` VALUES (273970374650236928, 102, 273239076856008704, '经销商');
INSERT INTO `cm_code` VALUES (273970674022879232, 103, 273239076856008704, '财务');
INSERT INTO `cm_code` VALUES (273975319248113664, 104, 273239076856008704, '仓库管理');
INSERT INTO `cm_code` VALUES (273975697893101568, 105, 273239076856008704, '生产管理');
INSERT INTO `cm_code` VALUES (273975693893101568, 106, 273239076856008704, '生产工人');
INSERT INTO `cm_code` VALUES (273975697893101569, 107, 273239076856008704, '制单');
INSERT INTO `cm_code` VALUES (273975697893101567, 108, 273239076856008704, '运输');

INSERT INTO `cm_code` VALUES (274250166805073920, 201, 273239464485195776, '订单系统');
INSERT INTO `cm_code` VALUES (274250255703347200, 202, 273239464485195776, '生产管理系统');
INSERT INTO `cm_code` VALUES (274250407117721600, 203, 273239464485195776, '财务系统');
INSERT INTO `cm_code` VALUES (274250524184940544, 204, 273239464485195776, '仓库管理系统');
INSERT INTO `cm_code` VALUES (274250748047527936, 205, 273239464485195776, '任务追溯系统');
INSERT INTO `cm_code` VALUES (274257530920767488, 1101, 274257342596517888, '起用中');
INSERT INTO `cm_code` VALUES (274257652740132864, 1102, 274257342596517888, '禁用中');
INSERT INTO `cm_code` VALUES (274258689769213952, 1001, 274257288099926016, '起用中');
INSERT INTO `cm_code` VALUES (274258818551123968, 1002, 274257288099926016, '禁用中');
INSERT INTO `cm_code` VALUES (286122093509218304, 1201, 286121853485977600, '使用中');
INSERT INTO `cm_code` VALUES (286122167677095936, 1202, 286121853485977600, '禁用中');
INSERT INTO `cm_code` VALUES (291175793030205440, 1401, 291175579326222336, '使用中');
INSERT INTO `cm_code` VALUES (291175917697503232, 1402, 291175579326222336, '禁用中');
INSERT INTO `cm_code` VALUES (291996779824680960, 1301, 291996688304967680, '门');
INSERT INTO `cm_code` VALUES (291996888528457728, 1302, 291996688304967680, '门套');
INSERT INTO `cm_code` VALUES (292087903306256384, 1350, 291996688304967680, '颜色');
INSERT INTO `cm_code` VALUES (292087983421657088, 1360, 291996688304967680, '材质');
INSERT INTO `cm_code` VALUES (325046853924163584, 1500, 325046429502541824, '抄稿');
INSERT INTO `cm_code` VALUES (325046949638180864, 1503, 325046429502541824, '待审核');
INSERT INTO `cm_code` VALUES (325047203456487424, 1505, 325046429502541824, '已驳回');
INSERT INTO `cm_code` VALUES (325047505077276672, 1507, 325046429502541824, '待生产');
INSERT INTO `cm_code` VALUES (325047619300757504, 1510, 325046429502541824, '前工序生产中');
INSERT INTO `cm_code` VALUES (325047698577297408, 1513, 325046429502541824, '后工序生产中');
INSERT INTO `cm_code` VALUES (325047821218746368, 1516, 325046429502541824, '生产完成');
INSERT INTO `cm_code` VALUES (325047880782057472, 1519, 325046429502541824, '已发货');
INSERT INTO `cm_code` VALUES (325047880782057473, 1529, 325046429502541824, '已完成');
INSERT INTO `cm_code` VALUES (325048078799343616, 1601, 325046560436129792, '待生产');
INSERT INTO `cm_code` VALUES (325048159346757632, 1602, 325046560436129792, '生产完成');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
