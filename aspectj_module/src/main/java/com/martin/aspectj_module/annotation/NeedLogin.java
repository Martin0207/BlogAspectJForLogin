package com.martin.aspectj_module.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : martin
 * @date : 2018/9/6
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NeedLogin {

    /**
     * 展示Dialog提示登录
     */
    int SHOW_DIALOG = 0;

    /**
     * 弹出吐司提示登录
     */
    int SHOW_TOAST = 1;

    /**
     * 没有响应
     */
    int NO_RESPONSE = 2;

    /**
     * 提示类型
     */
    int tipType() default SHOW_TOAST;

    /**
     * 登录Activity
     */
    Class<?> loginActivity();

    String tipToast() default "当前尚未登录，请先登录";

    String tipDialog() default "当前尚未登录，是否前往登录？";


}
