package com.rafaelovna.test;

import lombok.ToString;

import java.util.Objects;

@ToString

public class User {

    private String login;
    private String email;


    public User(String login, String email) {
        if (login == null || login.isEmpty()) {
            throw new RuntimeException("Введите логин или почту");
        } else if (login.contains("@") || login.contains(".")) {
            throw new RuntimeException("Логин не может состоять из символов '@' и '.'");
        } else {
            this.login = login;
        }

        if (email == null || email.isEmpty()) {
            throw new RuntimeException("Введите логин или почту");
        } else if (!email.contains("@") || !email.contains(".")) {
            throw new RuntimeException("Электронная почта должна включать символы: '@' и '.'");
        } else {
            this.email = email;
        }
    }
    public User() {}

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
