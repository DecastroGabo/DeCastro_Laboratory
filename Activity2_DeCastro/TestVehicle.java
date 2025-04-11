package Activity2_DeCastro;
import java.util.Scanner; 
class Vehicle {
        private String brand;
        private double speed;
        private String fuelType;
    
        public Vehicle (String brand, double speed, String fuelType){
            this.brand = brand;
            this.speed = speed;
            this.fuelType = fuelType;
        }

        public String getBrand() {
            return this.brand;
        }
        public double getSpeed() {
            return this.speed;
        }
        public String getfuelType() {
            return this.fuelType;
        }
        
        public void displayInfo() { 

            System.out.println("Brand: " + brand); 
            System.out.println("Speed: " + speed + " km/h");    
            System.out.println("Fuel Type: " + fuelType);     
        }
    } 
        class Car extends Vehicle{
            private int numDoors;

            public Car(String brand, int speed, String fuelType, int numDoors) { 
                super(brand, speed, fuelType); 
                this.numDoors = numDoors; 
            } 
        
        
        @Override
        
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Door Numbers: " + numDoors);
        }
    }

        class Motorcycle extends Vehicle{
            private boolean hasSideCar;

             
        public Motorcycle(String brand, int speed, String fuelType, boolean hasSideCar) { 
            super(brand, speed, fuelType); 
            this.hasSideCar = hasSideCar; 
    }
        @Override
        
        public void displayInfo() {
            super.displayInfo();
            System.out.println("SideCars: " + (hasSideCar ? "Yes" : "No"));
    }
}       

        public class TestVehicle{   
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in); 
                System.out.println("Enter Car Details"); 
                System.out.print("Brand:"); 

                String carBrand = scan.nextLine(); 

                System.out.print("Speed:"); 

                int carSpeed = (int) scan.nextDouble(); 
                scan.nextLine(); 

                System.out.print("Fuel Type:"); 
                String carFuel = scan.nextLine(); 

                System.out.print("Number of Doors:"); 
                int numDoors = (int) scan.nextDouble(); 
                scan.nextLine(); 

                System.out.println("\nEnter Motorcycle Details:"); 
                System.out.print("Brand: ");

                String Brand = scan.nextLine(); 
                System.out.print("Speed: "); 
                int Speed = (int) scan.nextDouble(); 
                scan.nextLine();  
                System.out.print("Fuel Type: "); 
                String Fuel = scan.nextLine(); 
                System.out.print("Has Sidecar? (true/false):  "); 
                boolean hasSidecar = scan.nextBoolean(); 
         
                Vehicle car = new Car(carBrand, carSpeed, carFuel, numDoors); 
                Vehicle motorcycle = new Motorcycle(Brand, Speed, Fuel, hasSidecar); 
         
            
                System.out.println("\nCar Details:"); 
                car.displayInfo(); 
                System.out.println(); 
                System.out.println("Motorcycle Details:"); 
                motorcycle.displayInfo(); 
         
                scan.close(); 
    }


}

        









