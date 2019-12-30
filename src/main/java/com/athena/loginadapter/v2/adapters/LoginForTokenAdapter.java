package com.athena.loginadapter.v2.adapters;

import com.athena.loginadapter.ResultMsg;

/**
 * @Author: xiaoxiang.zhang
 * @Description:Token登录适配器
 * @Date: Create in 12:47 PM 2019/12/7
 */
public class LoginForTokenAdapter implements LoginAdapter {

    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(String id, Object obj) {
        return null;
    }
}
