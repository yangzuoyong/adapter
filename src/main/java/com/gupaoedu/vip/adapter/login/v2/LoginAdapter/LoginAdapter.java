package com.gupaoedu.vip.adapter.login.v2.LoginAdapter;

import com.gupaoedu.vip.adapter.login.ResultMsg;

/**
 * 在适配器里面，这个接口是可有可无，不要跟模板模式混淆
 * 模板模式一定是抽象类，而这里仅仅只是一个接口
 *
 * @author : GP12713
 * @date : 2019/3/17
 */
public interface LoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
