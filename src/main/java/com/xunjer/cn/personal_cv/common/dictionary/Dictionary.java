package com.xunjer.cn.personal_cv.common.dictionary;

/**
 * @author yuansheng
 * @Title: Dictionary
 * @Description: 通用字典
 * @date 2020/7/115:04
 */
public class Dictionary {

    public static enum ReturnCode {
        Success(2000),
        Error(5000),
        Unknown(1000),
        UnAuth(6000),
        UnLogin(7000),
        Illegal(3000),
        NotFound(4000);

        private int key;

        private ReturnCode(final int key) {
            this.key = key;
        }

        public Integer getKey() {
            return this.key;
        }
    }

    /**
     * 进行状态
     */
    public static enum TaskState {
        NotStart(0, "未开始"),
        Working(1, "进行中"),
        NotFinish(2, "未完成"),
        Finished(3, "完成");

        private int key;

        private String desc;

        private TaskState(final int key, String desc) {
            this.key = key;
            this.desc = desc;
        }

        public Integer getKey() {
            return this.key;
        }
    }

    /**
     * 多媒体类型
     */
    public static enum MediaType {
        Image(1, "图片"),
        Audio(2, "音频"),
        Video(3, "视频"),
        Other(4, "其它");

        private int key;
        private String desc;

        private MediaType(int key, String desc) {
            this.key = key;
            this.desc = desc;
        }
    }
}
