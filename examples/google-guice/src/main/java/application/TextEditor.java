package application;

import service.SpellChecker;

import javax.inject.Inject;

public class TextEditor {

    private final SpellChecker checker;

    @Inject
    public TextEditor(SpellChecker checker) {
        this.checker = checker;
    }

    public SpellChecker getChecker() {
        return checker;
    }
}
