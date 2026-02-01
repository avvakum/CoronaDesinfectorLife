package com.avva_09;

public class CoronaDesinfector {

    @InjectByType
    Announcer announcer;
    @InjectByType
    Policeman policeman;

    public void start(Room room ) {
        System.out.println("---------( avva_09 Proxy Pattern )----------");
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
