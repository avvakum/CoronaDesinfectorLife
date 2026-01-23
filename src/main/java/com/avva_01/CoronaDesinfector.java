package com.avva_01;

public class CoronaDesinfector {

    Announcer announcer = new ConsoleAnnouncer();
    Policeman policeman = new PolicemanImpl();

    public void start(Room room ) {
        System.out.println("---------( avva_01 )----------");
        announcer.announce("Начинаем дезинфекцию, все вон!!!");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Рискните зайти обратно.");
        System.out.println("------------------------------");
    }

    private void desinfect(Room room) {
        System.out.println("Зачитывается молитва: 'корона изыди!' - молитва прочитана, вирус низвергнут в ад");
    }
}
