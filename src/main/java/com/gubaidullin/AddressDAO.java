package com.gubaidullin;

/**
 * Created by Renat_Gubaidullin on 7/10/2016.
 */
import java.util.List;

/**
 * Created by ihar on 7/10/2016.
 */
public class AddressDAO {

    public void createAddress(Address address){
        String insetQuery = "";
        ConnectionManager insertStatement = new ConnectionManager();
        insertStatement.createConnection(insetQuery);
    }

    public void updateAddress(Address address){
        String updateQuery = "";
        ConnectionManager updateStatement = new ConnectionManager();
        updateStatement.createConnection(updateQuery);
    }

    public void deleteAddress(Address address){
        String  insertQuery = "";
        ConnectionManager insertStatement = new ConnectionManager();
        insertStatement.createConnection( insertQuery);
    }

    public List<Address> getAll(){
        return null;
    }
}
