package com.rafaelovna.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserTest {


    public static final String INCORRECT_EMAIL = "annamailru";
    public static final String INCORRECT_LOGIN = "anna.@";
    public static final String CORRECT_EMAIL = "anna@mail.ru";
    public static final String CORRECT_LOGIN = "anna";


    private final User out = new User("anna", "anna@mail.ru");

    @Test
    public void creatingUserObjectWithPassingTwoParametersToIt() {
        Assertions.assertEquals("anna", out.getLogin());
        Assertions.assertEquals("anna@mail.ru", out.getEmail());

    }

    @Test
    public void checkingTheDataInstallationWhenCreatingAnObject() {
        User result = new User();
        Assertions.assertNull(result.getLogin());
        Assertions.assertNull(result.getEmail());
    }

    @Test
    public void emailAddressCorrectnessTest() {
        Assertions.assertThrows(RuntimeException.class, () -> new User(CORRECT_LOGIN, INCORRECT_EMAIL));
    }
    @Test
    public void loginCorrectnessTest() {
        Assertions.assertThrows(RuntimeException.class, () -> new User(INCORRECT_LOGIN, CORRECT_EMAIL));
    }

    @Test
    public void loginAndEmailAreEqual() {
        Assertions.assertThrows(RuntimeException.class, () -> new User("anna","anna"));
    }
}
