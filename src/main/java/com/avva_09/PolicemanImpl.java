package com.avva_09;

import javax.annotation.PostConstruct;

public class PolicemanImpl implements Policeman {

    @InjectByType
    private Recommendator recommendator;

    // Отказываемся от использования конструктора
    // Используем init() method
//    public PolicemanImpl() {
//        System.out.println(recommendator.getClass());
//    }
    // We broke the construction set.
    // Caused by: java.lang.NullPointerException: Cannot invoke "com.avva_08.Recommendator.getClass()" because "this.recommendator" is null
    //	at com.avva_08.PolicemanImpl.<init>(PolicemanImpl.java:9)

    @PostConstruct
    public void init() {
        System.out.println(recommendator.getClass());
    }

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Пиф паф, бах бах, кыш кыш!!!");
    }
}
