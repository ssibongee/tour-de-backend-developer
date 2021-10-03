import annotation.Facebook;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import provider.SpellCheckerProvider;
import service.EmailService;
import service.FacebookService;
import service.MessageService;
import service.SpellChecker;

public class ApplicationConfiguration extends AbstractModule {

    @Override
    protected void configure() {
        bind(MessageService.class)
                .annotatedWith(Names.named("Email"))
                .to(EmailService.class);

        bind(MessageService.class)
                .annotatedWith(Facebook.class)
                .to(FacebookService.class);

        bind(SpellChecker.class)
                .toProvider(SpellCheckerProvider.class)
                .in(Singleton.class);
    }


    @Singleton
    @Provides
    public SpellChecker textEditorSpellChecker() {
        String editor = "text";
        String user = "user";
        int timeout = 100;

        return new SpellChecker(editor, user, timeout);
    }
}
