// Polymorphism is in short: one method, with different implementations.

class MainVehicles {
   public static void main(String[] args) {       
       Vehicle vehicle = new Vehicle();
       Vehicle electric = new ElVehicle();
       Vehicle hybrid = new HybridVehicle();
       
       //calls
       vehicle.start();
       vehicle.resource();
       electric.start();
       electric.resource();
       hybrid.start();
       hybrid.resource();
   }
}

class Vehicle{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}

class ElVehicle extends Vehicle{
        public void resource(){
        System.out.println("I use electricity");
    }
}

class HybridVehicle extends Vehicle{
        public void resource(){
        System.out.println("I use both petrol and electricity");
    }
}
