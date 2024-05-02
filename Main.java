public class Main{

    public static void displayDetails(){
                
        Car dCar = new Car("Toyota","Vios",2035,11);

        System.out.println("Car Details:");
        System.out.println("Make: "+dCar.getMake());
        System.out.println("Model: "+dCar.getModel());
        System.out.println("Year: "+dCar.getYear());
        System.out.println("Number of Doors: "+dCar.getNumberOfDoors());
        
    }
    public static void main(String[] args) {

        displayDetails();
       }
}
class Vehicle{
    private String make;
    private String model;
    private int year;


    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

class Car extends Vehicle{

    private int numberOfDoors;

    public Car(String make, String model,int year, int numberOfDoors){
        setMake(make);
        setModel(model);
        setYear(year);
        setNumberOfDoors(numberOfDoors);
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }



}