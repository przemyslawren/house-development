package pl.housedevelopment;

import java.util.List;

public class Estate {
    List<ApartmentBlock> apartmentBlocks;

    public Estate(List<ApartmentBlock> apartmentBlocks) {
        this.apartmentBlocks = apartmentBlocks;
    }

    public String toString() {
        return "pl.housedevelopment.Estate: " + apartmentBlocks;
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
