package com.athena.poweradapter;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 11:57 AM 2019/12/7
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
