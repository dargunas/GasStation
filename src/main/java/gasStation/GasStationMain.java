package gasStation;


import java.util.Scanner;


public class GasStationMain {

    public static void main(String[] args) {

        GasStationService gasStationService = new GasStationService();

        Petrol diesel = new Petrol("diesel", 1.30);
        Petrol petrol95 = new Petrol("petrol 95", 1.35);
        Petrol petrol98 = new Petrol("petrol 98", 1.40);
        Petrol lpg = new Petrol("LPG", 0.55);

        gasStationService.addPetrolPrice(diesel);
        gasStationService.addPetrolPrice(petrol95);
        gasStationService.addPetrolPrice(petrol98);
        gasStationService.addPetrolPrice(lpg);

        Scanner scanner = new Scanner(System.in);

        gasStationService.menuOfRefuelingPoint();
        gasStationService.setRefuelingPoint(scanner.nextInt());
        gasStationService.menuOfGasSelection();
        gasStationService.setSelectionFromMenu(scanner.nextInt());
        gasStationService.enterQuantity();
        gasStationService.setQuantityOfGas(scanner.nextDouble());
        gasStationService.billCalculation();
        gasStationService.billToPay();
    }
}