package com.gupaoedu.vip.adapter.login;

public class SiginService {
    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,String.format("用户名：%s注册成功",username),new Member());
    }
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return new ResultMsg(200,String.format("用户名：%s登录成功",username),new Member());
    }
}
