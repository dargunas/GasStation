package gasStation;

public class GasStationService {


    public static Petrol[] petrolsPrice = new Petrol[4];
    private int petrolsPriceCount;

    public void menuOfGasSelection() {
        System.out.println("Welcome to Pumpkin Gas Station");
        System.out.println("Please choose actions from the menu");
        System.out.println("[---> 1. For diesel");
        System.out.println("[---> 2. For petrol 95");
        System.out.println("[---> 3. For petrol 98");
        System.out.println("[---> 4. For LPG gas");
    }

    public void menuOfRefuelingPoint() {
        System.out.println("Please choose your refueling point");
        System.out.println("Options are : [1]   [2]   [3]   [4]   [5]");
    }

    public void addPetrolPrice (Petrol priceToAdd) {
        for (Petrol petrol : petrolsPrice) {
            petrolsPrice[petrolsPriceCount] = priceToAdd;
            petrolsPriceCount ++ ;
        }
    }

    public void billToPay() {
        return;
    }

    public GasStationService() {
    }


}
