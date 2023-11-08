package pl.housedevelopment.apartment;

import java.util.ArrayList;
import java.util.List;

public class Estate {
    List<ApartmentBlock> apartmentBlocks;

    public Estate() {
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
