package com.xunjer.cn.personal_cv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunjer.cn.personal_cv.common.ResultModel;
import com.xunjer.cn.personal_cv.mapper.CvConfigMapper;
import com.xunjer.cn.personal_cv.model.CvConfig;
import com.xunjer.cn.personal_cv.service.ICvConfigService;

/**
 * @author Thunisoft
 * @title CvConfigServiceImpl
 * @date 2021/3/24 17:06
 * @tip Tomorrow after tomorrow. How many tomorrows would there be?
 */
@Service
public class CvConfigServiceImpl implements ICvConfigService {

    @Autowired
    private CvConfigMapper cvConfigMapper;

    @Override
    public ResultModel<List<CvConfig>> getCvConfig(String type) {
        return new ResultModel<>(cvConfigMapper.selectByType(type));
    }

    @Override
    public ResultModel<List<CvConfig>> getCvConfigAll() {
        return new ResultModel<>(cvConfigMapper.selectAll());
    }
}
