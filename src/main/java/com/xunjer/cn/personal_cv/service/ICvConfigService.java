package com.xunjer.cn.personal_cv.service;

import java.util.List;

import com.xunjer.cn.personal_cv.common.ResultModel;
import com.xunjer.cn.personal_cv.model.CvConfig;

/**
 * @author Thunisoft
 * @title ICvConfigService
 * @date 2021/3/24 17:04
 * @tip Tomorrow after tomorrow. How many tomorrows would there be?
 */
public interface ICvConfigService {

    ResultModel<List<CvConfig>> getCvConfig(String type);

    ResultModel<List<CvConfig>> getCvConfigAll();

}
