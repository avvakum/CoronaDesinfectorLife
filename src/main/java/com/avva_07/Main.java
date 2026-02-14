package com.avva_07;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // CoronaDesinfector desinfector = ObjectFactory.getInstance().ceateObject(CoronaDesinfector.class);
        ApplicationContext context = Application.run("com.avva_07", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDesinfector desinfector = context.getObject(CoronaDesinfector.class);
        desinfector.start(new Room());
    }
}

// recommendator was created 1 - if @Singleton

//---------( avva_07 )----------
//Начинаем дезинфекцию, все вон!!!
//to protect from covid-2019 drink singleton
//Всех убью! Вон пошли!
//Зачитывается молитва: 'корона изыди!' - молитва прочитана, вирус низвергнут в ад
//Рискните зайти обратно.
//to protect from covid-2019 drink singleton
//------------------------------



