package com.company;

public class Main {
    public static void main(String[] args) {
        Kvartira kvartira = new Kvartira(" ул. Маршала Полубаярова 12");
        System.out.println(kvartira);
kvartira.many();
Kvartira.famili("Azamat","Nurperi");
        System.out.println("----------------------------");

Obshijitie obshijitie = new Obshijitie("ул Волжкий булвар 32");
        System.out.println(obshijitie);
        obshijitie.many();
        obshijitie.famil1("alinur","adahan","kylym");
        System.out.println("--------------------------------");
        Hotel hotel = new Hotel("м. Таганская ул. Кирпичная 3");
        System.out.println(hotel);
        hotel.many();
        hotel.family("Nursultan");

    }
}