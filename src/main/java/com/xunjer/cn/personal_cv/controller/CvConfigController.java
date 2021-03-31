package com.xunjer.cn.personal_cv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xunjer.cn.personal_cv.common.ResultModel;
import com.xunjer.cn.personal_cv.model.CvConfig;
import com.xunjer.cn.personal_cv.service.ICvConfigService;

/**
 * @author Thunisoft
 * @title CvConfigController
 * @date 2021/3/24 11:37
 * @tip Tomorrow after tomorrow. How many tomorrows would there be?
 */
@RestController
@RequestMapping("/config")
public class CvConfigController {

    @Autowired
    private ICvConfigService iCvConfigService;

    @GetMapping("/getAll")
    public ResultModel<List<CvConfig>> findAll(){
        return iCvConfigService.getCvConfigAll();
    }

    @GetMapping("/getByType")
    public ResultModel<List<CvConfig>> getByType(String type){
        return iCvConfigService.getCvConfig(type);
    }

    @GetMapping("/get")
    public ResultModel<String> get(){
        return new ResultModel<>("hjfesjfhsd");
    }
}
