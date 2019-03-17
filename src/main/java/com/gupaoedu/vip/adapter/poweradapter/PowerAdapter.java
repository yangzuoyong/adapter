package com.gupaoedu.vip.adapter.poweradapter;

public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    public int outoupDC5V() {
        int input = ac220.outputAC220V();
        int output = input / 44;
        System.out.println(String.format("使用PowerAdapter输入AC:%sV,输出DC：%sV", input, output));
        return output;
    }
}
