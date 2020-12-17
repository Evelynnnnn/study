package com.shilei.jpql.jpql.parse;

import java.lang.annotation.*;

import static com.shilei.jpql.jpql.parse.NameStrategy.UNDERSCORE_TO_CAMMELCASE;

/**
 * 用来表示此实体类绑定的对象名称转化策略
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Target(ElementType.TYPE)
public @interface NameMapping {
    NameStrategy value() default UNDERSCORE_TO_CAMMELCASE;
}