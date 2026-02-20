package com.avva_09;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // CoronaDesinfector desinfector = ObjectFactory.getInstance().ceateObject(CoronaDesinfector.class);
        ApplicationContext context = Application.run("com.avva_09", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDesinfector desinfector = context.getObject(CoronaDesinfector.class);
        desinfector.start(new Room());
    }
}

//recommendator was created
//class jdk.proxy2.$Proxy6
//---------( avva_09 Proxy Pattern )----------
//Начинаем дезинфекцию, все вон!!!
//************ что ж ты делаешь урод!
//to protect from covid-2019 drink singleton
//Пиф паф, бах бах, кыш кыш!!!
//Зачитывается молитва: 'корона изыди!' - молитва прочитана, вирус низвергнут в ад
//Рискните зайти обратно.
//************ что ж ты делаешь урод!
//to protect from covid-2019 drink singleton
//------------------------------



