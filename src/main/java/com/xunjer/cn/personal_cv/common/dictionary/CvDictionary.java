package com.xunjer.cn.personal_cv.common.dictionary;

/**
 * @author Thunisoft
 * @title ConfigDictionary
 * @date 2021/3/16 16:39
 * @tip Tomorrow after tomorrow. How many tomorrows would there be?
 */
public class CvDictionary {

    /**
     * 配置类
     */
    public enum ConfigType {
        avatar("stinger", "头像"),
        stinger("stinger", "彩蛋");

        private String key;
        private String desc;

        ConfigType(final String key, final String desc) {
            this.key = key;
            this.desc = desc;
        }

        public String key() {
            return this.key;
        }

        public String desc() {
            return this.desc;
        }
    }
}
