package com.avva_10;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = Application.run("com.avva_10", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDesinfector desinfector = context.getObject(CoronaDesinfector.class);
        desinfector.start(new Room());
    }
}

//recommendator was created
//class jdk.proxy2.$Proxy6
//************ что ж ты делаешь урод!
//---------( avva_10 CGLib )----------
//Начинаем дезинфекцию, все вон!!!
//************ что ж ты делаешь урод!
//to protect from covid-2019 drink singleton
//Пиф паф, бах бах, кыш кыш!!!
//Зачитывается молитва: 'корона изыди!' - молитва прочитана, вирус низвергнут в ад
//Рискните зайти обратно.
//************ что ж ты делаешь урод!
//to protect from covid-2019 drink singleton
//------------------------------



