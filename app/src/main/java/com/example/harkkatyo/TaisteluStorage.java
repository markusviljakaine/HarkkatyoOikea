package com.example.harkkatyo;

import java.util.ArrayList;

public class TaisteluStorage {
    private ArrayList<Lutemon> taistelu = new ArrayList<>();

    private static TaisteluStorage taisteluStorage = null;

    private TaisteluStorage() {
    }

    public static TaisteluStorage getInstance() {
        if (taisteluStorage == null) {
            taisteluStorage = new TaisteluStorage();
        }
        return taisteluStorage;
    }

    public ArrayList<Lutemon> getLutemons() {
        return taistelu;
    }

    public void addLutemon(Lutemon lutemon) {
        taistelu.add(lutemon);
    }

    public Lutemon getLutemonById(int id) {
        return taistelu.remove(id);
    }

    public void removeLutemon(Lutemon lutemon) {
        taistelu.remove(lutemon);
    }
}
