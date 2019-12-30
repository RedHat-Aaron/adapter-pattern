package com.athena.loginadapter.v2.adapters;

import com.athena.loginadapter.ResultMsg;

/**
 * @Author: xiaoxiang.zhang
 * @Description:微信登录适配器
 * @Date: Create in 12:47 PM 2019/12/7
 */
public class LoginForWeChatAdapter implements LoginAdapter {

    public boolean support(Object adapter) {
        return adapter instanceof LoginForWeChatAdapter;
    }

    public ResultMsg login(String id, Object obj) {
        return null;
    }
}
