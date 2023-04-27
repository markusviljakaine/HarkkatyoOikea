package com.example.harkkatyo;

import java.util.ArrayList;

public class KotiStorage {
    private ArrayList<Lutemon> koti = new ArrayList<>();

    private static KotiStorage kotiStorage = null;

    private KotiStorage() {
    }

    public static KotiStorage getInstance() {
        if (kotiStorage == null) {
            kotiStorage = new KotiStorage();
        }
        return kotiStorage;
    }

    public ArrayList<Lutemon> getLutemons() {
        return koti;
    }

    public void addLutemon(Lutemon lutemon) {
        koti.add(lutemon);
    }

    public Lutemon getLutemonById(int id) {
        return koti.remove(id);
    }

    public void removeLutemon(Lutemon lutemon) {
        koti.remove(lutemon);
    }
}

