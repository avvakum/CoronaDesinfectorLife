package com.avva_06;

public class Main {

    public static void main(String[] args) {
        CoronaDesinfector desinfector = ObjectFactory.getInstance().ceateObject(CoronaDesinfector.class);
        desinfector.start(new Room());
    }
}

//---------( avva_06 )----------
//Начинаем дезинфекцию, все вон!!!
//to protect from covid-2019 drink singleton
//Всех убью! Вон пошли!
//Зачитывается молитва: 'корона изыди!' - молитва прочитана, вирус низвергнут в ад
//Рискните зайти обратно.
//to protect from covid-2019 drink singleton
//------------------------------



