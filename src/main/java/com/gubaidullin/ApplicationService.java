package com.gubaidullin;

import java.util.ArrayList;

/**
 * Created by Renat_Gubaidullin on 7/10/2016.
 */
public class ApplicationService {

    private PersonDAO personDAO = new PersonDAO();

    public void saveInfo(int userId, String personName, String personSurname, int personAge, ArrayList<String> countries, ArrayList<String> cities,
                         ArrayList<String> postcodes){

        Person person = new Person(personName, personSurname, personAge, userId);

        personDAO.createPerson(person);
    }

    public void updateInfo(int userId, String personName, String personSurname,int personAge, ArrayList<String> countries, ArrayList<String> cities,
                         ArrayList<String> postcodes){

        Person person = new Person(personName, personSurname, personAge, userId);

        personDAO.createPerson(person);
    }
}