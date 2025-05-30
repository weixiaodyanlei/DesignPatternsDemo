package com.dawn.singleton.card;

public class IdentityCardNo {
    private static IdentityCardNo instance;
    private String no;

    private IdentityCardNo() {}

    public static IdentityCardNo getInstance() {
        if (instance == null) {
            System.out.println("第一次办理身份证，分配新号码！");
            instance = new IdentityCardNo();
            instance.setIdentityCardNo("No400011112222");
        }else {
            System.out.println("重复办理身份证，使用旧号码！");
        }
        return instance;
    }

    private void setIdentityCardNo(String no) {
        this.no = no;
    }

    public String getIdentityCardNo() {
        return this.no;
    }
}
