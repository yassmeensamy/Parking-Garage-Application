package project;

import java.util.Scanner;

public class Garage {
    private String garageName, ownerName;
    public Slots[] array;

    public Garage() {
         array = new Slots[5];
        for (int i=0; i<5; i++){
            array[i] =new Slots();
        }
    }

    public Garage(String g, String o ) {
        this.garageName = g;
        this.ownerName = o;
         array = new Slots[5];
    }

    public Slots[] getArray() {
        return array;
    }

    public int selectAlgotithm()
    {
        int system;
        System.out.println();
        System.out.println("which Algorithm do you want to select ?: ");
        System.out.println("1.first come first served slot  ");
        System.out.println("2. best fit slot ");
        Scanner input=new Scanner(System.in);
        system=input.nextInt();
        return system ;
    }
}
