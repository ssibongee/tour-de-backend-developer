import application.EmailApplication;
import application.FacebookApplication;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ApplicationConfiguration());

        FacebookApplication facebook = injector.getInstance(FacebookApplication.class);
        EmailApplication email = injector.getInstance(EmailApplication.class);

        facebook.sendMessage("Hello World!", "Java");
        email.sendMessage("Hello World!", "Kotlin");
    }
}
