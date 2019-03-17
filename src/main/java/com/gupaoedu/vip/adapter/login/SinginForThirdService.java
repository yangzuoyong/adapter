package com.gupaoedu.vip.adapter.login;

public class SinginForThirdService extends SiginService {
    public ResultMsg loginForQQ(String openId) {
        //1、openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）

        //4、调用原来的登录方法

        return loginForRegist(openId, null);
    }

    public ResultMsg loginForWechat(String openId) {
        return null == openId ? null : new ResultMsg(200, "登陆成功", new Member());
    }

    public ResultMsg loginForToken(String token) {
        //通过token拿到用户信息，然后再重新登陆了一次
        return null == token ? null : new ResultMsg(200, "登陆成功", new Member());
    }

    public ResultMsg loginForTelephone(String telephone, String code) {

        return null == telephone ? null : new ResultMsg(200, String.format("telephone:%s,登陆成功", telephone), new Member());
    }

    public ResultMsg loginForRegist(String username, String password) {
        super.regist(username, null);
        return super.login(username, null);
    }
}
