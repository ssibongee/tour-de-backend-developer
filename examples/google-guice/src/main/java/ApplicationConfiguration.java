import annotation.Facebook;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import provider.SpellCheckerProvider;
import service.*;

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

        try {
            bind(Database.class)
                    .toConstructor(MySQL.class.getConstructor(String.class, String.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        bind(String.class)
                .annotatedWith(Names.named("JDBC"))
                .toInstance("jdbc:mysql://localhost:3306/test");

        bind(String.class)
                .annotatedWith(Names.named("DB"))
                .toInstance("MySQL");
    }
}
