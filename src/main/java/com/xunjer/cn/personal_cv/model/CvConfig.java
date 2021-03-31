package com.xunjer.cn.personal_cv.model;

import lombok.Data;

/**
 * @author Thunisoft
 * @title CvConfig
 * @date 2021/3/24 10:52
 * @tip Tomorrow after tomorrow. How many tomorrows would there be?
 */
@Data
public class CvConfig {

    private Integer id;

    private String type;

    private String content;

    private String extend;

    private String remark;

    private Integer order;

    private Boolean enable;
}
