CREATE TABLE IF NOT EXISTS `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uuid` varchar(255) NULL,
  `username` varchar(255) NULL,
  `password` varchar(255) NULL,
  `last_login_time` datetime NULL,
  `register_time` datetime NULL,
  `vip` varchar(20) NULL,
  `st` char(1) NULL,
  `created_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `created_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updated_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `updated_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `version` bigint(20) NULL DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`id`)
);