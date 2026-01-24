package com.avva_02;

public class CoronaDesinfector {

    Announcer announcer = ObjectFactory.getInstance().ceateObject(Announcer.class);
    Policeman policeman = ObjectFactory.getInstance().ceateObject(Policeman.class);

    public void start(Room room ) {
        System.out.println("---------( avva_02 )----------");
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
