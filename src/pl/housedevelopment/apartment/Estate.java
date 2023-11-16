package pl.housedevelopment.apartment;

import pl.housedevelopment.person.Developer;

import java.util.ArrayList;
import java.util.List;

public class Estate {
    List<ApartmentBlock> apartmentBlocks;
    Developer developer;

    public Estate(Developer developer, List<ApartmentBlock> apartmentBlocks) {
        this.developer = developer;
        this.apartmentBlocks = new ArrayList<>();
    }

    public String toString() {
        return "\nEstate: " + apartmentBlocks;
    }

    public void addApartmentBlock(ApartmentBlock apartmentBlock) {
        this.apartmentBlocks.add(apartmentBlock);
    }

    public void removeApartmentBlock(ApartmentBlock apartmentBlock) {
        this.apartmentBlocks.remove(apartmentBlock);
    }

    public List<ApartmentBlock> getApartmentBlocks() {
        return this.apartmentBlocks;
    }


}
