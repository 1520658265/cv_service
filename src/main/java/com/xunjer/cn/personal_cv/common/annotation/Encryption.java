package com.xunjer.cn.personal_cv.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Thunisoft
 * @title Authority
 * @date 2021/3/26 17:27
 * @tip 是否需要加密
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.METHOD)
public @interface Encryption {
}
