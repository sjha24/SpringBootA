package org.saurav;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.Session;

public class MailSender {
    void sendMail(){

        //host : gmail is smtp
        String host  = "smtp.gmail.com";

        Properties props = System.getProperties();

        System.out.println(props);

        //set properties :

        props.put("mail.smtp.host",host);
        props.put("mail.smtp.port","465");
        props.put("mail.smtp.ssl.enable","true");
        props.put("mail.smtp.auth","true");

        //session
        Session mailSession = Session.getInstance(props,new MailAuthenticator());

        //create the message object

        MimeMessage mimeMessage = new MimeMessage(mailSession);


        try {

            //sender
            mimeMessage.setFrom(ConstantData.SENDER_MAIL);

            //receiver
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(ConstantData.RECEIVER_MAIL));

            //subject
            mimeMessage.setSubject(ConstantData.SUBJECT);

            mimeMessage.setText(ConstantData.MESSAGE);

            Transport.send(mimeMessage);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
