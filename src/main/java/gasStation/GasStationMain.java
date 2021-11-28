package gasStation;


import java.util.Scanner;

public class GasStationMain {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        Petrol diesel = new Petrol("diesel", 1.30);
        Petrol petrol95 = new Petrol("petrol 95", 1.35);
        Petrol petrol98 = new Petrol("petrol 98", 1.38);

        menuOfGasSelection();

    }


}