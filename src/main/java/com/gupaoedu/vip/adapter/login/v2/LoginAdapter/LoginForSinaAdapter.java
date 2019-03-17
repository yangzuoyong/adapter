package com.gupaoedu.vip.adapter.login.v2.LoginAdapter;

import com.gupaoedu.vip.adapter.login.ResultMsg;

public class LoginForSinaAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
