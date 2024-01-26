public class Car {
    //This class is used to define the properties and behaviours of a Car
    //in this software program

    //Property (or class, or member) variables
    private String color;
    String make;
    String model;
    int numberOfWheels = 4; //The 4 is set as a default. It can be overwritten, but will be used if no other value is provided.
    boolean isAutomatic;
    int currentSpeed = 0;           //km/h
    String driverName;

    //Behaviours or actions a car can do
    //Constructor method (The special one used for building or INSTANTIATING an object)
    //Constructor runs when the NEW keyword is used
//    public Car(String color, String make, String model) {
//        this.color = color;
//        this.make = make;
//        this.model = model;
//    }


    public Car(String color, String make, String model, int numberOfWheels, boolean isAutomatic) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.isAutomatic = isAutomatic;
    }

    public void forward() {}
    public void reverse() {}
    public void stop() {
        //Write the code here to make the car stop
    }
    public void accelerate(int rateOfAcceleration) {
        //Write the code here to make the car accelerate
        if (rateOfAcceleration < 500) {
            System.out.println("The starting speed of the " + this.make + " is " + this.currentSpeed + " km/h.");
            this.currentSpeed += rateOfAcceleration;
            System.out.println("The new speed, after accelerating, is " + this.currentSpeed + " km/h.");
        }
    }
    public void turnLeft() {}
    public void turnRight() {}
    public void beepTheHorn() {
        System.out.println("The " + this.make + " honks its horn. BEEEEEEEPPPPPPPPP!");
    }
    public void doADonut() {
        System.out.println("The " + this.make + " won the race and does a donut! WOOOOOOOOOHOOOOOOOOOOOOO!");
    }
}
