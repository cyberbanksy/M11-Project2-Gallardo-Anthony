package com.company;

import java.util.ArrayList;
import java.util.List;

/// create objects for each of the classes director etc
/// create a list that will hold actors and crew members
/// add actor object and crew objects to the respective lists
/// make a movie object pass in all the variables
public class App {
    public static void main(String[] args) {
        Person jon = new Person("Jon",75000);
        Director Ron = new Director("Ron",99000,"Executive");
        Actor theRock = new Actor("The Rock",95000,"Lead Actor");
        Actor elvis = new Actor("Elvis",3400000,"supporting lead");
        Actor micheal = new Actor("Micheal Jackson",54000, "Extra");

        List<Actor> actorList = new ArrayList<>();
        actorList.add(micheal);
        actorList.add(elvis);
        actorList.add(theRock);

        Crew makeupArtist = new Crew("Jayness", 55000, "Makeup");
        PA pa = new PA("ruth",86000,"production");

        List<Crew> crewList = new ArrayList<>();
        crewList.add(makeupArtist);
        crewList.add(pa);

        Movie movie = new Movie("Horror",Ron,actorList,crewList,15481200);
        pa.setHoursWorked(40);
        movie.payDay();
        movie.updateMoneyEarned(500000000);
        System.out.println("The director made "+ Ron.getRoyalities());


        }
}
