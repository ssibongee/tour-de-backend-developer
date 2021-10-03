package application;

import service.MessageService;

import javax.inject.Inject;
import javax.inject.Named;

public class EmailApplication {

    private final MessageService service;

    @Inject
    public EmailApplication(@Named("Email") MessageService service) {
        this.service = service;
    }

    public boolean sendMessage(String message, String recipient) {
        return service.sendMessage(message, recipient);
    }
}
