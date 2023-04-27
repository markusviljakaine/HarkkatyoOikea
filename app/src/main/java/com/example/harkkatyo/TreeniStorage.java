package com.example.harkkatyo;

import java.util.ArrayList;

public class TreeniStorage {

    private ArrayList<Lutemon> treeni = new ArrayList<>();

    private static TreeniStorage treeniStorage = null;

    private TreeniStorage() {
    }

    public static TreeniStorage getInstance() {
        if (treeniStorage == null) {
            treeniStorage = new TreeniStorage();
        }
        return treeniStorage;
    }

    public ArrayList<Lutemon> getLutemons() {
        return treeni;
    }

    public void addLutemon(Lutemon lutemon) {
        treeni.add(lutemon);
    }

    public Lutemon getLutemonById(int id) {
        return treeni.remove(id);
    }

    public void removeLutemon(Lutemon lutemon) {
        treeni.remove(lutemon);
    }
}
