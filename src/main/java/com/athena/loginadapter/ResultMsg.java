package com.athena.loginadapter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: xiaoxiang.zhang
 * @Description:返回对象
 * @Date: Create in 12:05 PM 2019/12/7
 */
@Setter
@Getter
@ToString
public class ResultMsg {

    private Integer code;

    private String msg;

    private Object data;
}
