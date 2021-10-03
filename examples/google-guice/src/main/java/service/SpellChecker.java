package service;

import javax.inject.Singleton;

@Singleton
public class SpellChecker {

    private final String editor;
    private final String user;
    private final int timeout;

    public SpellChecker(String editor, String user, int timeout) {
        this.editor = editor;
        this.user = user;
        this.timeout = timeout;
    }
}
