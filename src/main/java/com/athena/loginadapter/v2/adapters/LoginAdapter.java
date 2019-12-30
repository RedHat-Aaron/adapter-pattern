package com.athena.loginadapter.v2.adapters;

import com.athena.loginadapter.ResultMsg;

/**
 * @Author: xiaoxiang.zhang
 * @Description:登录适配器接口
 * @Date: Create in 12:43 PM 2019/12/7
 */
public interface LoginAdapter {

    /**
     * @return boolean
     * @Author xiangxz
     * @Description 用来判断当前是否支持该种方式登录
     * @Date 12:44 PM 2019/12/7
     * @Param [adapter]
     */
    boolean support(Object adapter);

    /**
     * @return com.athena.loginadapter.ResultMsg
     * @Author xiangxz
     * @Description 如果支持，则可以使用当前方法进行登录
     * @Date 12:46 PM 2019/12/7
     * @Param [id, obj]
     */
    ResultMsg login(String id, Object obj);
}
