package com.xunjer.cn.personal_cv.common;



import com.xunjer.cn.personal_cv.common.dictionary.Dictionary;

import lombok.Data;

/**
 * @author yuansheng
 * @Title: ReturnModel
 * @Description: 通用的返回类
 * @date 2020/7/115:01
 */
@Data
public class ResultModel<T> {

    private T returnValue;

    private Integer returnCode;

    private String message;

    public ResultModel(T returnValue) {
        this.returnValue = returnValue;
        this.message = "";
        this.returnCode = Dictionary.ReturnCode.Success.getKey();
    }

    public ResultModel(String  message) {
        this.message = message;
        this.returnCode = Dictionary.ReturnCode.Success.getKey();
    }

    public ResultModel(T returnValue, Integer returnCode) {
        this.returnValue = returnValue;
        this.message = "";
        this.returnCode = returnCode;
    }

    public ResultModel(T returnValue, Integer returnCode, String message) {
        this.returnValue = returnValue;
        this.message = message;
        this.returnCode = returnCode;
    }
}
