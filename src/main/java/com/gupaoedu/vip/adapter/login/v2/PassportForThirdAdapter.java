package com.gupaoedu.vip.adapter.login.v2;

import com.gupaoedu.vip.adapter.login.ResultMsg;
import com.gupaoedu.vip.adapter.login.SiginService;
import com.gupaoedu.vip.adapter.login.v2.LoginAdapter.*;

/**
 * 结合策略模式、工厂模式、适配器模式
 *
 * @author : GP12713
 * @date : 2019/3/17
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelephone(String telephone, String code) {
        return processLogin(telephone, LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username, passport);
        return super.login(username, passport);
    }

    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        try {
            //适配器不一定要实现接口
            LoginAdapter adapter = clazz.newInstance();

            //判断传过来的适配器是否能处理指定的逻辑
            if (adapter.support(adapter)) {
                return adapter.login(key, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
