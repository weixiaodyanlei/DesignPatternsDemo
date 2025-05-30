package com.dawn.prototype.sallowclone;

import com.dawn.prototype.sallowclone.email.Email;

public class Client {
    public static void main(String args[]) {
        Email email, copyEmail;

        email = new Email();

        copyEmail = (Email) email.clone();

        System.out.println("email == copyEmail?");
        System.out.println(email == copyEmail);

        System.out.println("email.getAttachment == copyEmail.getAttachment?");
        System.out.println(email.getAttachment() == copyEmail.getAttachment());
    }
}
