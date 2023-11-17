package pl.edu.pja.s22687.apartment;

import pl.edu.pja.s22687.person.Developer;

import java.util.LinkedList;

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
