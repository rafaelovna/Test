package com.rafaelovna.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {


    public static final String INCORRECT_EMAIL = "annamailru";
    public static final String CORRECT_EMAIL = "anna@mail.ru";


    private final User out = new User("anna", "anna@mail.ru");

    @Test
    public void creatingUserObjectWithPassingTwoParametersToIt() {
        Assertions.assertEquals("anna", out.getLogin());
        Assertions.assertEquals("anna@mail.ru", out.getEmail());

    }

    @Test
    public void checkingTheDataInstallationWhenCreatingAnObject() {
        User result = new User();
        Assertions.assertNotNull(result);
    }

    @Test
    public void emailAddressCorrectnessTest() {
        Assertions.assertFalse(out.correctEmail("anna@mailru"), INCORRECT_EMAIL);
        Assertions.assertTrue(out.correctEmail("anna@mail.ru"), CORRECT_EMAIL);
    }

    @Test
    public void checkingForTheEqualityOfLoginAndEmail() {
        Assertions.assertFalse(out.equalLoginAndEmail("anna", "anna"));
    }
}
