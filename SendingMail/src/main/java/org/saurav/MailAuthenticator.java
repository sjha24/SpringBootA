package org.saurav;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator {
    @Override
    protected PasswordAuthentication getPasswordAuthentication()
    {

        return new PasswordAuthentication(ConstantData.SENDER_MAIL, ConstantData.PASSWORD);
    }
}
