package com.sparrow.protocol.enums;

public enum Platform {

    Unkonwn(-1, "Unkonwn"),
    iOS(0, "iOS"),
    Android(1, "Android"),

    ;


    private int platform;

    private String desc;

    Platform(int platform, String desc) {
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

    public static Platform getByPlatform(int platform) {
        if (platform == iOS.platform) {
            return iOS;
        } else if (platform == Android.platform) {
            return Android;
        } else {
            return Unkonwn;
        }
    }
}
