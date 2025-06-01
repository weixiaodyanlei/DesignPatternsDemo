package com.dawn.adapter.encrypt.adapter;

import com.dawn.adapter.encrypt.DataOperation;
import com.dawn.adapter.encrypt.third.Caesar;

public class CaesarAdapter extends DataOperation {

    private Caesar caesar;

    public CaesarAdapter() {
        caesar = new Caesar();
    }

    @Override
    public String doEncrypt(int key, String ps) {
        return caesar.doEncrypt(key, ps);
    }
}
