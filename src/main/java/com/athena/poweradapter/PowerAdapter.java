package com.athena.poweradapter;

/**
 * @Author: xiaoxiang.zhang
 * @Description:电流转换器
 * @Date: Create in 11:54 AM 2019/12/7
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outputDC5V() {
        int inputPower = ac220.outputAC220V();
        int outputPower = inputPower / 44;
        System.out.println("使用PowerAdapter输入AC：" + inputPower + "V,输出DC" + outputPower + "V");
        return outputPower;
    }
}
