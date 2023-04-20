package org.saurav;

public class Main {
    public static void main(String[] args) {

        System.out.println("This application is supposed to send mails");

        MailSender mailer = new MailSender();
        mailer.sendMail();
    }
}

