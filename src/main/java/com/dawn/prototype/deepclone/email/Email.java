package com.dawn.prototype.deepclone.email;

import java.io.*;

public class Email implements Cloneable, Serializable {
    private Attachment attachment;

    public Email() {
        this.attachment = new Attachment();
    }

    public Object clone() {
        try {
            //将对象写入流中
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            //将对象从流中取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return(ois.readObject());
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Attachment getAttachment() {
        return this.attachment;
    }

    public void display() {
        System.out.println("查看邮件");
    }
}
