package com.wdcloud.okhttpinterceptor;

/**
 * Info:
 * Created by Umbrella.
 * CreateTime: 2020/11/12 15:50
 */

public class OkBean {
    private String requsetStr;
    private String firstStr;
    private String sencondStr;
    private String thirdStr;

    public OkBean(String requsetStr, String firstStr, String sencondStr, String thirdStr) {
        this.requsetStr = requsetStr;
        this.firstStr = firstStr;
        this.sencondStr = sencondStr;
        this.thirdStr = thirdStr;
    }

    @Override
    public String toString() {
        return "OkBean{" +
                "requsetStr='" + requsetStr + '\'' +
                ", firstStr='" + firstStr + '\'' +
                ", sencondStr='" + sencondStr + '\'' +
                ", thirdStr='" + thirdStr + '\'' +
                '}';
    }

    public OkBean(String requsetStr) {
        this.requsetStr = requsetStr;
    }

    public String getRequsetStr() {
        return requsetStr == null ? "" : requsetStr;
    }

    public void setRequsetStr(String requsetStr) {
        this.requsetStr = requsetStr == null ? "" : requsetStr;
    }

    public String getFirstStr() {
        return firstStr == null ? "" : firstStr;
    }

    public void setFirstStr(String firstStr) {
        this.firstStr = firstStr == null ? "" : firstStr;
    }

    public String getSencondStr() {
        return sencondStr == null ? "" : sencondStr;
    }

    public void setSencondStr(String sencondStr) {
        this.sencondStr = sencondStr == null ? "" : sencondStr;
    }

    public String getThirdStr() {
        return thirdStr == null ? "" : thirdStr;
    }

    public void setThirdStr(String thirdStr) {
        this.thirdStr = thirdStr == null ? "" : thirdStr;
    }
}
