package com.xunjer.cn.personal_cv.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuansheng
 * @Title: PageData
 * @Description:
 * @date 2020/7/718:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageData<T> {

    private T data;

    private Integer page;

    private Integer row;

    private Integer total;
}
