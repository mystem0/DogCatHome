/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : bank

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 07/05/2023 13:00:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cat
-- ----------------------------
DROP TABLE IF EXISTS `cat`;
CREATE TABLE `cat`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '索引',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名字',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '性别',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '描述',
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `variety` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品种',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cat
-- ----------------------------
INSERT INTO `cat` VALUES (1, '小美', '母', '温顺、友善、亲人', '', '英国短毛猫');
INSERT INTO `cat` VALUES (2, '小白', '公', '活泼好动，易训练，亲近主人', NULL, '美国短毛猫');
INSERT INTO `cat` VALUES (3, '花花', '母', '温和，安静，需要专业的护理，爱撒娇', NULL, '波斯猫');
INSERT INTO `cat` VALUES (4, '奥利弗', '公', '聪明，好动，亲人，喜欢玩耍', NULL, '俄罗斯蓝猫');
INSERT INTO `cat` VALUES (5, '吉米', '公', '精力旺盛，活泼好动，需要大量的运动量，爱与人互动', NULL, '孟加拉豹猫');
INSERT INTO `cat` VALUES (6, '阿尔法', '公', '聪明，活泼，需要大量的运动量，喜欢与主人互动', NULL, '薄荷猫');
INSERT INTO `cat` VALUES (7, '多多', '母', '友善，温顺，喜欢沉默，容易受到主人影响行为', NULL, '布偶猫');
INSERT INTO `cat` VALUES (8, '珍妮', '母', '聪明，好奇，伶俐，几乎没有毛发，爱和人互动', NULL, '埃及猫');
INSERT INTO `cat` VALUES (9, '铁锤', '公', '大而强壮，友善，喜欢与人互动，适合家庭', NULL, '缅因雪鞋猫');
INSERT INTO `cat` VALUES (10, '喵喵', '母', '活泼好动，不爱被拥抱，聪明好学，需要适度的运动', NULL, '金吉拉猫');

SET FOREIGN_KEY_CHECKS = 1;
