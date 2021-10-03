package service;

import javax.inject.Named;

public class MySQL implements Database{

    private final String url;
    private final String type;

    public MySQL(@Named("JDBC") String url, @Named("DB") String type) {
        this.url = url;
        this.type = type;
    }
}
