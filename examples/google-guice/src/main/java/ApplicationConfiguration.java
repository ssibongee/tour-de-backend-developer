import annotation.Facebook;
import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import service.EmailService;
import service.FacebookService;
import service.MessageService;

public class ApplicationConfiguration extends AbstractModule {

    @Override
    protected void configure() {
        bind(MessageService.class).annotatedWith(Names.named("Email")).to(EmailService.class);
        bind(MessageService.class).annotatedWith(Facebook.class).to(FacebookService.class);
    }
}
