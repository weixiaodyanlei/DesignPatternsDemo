package com.dawn.adapter.encrypt.adapter;

import com.dawn.adapter.encrypt.DataOperation;
import com.dawn.adapter.encrypt.third.NewCipher;

public class NewCipherAdapter extends DataOperation {

    private NewCipher cipher;

    public NewCipherAdapter() {
        cipher = new NewCipher();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return cipher.doEncrypt(key, ps);
    }
}
