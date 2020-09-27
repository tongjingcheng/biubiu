package com.jingcheng.oss.system.annotation;

import java.lang.annotation.*;

/**
 * @author tongjingcheng
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PermInfo {

    /**
     * 权限值
     * @return string
     */
    String pval() default "";

    /**
     * 权限名称
     * @return string
     */
    String value() default "";

}
