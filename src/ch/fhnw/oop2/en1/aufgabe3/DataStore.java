package ch.fhnw.oop2.en1.aufgabe3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataStore<T extends Comparable> {

    private final List<T> store;

    public DataStore() {
        store = new ArrayList<>();
    }

    public void save(T t) {
        store.add(t);
    }

    public int size() {
        return store.size();
    }

    public List<T> sort() {
        return store.stream().sorted().collect(Collectors.toList());
    }
}
