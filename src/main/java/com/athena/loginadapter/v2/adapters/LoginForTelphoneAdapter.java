package com.athena.loginadapter.v2.adapters;

import com.athena.loginadapter.ResultMsg;

/**
 * @Author: xiaoxiang.zhang
 * @Description:手机号登录适配器
 * @Date: Create in 12:47 PM 2019/12/7
 */
public class LoginForTelphoneAdapter implements LoginAdapter {

    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelphoneAdapter;
    }

    public ResultMsg login(String id, Object obj) {
        return null;
    }
}
