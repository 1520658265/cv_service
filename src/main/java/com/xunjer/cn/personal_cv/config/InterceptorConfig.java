package com.xunjer.cn.personal_cv.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.xunjer.cn.personal_cv.common.CacheConstant;
import com.xunjer.cn.personal_cv.common.CommonUtil;
import com.xunjer.cn.personal_cv.common.ResultModel;
import com.xunjer.cn.personal_cv.common.annotation.Encryption;

import lombok.extern.slf4j.Slf4j;

import static org.springframework.boot.context.properties.source.ConfigurationPropertyName.isValid;

/**
 * @author Thunisoft
 * @title AliInterceptorConfig
 * @date 2021/3/12 14:37
 * @tip Tomorrow after tomorrow. How many tomorrows would there be?
 */
@Configuration
@Slf4j
public class InterceptorConfig implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler instanceof HandlerMethod){
            Encryption annotation = ((HandlerMethod) handler).getMethod().getDeclaringClass().getAnnotation(Encryption.class);
            if(annotation!=null){
                String linen = request.getHeader(CacheConstant.authKey);
                log.info("当前接口特殊字段==========>" + linen);
                if ( isValid(linen)) {
                    return true;
                }
                returnJson(response, CommonUtil.NotIllegal());
            }
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }

    /**
     * 返回拦截器拦截信息
     *
     * @param response
     * @param resultModel
     */
    private void returnJson(HttpServletResponse response, ResultModel resultModel) {
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        response.setStatus(HttpStatus.NON_AUTHORITATIVE_INFORMATION.value());
        try {
            writer = response.getWriter();
            writer.print(JSONObject.toJSONString(resultModel));

        } catch (IOException e) {
            log.error("response error", e);
        } finally {
            if (writer != null)
                writer.close();
        }
    }


}
