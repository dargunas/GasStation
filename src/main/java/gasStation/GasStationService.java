package gasStation;

public class GasStationService {


    public static Petrol[] petrolPrices = new Petrol[4];
    private int petrolPriceCount;
    private double quantityOfGas;
    private int refuelingPoint;
    public double totalToPay;
    private int selectionFromMenu;

    public void enterQuantity() {
        System.out.println("Please enter quantity of gas you would like tu fill up: ");
    }

    public void menuOfGasSelection() {
        System.out.println("                         [  What would you like to fill up?   ]   ");
        System.out.println("                         [------->  1. For diesel    <--------]");
        System.out.println("                         [------->  2. For petrol 95 <--------]");
        System.out.println("                         [------->  3. For petrol 98 <--------]");
        System.out.println("                         [------->  4. For LPG gas   <--------]");
    }

    public void billCalculation() {
        if (selectionFromMenu == 1) {
            totalToPay = quantityOfGas * petrolPrices[0].getPrice();
        } else if (selectionFromMenu == 2) {
            totalToPay = quantityOfGas * petrolPrices[1].getPrice();
        } else if (selectionFromMenu == 3) {
            totalToPay = quantityOfGas * petrolPrices[2].getPrice();
        } else if (selectionFromMenu == 4) {
            totalToPay = quantityOfGas * petrolPrices[3].getPrice();
        } else {
            System.out.println("                       You have entered invalid number!!!");
            System.out.println("                       <-------------------------------->");
            System.out.println("                       <-----Please enter valid one.---->");
        }
    }

    public void menuOfRefuelingPoint() {
        System.out.println("");
        System.out.println("");
        System.out.println("      [-------------------> WELCOME TO PUMPKIN GAS STATION <----------------------]");
        System.out.println("");
        System.out.println("                         Please choose actions from the menu");
        System.out.println("");
        System.out.println("                             choose your refueling point");
        System.out.println("");
        System.out.println("                       Options are : [1]   [2]   [3]   [4]   [5]");
    }

    public void addPetrolPrice(Petrol priceToAdd) {
        petrolPrices[petrolPriceCount] = priceToAdd;
        petrolPriceCount++;
    }

    public void billToPay() {
        System.out.println("        }-------------------> Your bill to pay is <-----------------------{ ");
        System.out.println("");
        System.out.println("                           Refueling point --> " + refuelingPoint);
        System.out.println("");
        System.out.println("                                Gas : " + petrolPrices[selectionFromMenu - 1].getName());
        System.out.println("");
        System.out.println("                       Total to pay in checkout: " + totalToPay);
        System.out.println("");
        System.out.println(" |____________________________!!!HAVE A NICE DAY!!!________________________________|");
    }

    public int getSelectionFromMenu() {
        return selectionFromMenu;
    }

    public void setSelectionFromMenu(int selectionFromMenu) {
        this.selectionFromMenu = selectionFromMenu;
    }

    public double getQuantityOfGas() {
        return quantityOfGas;
    }

    public void setQuantityOfGas(double quantityOfGas) {
        this.quantityOfGas = quantityOfGas;
    }

    public int getRefuelingPoint() {
        return refuelingPoint;
    }

    public void setRefuelingPoint(int refuelingPoint) {
        this.refuelingPoint = refuelingPoint;
    }
}
