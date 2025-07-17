package br.com.cod3r.template.persist.model;

import static java.util.Objects.isNull;

public class UserModel extends ModelPersist {
    protected String username;
    protected String password;

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected void preSave() {
        System.out.println("Checking if there is another user with the same username");
    }

    @Override
    protected void prePersist() {
        if (isNull(username)) throw new RuntimeException("Username is mandatory.");
        if (isNull(password)) throw new RuntimeException("password is mandatory.");
    }

    @Override
    protected void postSave() {
        System.out.println("Creating user roles");
    }
}