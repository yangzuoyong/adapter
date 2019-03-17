package com.gupaoedu.vip.adapter.login.v2.LoginAdapter;

import com.gupaoedu.vip.adapter.login.ResultMsg;

public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg regist(String id, Object adapter);
}
