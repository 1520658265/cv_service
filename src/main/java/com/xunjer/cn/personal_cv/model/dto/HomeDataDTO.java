package com.xunjer.cn.personal_cv.model.dto;

import java.util.List;

import lombok.Data;

/**
 * @author Thunisoft
 * @title HomeDataDTO
 * @date 2021/3/26 17:24
 * @tip Tomorrow after tomorrow. How many tomorrows would there be?
 */
@Data
public class HomeDataDTO {

    private String icon;

    private List<String> desc;

    private List<String> images;
}
