package com.sample.test.demo.model;

import java.util.Random;

public class PickupInformation {

    private String name;
    private String email;
    private String phone;

    public PickupInformation() {
        name = generateRandomString(10, true);
        email = generateRandomString(8, true)+"@gmail.com";
        phone = generateRandomString(10, false);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    private String generateRandomString(int length, boolean isString) {
        String alphabet = "";
        alphabet = isString? "ABCDEFGHIJKLMNOPQRSTUVWXYZ" : "0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for(int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
