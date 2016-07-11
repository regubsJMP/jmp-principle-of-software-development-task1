package com.gubaidullin;

import java.util.List;
/**
 * Created by Renat_Gubaidullin on 7/10/2016.
 */

public class PersonDAO {


    public void createPerson(Person person){
        String insetQuery = "INSERT INTO users (name, surname, age) VALUES ('" + person.getName() + "','"
        + person.getSurname() + "','" + person.getAge() + "')";
        ConnectionManager insertStatement = new ConnectionManager();
        insertStatement.createConnection(insetQuery);
    }

    public void updatePerson(Person person, int userId){
        String updateQuery = "UPDATE users SET age =" + person.getAge() + "WHERE id = '" + + userId + "'";
        ConnectionManager updateStatement = new ConnectionManager();
        updateStatement.createConnection(updateQuery);
    }

    public void deletePerson(Person person, int userId){
        String  insertQuery = "DELETE FROM users WHERE id = '" + + userId + "'";;
        ConnectionManager insertStatement = new ConnectionManager();
        insertStatement.createConnection( insertQuery);

    }

    public List<Person> getAll(){
        return null;
    }
}