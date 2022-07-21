package com.company;

public class Kvartira implements Famili {
    private String addres;

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Kvartira(String addres) {
        this.addres = addres;
    }

    static int kol = 0;
static void famili(String ... name){
    for (int i = 0; i < name.length; i++) {
        System.out.println(name[i]);
        kol++;
    }
    System.out.println("квартирада "+kol +" lived");
}

    @Override
    public void many() {
        System.out.println(" ком услуги 70000");
    }

    @Override
    public String toString() {
        return addres ;
    }}




