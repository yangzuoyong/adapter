package com.gupaoedu.vip.adapter.login.v2.LoginAdapter;

import com.gupaoedu.vip.adapter.login.ResultMsg;

public class LoginForTelAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
