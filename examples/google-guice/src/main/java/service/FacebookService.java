package service;

public class FacebookService implements MessageService {

    @Override
    public boolean sendMessage(String message, String recipient) {
        System.out.println("Message sent to Facebook user " + recipient + " with message=" + message);
        return true;
    }
}
