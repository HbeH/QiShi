SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `car_owner` 登录用户的唯一标示
-- ----------------------------
DROP TABLE IF EXISTS `tt_user`;
CREATE TABLE `tt_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `userId` varchar(100) NOT NULL DEFAULT '' COMMENT '随机用户号',
  `phone` varchar(13) NOT NULL DEFAULT '' COMMENT '手机号码',
  `createDate` varchar(30) NOT NULL DEFAULT '',
  `updateDate` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;