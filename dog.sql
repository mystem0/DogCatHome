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

 Date: 07/05/2023 13:00:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dog
-- ----------------------------
DROP TABLE IF EXISTS `dog`;
CREATE TABLE `dog`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '索引',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名字',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '性别',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '描述',
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `variety` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品种',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dog
-- ----------------------------
INSERT INTO `dog` VALUES (3, '小黑', '公', '活泼，好学，聪明，易于训练，喜欢与人互动', NULL, '贵宾犬');
INSERT INTO `dog` VALUES (4, '小蕾', '母', '友好，温顺，喜欢与人互动，爱撒娇', NULL, '萨摩耶犬');
INSERT INTO `dog` VALUES (5, '约瑟夫', '公', '活泼，对运动有着强烈的热情，聪明，喜欢与人互动', NULL, '拉布拉多犬');
INSERT INTO `dog` VALUES (6, '细狗', '公', '聪明，活泼，亲人，很容易训练，需要大量的活动量和智力刺激', NULL, '边境牧羊犬');
INSERT INTO `dog` VALUES (7, '芭比', '母', '聪明，勇敢，忠诚，能够得到训练，很适合警用、导盲犬等工作', NULL, '德国牧羊犬');
INSERT INTO `dog` VALUES (8, '娜拉', '母', '温和，友好，耐心，适合陪伴老人和小孩', NULL, '纽芬兰犬');
INSERT INTO `dog` VALUES (9, '格雷', '公', '小巧玲珑，勇敢，好学，适合小型家庭生活', NULL, '约克夏犬');
INSERT INTO `dog` VALUES (10, '莉莉', '母', '小巧玲珑，聪明，忠诚，活泼好动，适合小型家庭生活', NULL, '泰迪犬');
INSERT INTO `dog` VALUES (11, '雷欧', '公', '独立，傲娇，聪明，需要高度的社交化训练，适合有主人经验的人', NULL, '松狮犬');
INSERT INTO `dog` VALUES (12, '宝宝', '母', '活泼，好动，聪明，爱和人互动，适合家庭生活', NULL, '博美犬');

SET FOREIGN_KEY_CHECKS = 1;
