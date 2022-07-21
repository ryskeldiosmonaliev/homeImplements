package com.company;

public class Hotel implements Famili {

    private String addres;

    @Override
    public String toString() {
        return addres;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Hotel(String addres) {
        this.addres = addres;
    }

    static int kol = 0;

    static void family(String... name) {
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
            kol++;
        }
        System.out.println("Hotel " + kol + " lived");
    }

    @Override
    public void many() {
        System.out.println("аренда 20000");
    }
}
