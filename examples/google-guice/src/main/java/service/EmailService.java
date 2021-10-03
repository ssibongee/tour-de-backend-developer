package service;

import javax.inject.Singleton;

@Singleton
public class EmailService implements MessageService {

    @Override
    public boolean sendMessage(String message, String recipient) {
        System.out.println("Email Message send to " + recipient + " with message=" + message);
        return true;
    }
}
