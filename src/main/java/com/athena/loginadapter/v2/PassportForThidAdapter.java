package com.athena.loginadapter.v2;

import com.athena.loginadapter.ResultMsg;
import com.athena.loginadapter.v1.service.SignService;
import com.athena.loginadapter.v2.adapters.*;

/**
 * @Author: xiaoxiang.zhang
 * @Description:第三方登录适配器
 * @Date: Create in 12:37 PM 2019/12/7
 */
public class PassportForThidAdapter extends SignService implements IPassportForThird {

    public ResultMsg loginForQQ(String id) {
        LoginAdapter loginAdapter = new LoginForQQAdapter();
        if (loginAdapter.support(loginAdapter)) {
            return loginAdapter.login(id, loginAdapter);
        }
        return null;
    }

    public ResultMsg loginForWeChat(String id) {
        return processLogin(id, LoginForWeChatAdapter.class);
    }

    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    public ResultMsg loginForTelPhone(String telphone, String code) {
        return processLogin(telphone, LoginForTelphoneAdapter.class);
    }

    public ResultMsg loginForRegister(String userName, String password) {
        super.register(userName, password);
        return login(userName, password);
    }

    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        try {
            LoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(key, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
