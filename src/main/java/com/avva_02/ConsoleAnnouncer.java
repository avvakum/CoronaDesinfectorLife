package com.avva_02;

public class ConsoleAnnouncer implements Announcer {
    @Override
    public void announce(String message) {
        System.out.println(message);
    }
}
