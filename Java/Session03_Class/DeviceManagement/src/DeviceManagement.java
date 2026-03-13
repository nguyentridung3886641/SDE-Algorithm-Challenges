import java.util.Scanner;

import Data.Devices;

public class DeviceManagement {
    
    public static void main(String[] args) {
        showDeviceDetails();
    }

    public static void showDeviceDetails() {
        Devices[] list = new Devices[2];
        String id, name, brand;
        int releaseYear;
        double price;

        Scanner src = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            id = src.nextLine();
            name = src.nextLine();
            brand = src.nextLine();
            releaseYear = Integer.parseInt(src.nextLine());
            price = Double.parseDouble(src.nextLine());

            list[i] = new Devices(id, name, brand, releaseYear, price);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(list[i].toString());
        }
        src.close();
    }
}
