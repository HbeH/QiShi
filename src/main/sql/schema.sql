SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- 用户表
-- ----------------------------
DROP TABLE IF EXISTS `tt_user`;
CREATE TABLE `tt_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `tt` varchar(10) NOT NULL DEFAULT '' COMMENT 'tt随机码',
  `performance` varchar(10) NOT NULL DEFAULT '' COMMENT '履约值',
  `phone` varchar(13) NOT NULL DEFAULT '' COMMENT '手机号码',
  `avatar` varchar(200) NOT NULL DEFAULT '' COMMENT '头像',
  `createDate` varchar(30) NOT NULL DEFAULT '',
  `updateDate` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;



SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- 信息认证表
-- ----------------------------
DROP TABLE IF EXISTS `tt_authentification`;
CREATE TABLE `tt_authentification` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '',
  `userId` varchar(10) NOT NULL DEFAULT '' COMMENT '用户id',
  `name` varchar(10) NOT NULL DEFAULT '' COMMENT '真实姓名',
  `sex` varchar(2) NOT NULL DEFAULT '' COMMENT '性别',
  `school` varchar(20) NOT NULL DEFAULT '' COMMENT '学校',
  `number` varchar(10) NOT NULL DEFAULT '' COMMENT '学号',
  `type` varchar(10) NOT NULL DEFAULT '' COMMENT '证件类型',
  `frontImg` varchar(200) NOT NULL DEFAULT '' COMMENT '身份证正面',
  `contraryImg` varchar(200) NOT NULL DEFAULT '' COMMENT '身份证反面',
  `createDate` varchar(30) NOT NULL DEFAULT '',
  `updateDate` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `userId` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;



SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- 优惠卷表
-- ----------------------------
DROP TABLE IF EXISTS `tt_coupon`;
CREATE TABLE `tt_coupon` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '',
  `userId` varchar(10) NOT NULL DEFAULT '' COMMENT '用户id',
  `type` varchar(10) NOT NULL DEFAULT '' COMMENT '优惠卷类型',
  `price` varchar(6) NOT NULL DEFAULT '' COMMENT '优惠卷价格',
  `status` varchar(2) NOT NULL DEFAULT '' COMMENT '优惠卷状态',
  `remaining` varchar(30) NOT NULL DEFAULT '' COMMENT '优惠卷剩余时间',
  `createDate` varchar(30) NOT NULL DEFAULT '',
  `updateDate` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- 收货地址
-- ----------------------------
DROP TABLE IF EXISTS `tt_receive`;
CREATE TABLE `tt_receive` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '',
  `userId` varchar(10) NOT NULL DEFAULT '' COMMENT '用户id',
  `name` varchar(10) NOT NULL DEFAULT '' COMMENT '收货名字',
  `sex` varchar(2) NOT NULL DEFAULT '' COMMENT '性别',
  `address` varchar(30) NOT NULL DEFAULT '' COMMENT '收货地址',
  `detail` varchar(30) NOT NULL DEFAULT '' COMMENT '详细地址',
  `phone` varchar(13) NOT NULL DEFAULT '' COMMENT '联系方式',
  `createDate` varchar(30) NOT NULL DEFAULT '',
  `updateDate` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;



SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- 订单表 帮我送 帮我取  帮我买
-- ----------------------------
DROP TABLE IF EXISTS `tt_type`;
CREATE TABLE `tt_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '',
  `name` varchar(10) NOT NULL DEFAULT '' COMMENT '快递 美食  文件 其他 零食 饮品 蛋糕 餐点',
  `price` varchar(10) NOT NULL DEFAULT '' COMMENT '不同类型的价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- 订单表 帮我送 帮我取  帮我买
-- ----------------------------
DROP TABLE IF EXISTS `tt_order`;
CREATE TABLE `tt_order` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '',
  `userId` varchar(10) NOT NULL DEFAULT '' COMMENT '用户id',
  `ttOrderId` varchar(10) NOT NULL DEFAULT '' COMMENT '订单编号',
  `ttTypeId` varchar(10) NOT NULL DEFAULT '' COMMENT 'tt_type 表里面的信息',
  `typeOrder` varchar(3) NOT NULL DEFAULT '' COMMENT '帮我取0 帮我送 1 帮我买 2',
  `getPhone` varchar(13) NOT NULL DEFAULT '' COMMENT '取货联系方式',
  `getAddress` varchar(30) NOT NULL DEFAULT '' COMMENT '取货地址',
  `getDetail` varchar(30) NOT NULL DEFAULT '' COMMENT '取货详细地址',
  `receivePhone` varchar(13) NOT NULL DEFAULT '' COMMENT '收货联系方式',
  `receiveAddress` varchar(30) NOT NULL DEFAULT '' COMMENT '收货地址',
  `receiveDetail` varchar(30) NOT NULL DEFAULT '' COMMENT '收货详细地址',
  `version` varchar(10) NOT NULL DEFAULT '' COMMENT '高并发',
  `createDate` varchar(30) NOT NULL DEFAULT '',
  `updateDate` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- 订单表确认地址信息后
-- ----------------------------
DROP TABLE IF EXISTS `tt_sure_order`;
CREATE TABLE `tt_sure_order` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '',
  `userId` varchar(10) NOT NULL DEFAULT '' COMMENT '用户id',
  `ttOrderId` varchar(10) NOT NULL DEFAULT '' COMMENT '订单编号',
  `ttCouponId` varchar(10) NOT NULL DEFAULT '' COMMENT '优惠卷id',
  `time` varchar(30) NOT NULL DEFAULT '' COMMENT '取货时间',
  `level` varchar(3) NOT NULL DEFAULT '' COMMENT '取货等级 立即 0 加急 1 预约 2',
  `remark` varchar(200) NOT NULL DEFAULT '' COMMENT '备注信息',
  `price` varchar(6) NOT NULL DEFAULT '' COMMENT '商品价格 到货后支付给骑士',
  `totalPrice` varchar(6) NOT NULL DEFAULT '' COMMENT '总费用',
  `status` varchar(2) NOT NULL DEFAULT '' COMMENT '订单状态 待接单  进行中',
  `createDate` varchar(30) NOT NULL DEFAULT '',
  `updateDate` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- 订单安排给骑士
-- ----------------------------
DROP TABLE IF EXISTS `tt_qi_order`;
CREATE TABLE `tt_qi_order` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '',
  `ttUserId` varchar(10) NOT NULL DEFAULT '' COMMENT 'tt用户id',
  `qiShiUserId` varchar(10) NOT NULL DEFAULT '' COMMENT '骑士用户id',
  `ttOrderId` varchar(10) NOT NULL DEFAULT '' COMMENT '订单编号',
  `speed` varchar(3) NOT NULL DEFAULT '' COMMENT '速度  1  2  3星',
  `serve` varchar(3) NOT NULL DEFAULT '' COMMENT '服务  1  2  3星',
  `additional` varchar(3) NOT NULL DEFAULT '' COMMENT '追评  1  2  3星',
  `message` varchar(100) NOT NULL DEFAULT '' COMMENT '留言',
  `createDate` varchar(30) NOT NULL DEFAULT '',
  `updateDate` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;