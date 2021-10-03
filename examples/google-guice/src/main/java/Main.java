import application.EmailApplication;
import application.FacebookApplication;
import application.TextEditor;
import com.google.inject.Guice;
import com.google.inject.Injector;
import service.Database;
import service.MySQL;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ApplicationConfiguration());

        FacebookApplication facebook = injector.getInstance(FacebookApplication.class);
        EmailApplication email = injector.getInstance(EmailApplication.class);
        TextEditor vscode = injector.getInstance(TextEditor.class);
        TextEditor sublime = injector.getInstance(TextEditor.class);
        Database database = injector.getInstance(Database.class);

        facebook.sendMessage("Hello World!", "Java");
        email.sendMessage("Hello World!", "Kotlin");

        assert (vscode.getChecker() == sublime.getChecker());
        assert (database instanceof MySQL);
    }
}
