public class Main {
    public static void main(String[] args) {
        //psv main is the entry point function that java expects to find and run first

        //Make an instance of a car object
        Car geoffsCar = new Car("Purple", "Ferrari", "F40", 4, false);
        Car drewsCar = new Car("Black", "Nissan", "300ZX", 4, false);
        Car dextersCar = new Car("White", "Mitsubishi", "Minicab", 4, false);

        //Originally, we set the property values manually. Later, we changed it to
        //send arguments to the constructor method
//        geoffsCar.color = "Purple";
//        geoffsCar.make = "Ferrari";
//        geoffsCar.model = "F40";
//
//        drewsCar.color = "Red";
//        drewsCar.make = "Nissan";
//        drewsCar.model = "300ZX";

        Car[] theGarage = new Car[3];   //Declare and size the object array
        theGarage[0] = geoffsCar;
        theGarage[1] = dextersCar;
        theGarage[2] = drewsCar;

//        for (int i = 0; i < theGarage.length; i++)
//        {
//            theGarage[i].beepTheHorn();
//            theGarage[i].accelerate(10);
//        }

        for (Car currentCar : theGarage) {
            currentCar.beepTheHorn();
            currentCar.accelerate(15);
        }

        //Print a message using a value from the geoff car object
//        System.out.println("Geoff (who is def cool) drives a " + geoffsCar.make + " " + geoffsCar.model);
        //Call a method of the geoff car object
//        geoffsCar.beepTheHorn();
        geoffsCar.accelerate(120);
        geoffsCar.doADonut();
    }
}