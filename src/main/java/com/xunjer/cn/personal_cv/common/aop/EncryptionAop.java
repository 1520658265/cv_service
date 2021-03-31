package com.xunjer.cn.personal_cv.common.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.xunjer.cn.personal_cv.common.CommonUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Thunisoft
 * @title EncryptionAop
 * @date 2021/3/26 17:29
 * @tip Tomorrow after tomorrow. How many tomorrows would there be?
 */
@Aspect
@Component
@Slf4j
public class EncryptionAop {

    @Pointcut("execution(* com.xunjer.cn.personal_cv.controller..*.*(..))")
    public void demoController(){

    }

    @Pointcut("@annotation(com.xunjer.cn.personal_cv.common.annotation.Encryption)")
    public void ann(){

    }


    @Around("ann()")
    public Object demo(final ProceedingJoinPoint point){
        long start = System.currentTimeMillis();
        //可以获得正在执行的方法+方法的参数
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        Method method = methodSignature.getMethod();
        Object[] args = point.getArgs();
        try {
            Object proceed = point.proceed();
            long end = System.currentTimeMillis();
            log.info("用时"+(end-start));
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return CommonUtil.NotAuth();
        }
    }
}
