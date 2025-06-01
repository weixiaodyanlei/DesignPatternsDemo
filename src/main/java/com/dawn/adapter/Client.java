package com.dawn.adapter;

import com.dawn.adapter.encrypt.DataOperation;
import com.dawn.adapter.encrypt.adapter.CaesarAdapter;
import com.dawn.adapter.encrypt.adapter.NewCipherAdapter;

public class Client {
    public static void main(String args[]) {
        System.out.println("====test CipherAdapter====");
        DataOperation caesarAdapter = new CaesarAdapter();
        caesarAdapter.setPassword("dawn");
        String caesarPassword = caesarAdapter.getPassword();
        String caesarPasswordEncrypt = caesarAdapter.doEncrypt(6, caesarPassword);
        System.out.println("明文为：" + caesarPassword);
        System.out.println("密文为：" + caesarPasswordEncrypt);

        System.out.println("====test NewCipherAdapter====");
        DataOperation newCipherAdapter = new NewCipherAdapter();
        newCipherAdapter.setPassword("dawn");
        String newCipherPassword = newCipherAdapter.getPassword();
        String newCipherPasswordEncrypt = newCipherAdapter.doEncrypt(6, newCipherPassword);
        System.out.println("明文为：" + newCipherPassword);
        System.out.println("密文为：" + newCipherPasswordEncrypt);
    }
}

