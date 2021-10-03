package application;

import annotation.Facebook;
import service.MessageService;

import javax.inject.Inject;

public class FacebookApplication {

    private final MessageService service;

    @Inject
    public FacebookApplication(@Facebook MessageService service) {
        this.service = service;
    }

    public boolean sendMessage(String message, String recipient) {
        return service.sendMessage(message, recipient);
    }
}
