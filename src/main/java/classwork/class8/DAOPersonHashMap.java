package classwork.class8;

import classwork.class7.dao.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAOPersonHashMap implements DAO<Person> {

    private Map<Integer, Person> storage = new HashMap<>();

    @Override
    public void put(Person object) {

    }

    @Override
    public Person get(int id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }



}