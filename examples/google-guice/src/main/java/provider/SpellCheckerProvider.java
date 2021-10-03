package provider;

import com.google.inject.Provider;
import service.SpellChecker;

public class SpellCheckerProvider implements Provider<SpellChecker> {

    @Override
    public SpellChecker get() {
        String editor = "text";
        String user = "user";
        int timeout = 100;

        return new SpellChecker(editor, user, timeout);
    }
}
