/*
 Navicat Premium Data Transfer

 Source Server         : mysql_localhost
 Source Server Type    : MySQL
 Source Server Version : 100408
 Source Host           : localhost:3306
 Source Schema         : qldact

 Target Server Type    : MySQL
 Target Server Version : 100408
 File Encoding         : 65001

 Date: 02/07/2020 11:06:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for congviec
-- ----------------------------
DROP TABLE IF EXISTS `congviec`;
CREATE TABLE `congviec`  (
  `mada` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `stt` int(11) NOT NULL AUTO_INCREMENT,
  `ten_cong_viec` varchar(25) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`stt`, `mada`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of congviec
-- ----------------------------

-- ----------------------------
-- Table structure for dean
-- ----------------------------
DROP TABLE IF EXISTS `dean`;
CREATE TABLE `dean`  (
  `tenda` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `mada` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ddiem_da` varchar(25) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `phong` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`mada`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dean
-- ----------------------------

-- ----------------------------
-- Table structure for diadiem_phg
-- ----------------------------
DROP TABLE IF EXISTS `diadiem_phg`;
CREATE TABLE `diadiem_phg`  (
  `maphg` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `diadiem` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`maphg`, `diadiem`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of diadiem_phg
-- ----------------------------

-- ----------------------------
-- Table structure for nhanvien
-- ----------------------------
DROP TABLE IF EXISTS `nhanvien`;
CREATE TABLE `nhanvien`  (
  `honv` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tenlot` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `manv` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ngsinh` date NOT NULL,
  `diachi` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `phai` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `luong` float NOT NULL,
  `ma_nql` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `phg` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tennv` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`manv`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of nhanvien
-- ----------------------------
INSERT INTO `nhanvien` VALUES ('truong', 'trong', 'nv001', '2020-05-20', 'abc', 'nam', 3000, 'nv001', 'phg002', 'hieu');
INSERT INTO `nhanvien` VALUES ('Nguyễn', 'Hằng', 'nv003', '2020-05-18', 'kjsb v\n\ndf', 'nu', 10000000000, 'nv001', 'phg001', 'Nga');
INSERT INTO `nhanvien` VALUES ('abvnnn', '123', 'nv004', '2020-06-25', 'vv', 'nam', 808123, 'nv003', 'phg002', 'bbb');
INSERT INTO `nhanvien` VALUES ('nguyen', 'trong', 'nv005', '2020-07-22', 'bbb', 'nam', 100000, 'nv002', 'phg001', 'hieu');
INSERT INTO `nhanvien` VALUES ('tran', 'trung', 'nv006', '2020-07-17', 'cvv', 'nam', 8990000, 'nv002', 'phg002', 'hieu');

-- ----------------------------
-- Table structure for phancong
-- ----------------------------
DROP TABLE IF EXISTS `phancong`;
CREATE TABLE `phancong`  (
  `ma_nvien` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `mada` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `stt` int(11) NOT NULL,
  `thoigian` date NOT NULL,
  PRIMARY KEY (`stt`, `ma_nvien`, `mada`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of phancong
-- ----------------------------

-- ----------------------------
-- Table structure for phongban
-- ----------------------------
DROP TABLE IF EXISTS `phongban`;
CREATE TABLE `phongban`  (
  `tenphg` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `maphg` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `trphg` varchar(25) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ng_nhanchuc` date NOT NULL,
  PRIMARY KEY (`maphg`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of phongban
-- ----------------------------
INSERT INTO `phongban` VALUES ('phg 1', 'phg001', 'nv001', '0000-00-00');
INSERT INTO `phongban` VALUES ('phg2', 'phg002', 'nv001', '2000-01-01');

-- ----------------------------
-- Table structure for thannhan
-- ----------------------------
DROP TABLE IF EXISTS `thannhan`;
CREATE TABLE `thannhan`  (
  `ma_nvien` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tentn` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `phai` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `ngsinh` date NOT NULL,
  `quanhe` varchar(25) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ma_nvien`, `tentn`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of thannhan
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
