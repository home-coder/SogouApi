package com.xiaolj.mylibrary;

import java.util.ArrayList;

/**
 * Created by jiangxj on 18-1-22.
 */

public class A770Gpio {
    private A770Gpio() {
    }

    private static A770Gpio a770Gpio;

    public static A770Gpio getInstance() {
        if (a770Gpio == null) {
            a770Gpio = new A770Gpio();
        }
        return a770Gpio;
    }

    static {
        System.loadLibrary("a770_gpio");
    }
    /**
     * 获取平台可用的GPIO编号
     *
     * @param null
     * @param null
     * @return
     */
    public native int getGpioTable(int a); //return a

    public native int setGpioLevel(int a, int b); // return a+b

    public native int getGpioLevel(int a, int b); // return a-b
}
