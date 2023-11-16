package pl.housedevelopment.apartment;

import pl.housedevelopment.person.Developer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Estate {
    Developer developer;
    LinkedList<Block> blocks;

    public Estate(Developer developer, LinkedList<Block> blocks) {
        this.developer = developer;
        this.blocks = blocks;
    }

    public String toString() {
        return "Estate{" + "developer=" + developer + ", block=" + blocks + '}';
    }

}
