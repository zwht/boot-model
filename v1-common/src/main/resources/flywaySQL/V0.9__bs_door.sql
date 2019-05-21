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

 Date: 12/05/2019 18:32:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bs_door
-- ----------------------------
DROP TABLE IF EXISTS `bs_door`;
CREATE TABLE `bs_door` (
  `id` bigint(20) NOT NULL,
  `name` varchar(45) NOT NULL,
  `img` varchar(245) DEFAULT NULL,
  `corporation_id` bigint(20) NOT NULL,
  `gx_ids` varchar(600) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `state` smallint(6) DEFAULT NULL,
  `gx_values` varchar(100) DEFAULT NULL,
  `number` varchar(50) NOT NULL,
  `colors` varchar(250) DEFAULT NULL,
  `info_id` bigint(20) DEFAULT NULL,
  `type` smallint(6) DEFAULT NULL,
  `flag` smallint(6) DEFAULT NULL COMMENT '逻辑删除',
  `arithmetic` varchar(600) DEFAULT NULL COMMENT '算法#%#间隔',
  `sum` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bs_door
-- ----------------------------
BEGIN;
INSERT INTO `bs_door` VALUES (325019283140775936, '门套', NULL, 274257007794589696, '286212849657843712,286212903428820992,286212949171900416,286212998249451520,286213045905133568,286213103362904064,286213469001355264,286213515331637248,286213588165726208,286213627218890752,286213689990844416,286213733473193984,286213779501486080,286213813966082048,286213868068409344,286213925287104512,286213987002093568,286214037161775104,286214151708217344', '2019-05-12 05:31:41', 1401, '1,1,3,2,2,2,3,2,2,3,3,2,3,3,2,12,3,3,23', '12', NULL, NULL, 1302, NULL, NULL, NULL);
INSERT INTO `bs_door` VALUES (325019336785924096, '门', NULL, 274257007794589696, '286212849657843712,286212903428820992,286212949171900416,286212998249451520,286213045905133568,286213103362904064,286213469001355264,286213515331637248,286213588165726208,286213627218890752,286213689990844416,286213733473193984,286213779501486080,286213813966082048,286213868068409344,286213925287104512,286213987002093568,286214037161775104,286214151708217344', '2019-05-12 05:31:54', 1401, '1,1,3,2,2,2,3,2,2,3,3,2,3,3,2,12,3,3,23', '123', NULL, NULL, 1301, NULL, NULL, NULL);
INSERT INTO `bs_door` VALUES (325019411935268864, '颜色', NULL, 274257007794589696, '', '2019-05-12 05:32:12', 1401, '', '123', NULL, NULL, 1350, NULL, NULL, NULL);
INSERT INTO `bs_door` VALUES (325019449059053568, '材质', NULL, 274257007794589696, '', '2019-05-12 05:32:21', 1401, '', '123', NULL, NULL, 1360, NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
