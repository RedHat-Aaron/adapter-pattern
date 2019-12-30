package com.athena.loginadapter.v2;

import com.athena.loginadapter.ResultMsg;

/**
 * @Author: xiaoxiang.zhang
 * @Description:第三方登录接口
 * @Date: Create in 12:36 PM 2019/12/7
 */
public interface IPassportForThird {

    /**
     * @return com.athena.loginadapter.ResultMsg
     * @Author xiangxz
     * @Description QQ登录
     * @Date 12:40 PM 2019/12/7
     * @Param [id]
     */
    ResultMsg loginForQQ(String id);

    /**
     * @return com.athena.loginadapter.ResultMsg
     * @Author xiangxz
     * @Description 微信登录
     * @Date 12:40 PM 2019/12/7
     * @Param id
     */
    ResultMsg loginForWeChat(String id);

    /**
     * @return com.athena.loginadapter.ResultMsg
     * @Author xiangxz
     * @Description 记录登录后的状态自动登录
     * @Date 12:40 PM 2019/12/7
     * @Param [token]
     */
    ResultMsg loginForToken(String token);


    /**
     * @return com.athena.loginadapter.ResultMsg
     * @Author xiangxz
     * @Description 手机号登录
     * @Date 12:41 PM 2019/12/7
     * @Param [telphone, code]
     */
    ResultMsg loginForTelPhone(String telphone, String code);

    /**
     * @return com.athena.loginadapter.ResultMsg
     * @Author xiangxz
     * @Description /注册后自动登录
     * @Date 12:41 PM 2019/12/7
     * @Param [userName, password]
     */
    ResultMsg loginForRegister(String userName, String password);
}
