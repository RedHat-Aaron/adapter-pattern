package com.athena.loginadapter.v1;

import com.athena.loginadapter.v1.service.SignServiceForThrid;

/**
 * @Author: xiaoxiang.zhang
 * @Description:第三方登录测试类
 * @Date: Create in 12:32 PM 2019/12/7
 */
public class SignServiceForThirdTest {
    public static void main(String[] args) {
        SignServiceForThrid thrid = new SignServiceForThrid();
        thrid.loginForQQ("123455fda");
        thrid.loginForTelphone("123456775", "1234");
        thrid.loginForWeChat("sadfasdgsd");
    }
}
