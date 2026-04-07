package com.app;
import java.util.HashSet;
import java.util.Set;

public class App {
    private static Set<String> users = new HashSet<>();

    public static String register(String name, String email) {
        if (name == null || email == null) {
            return "Invalid input";
        }

        if (users.contains(email)) {
            return "Duplicate user";
        }

        users.add(email);
        return "Registered";
    }

    public static void main(String[] args) {
        System.out.println(register("Kevin", "test@mail.com"));
        System.out.println(register("Kevin", "test@mail.com"));
    }
}