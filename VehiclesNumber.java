package project;

public class VehiclesNumber implements Display{
    @Override
    public void display() {
        System.out.println("The total number of vehicles is :");
        Calculations c= Calculations.getistance() ;
        System.out.println(c.num_vechile);
    }
}
