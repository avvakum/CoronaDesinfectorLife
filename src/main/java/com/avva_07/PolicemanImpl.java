package com.avva_07;

public class PolicemanImpl implements Policeman {

    @InjectByType
    private Recommendator recommendator;
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Пиф паф, бах бах, кыш кыш!!!");
    }
}
