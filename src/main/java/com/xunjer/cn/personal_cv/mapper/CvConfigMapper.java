package com.xunjer.cn.personal_cv.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xunjer.cn.personal_cv.model.CvConfig;

/**
 * @author Thunisoft
 * @title CvConfigMapper
 * @date 2021/3/24 10:59
 * @tip Tomorrow after tomorrow. How many tomorrows would there be?
 */
public interface CvConfigMapper {

    List<CvConfig> selectAll();

    List<CvConfig> selectByType(@Param("type") String type);

    int insert(CvConfig cvConfig);

    int countByType(@Param("type") String type);
}
