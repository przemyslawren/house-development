package pl.housedevelopment;

import pl.housedevelopment.vehicle.AmphibiousVehicle;
import pl.housedevelopment.vehicle.VehicleType;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 123456789, "123 pl.housedevelopment.Main Street", "01/01/1970");

        Tenant tenat1 = new Tenant("John", "Doe", 123456789, "123 pl.housedevelopment.Main Street", "01/01/1970");
        Tenant tenat2 = new Tenant("Jane", "Doe", 987654321, "321 pl.housedevelopment.Main Street", "01/01/1970");

        TenantLetter tenantLetter1 = new TenantLetter(tenat1,"01/01/2020", "Content 1", 1000.0);
        TenantLetter tenantLetter2 = new TenantLetter(tenat1,"01/01/2020", "Content 2", 2000.0);
        TenantLetter tenantLetter3 = new TenantLetter(tenat1,"01/01/2020", "Content 3", 2000.0);

        tenat1.addTenantLetter(tenantLetter1);
        tenat1.addTenantLetter(tenantLetter2);
        tenat1.addTenantLetter(tenantLetter3);

        AmphibiousVehicle vehicle1 = new AmphibiousVehicle("Amphibious pl.housedevelopment.vehicle.Vehicle 1", 100.0, VehicleType.AMPHIBIOUS, EngineType.DIESEL, 100, 1000.0, 100.0);
        System.out.println("Liczba listów dla 1 najemcy: " + tenat1.getTenantLetters().size());

        System.out.println(vehicle1);
    }
}