package classwork.class8;

import classwork.class7.dao.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAOPersonArrayList implements DAO<Person> {

  private List<Person> storage = new ArrayList<>();

    @Override
    public void put(Person object) {
        //////// why can't i use put blin
    }

    @Override
    public Person get(int id) {
        throw new IllegalArgumentException("get:not yet");
    }

    @Override
    public void delete(int id) {
        throw new IllegalArgumentException("delete:not yet");
    }

    @Override
    public List<Person> getAll() {
        throw new IllegalArgumentException("getAll:not yet");
    }
}
