package com.sparrow.protocol.enums;

/**
 * @author zh_harry@163.com
 */
public enum PLATFORM {

    Unkonwn(-1, "Unkonwn"),
    iOS(1, "iOS"),
    Android(2, "Android"),
    PC(0, "PC");
    ;

    private int platform;

    private String desc;

    PLATFORM(int platform, String desc) {
        this.platform = platform;
        this.desc = desc;
    }

    public int getPlatform() {
        return platform;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Platform{" +
            "platform=" + platform +
            ", desc='" + desc + '\'' +
            '}';
    }

    public static PLATFORM getByPlatform(int platform) {
        if (platform == iOS.platform) {
            return iOS;
        } else if (platform == Android.platform) {
            return Android;
        } else {
            return Unkonwn;
        }
    }
}
