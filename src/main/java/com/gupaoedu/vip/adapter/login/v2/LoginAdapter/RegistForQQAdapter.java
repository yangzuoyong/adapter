package com.gupaoedu.vip.adapter.login.v2.LoginAdapter;

import com.gupaoedu.vip.adapter.login.ResultMsg;

public class RegistForQQAdapter implements LoginAdapter,RegistAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof RegistForQQAdapter;
    }

    @Override
    public ResultMsg regist(String id, Object adapter) {
        return null;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
