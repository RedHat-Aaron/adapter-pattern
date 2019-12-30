package com.athena.loginadapter.v1.service;

import com.athena.loginadapter.ResultMsg;

/**
 * @Author: xiaoxiang.zhang
 * @Description:第三方登录服务
 * @Date: Create in 12:02 PM 2019/12/7
 */
public class SignServiceForThrid extends SignService {

    /**
     * @return com.athena.loginadapter.ResultMsg
     * @Author xiangxz
     * @Description QQ登录
     * @Date 12:21 PM 2019/12/7
     * @Param [openId]
     */
    public ResultMsg loginForQQ(String openId) {
        System.out.println("QQ登录，openId:" + openId);
        return loginForRegister(openId,null);
    }

    public ResultMsg loginForWeChat(String openId) {
        System.out.println("WeChat登录，openId:" + openId);
        return loginForRegister(openId,null);
    }

    public ResultMsg loginForTelphone(String phoneNumber, String code) {
        System.out.println("手机号登录，phoneNumber:" + phoneNumber + ",code:" + code);
        return loginForRegister(phoneNumber,null);
    }

    public ResultMsg loginForToken(String token) {
        System.out.println("Token登录，token:" + token);
        return loginForRegister(token,null);
    }

    public ResultMsg loginForRegister(String userName, String passowrd) {
        System.out.println("注册后登录，userName:" + userName + "，passowrd:" + passowrd);
        return null;
    }
}
