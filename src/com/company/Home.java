package com.company;

public abstract class Home{
Person [] people;

    public Home(Person[] people) {
        this.people = people;
    }


    abstract void komUslugi();
 abstract  void  arenda();

    public Person[] getPeople() {
        return people;
    }
}
