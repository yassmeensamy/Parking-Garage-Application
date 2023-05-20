package project;

import java.text.ParseException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        int selectedAlgorithm = 0;
        Garage obj = new Garage();
        selectedAlgorithm = obj.selectAlgotithm();
        //Slots[] array = new Slots[5];
        OwnerForm obj3 = new OwnerForm();
        obj3.addslots(obj.array);
        while (true){
            System.out.println("1.garageOwner   2.Driver    3.Exit ");
            int choice = input.nextInt();
            if (choice == 1){
                System.out.println("1.displayAvailableSlots   2.displayTotalIncome    3.displayVehiclesNumber ");
                int choice3 = input.nextInt();
                if (choice3 == 1){
                    AvailableSlots a = new AvailableSlots() ;
                    a.Display(obj.getArray());
                }
                else if (choice3 == 2){
                    TotalIncome t = new TotalIncome();
                    t.display();
                }
                else if (choice3 == 3 ){
                    VehiclesNumber v = new VehiclesNumber() ;
                    v.display();
                }

            }
            else if (choice == 2 ) {
                DriverForm DF = new DriverForm();
                System.out.println("1.parkIn   2.parkOut  ");
                int choice2 = input.nextInt();
                if (choice2 ==1 ){
                    System.out.print("\n");
                    System.out.println("Vehicle's depth: ");
                    int depth = input.nextInt();
                    System.out.println("Vehicle's width: ");
                    int width = input.nextInt();
                    System.out.println("Vehicle's ID: ");
                    int id = input.nextInt();
                    System.out.println("Vehicle's model year: ");
                    int model_year = input.nextInt();
                    System.out.println("Vehicle's model name: ");
                    String modelName = input.next();
                    vehicle obj2 = new vehicle(width, depth, modelName, model_year, id);
                    int ind=(DF.parkIn(selectedAlgorithm, obj.getArray(), obj2))-1 ;
                    if ( ind == -1 )continue;
                    obj.array[ind].v = obj2;
                }
                else if (choice2 == 2 ) {
                    System.out.println("Please enter the number of your slot");
                    int x = input.nextInt();
                    DF.parkOut(obj.getArray(), x);

                }
                }
            else break;
            }
        }
}
