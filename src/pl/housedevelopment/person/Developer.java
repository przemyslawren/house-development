package pl.housedevelopment.person;

import pl.housedevelopment.apartment.Estate;

import java.util.ArrayList;

public class Developer {

    private static Developer INSTANCE;
    ArrayList<Estate> estateList;

    private Developer() {
        estateList = new ArrayList<>();
    }

    public static Developer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Developer();
        }
        return INSTANCE;
    }

}
