package com.gupaoedu.vip.adapter;

import com.gupaoedu.vip.adapter.login.SinginForThirdService;
import com.gupaoedu.vip.adapter.login.v2.IPassportForThird;
import com.gupaoedu.vip.adapter.login.v2.PassportForThirdAdapter;
import com.gupaoedu.vip.adapter.poweradapter.AC220;
import com.gupaoedu.vip.adapter.poweradapter.DC5;
import com.gupaoedu.vip.adapter.poweradapter.PowerAdapter;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void powerAdapterTest() {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outoupDC5V();
        System.out.println(System.getProperties().getProperty("user.name"));
    }
    @Test
    public void siginForThirdServiceTest(){
        SinginForThirdService service = new SinginForThirdService();
        service.login("GP12712","123456");
        service.loginForQQ("999999");
        service.loginForWechat("88888");
    }

    @Test
    public void passportTest(){
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("11111111111111111111");
    }
}
