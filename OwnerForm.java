package project;

import java.util.Scanner;

public class OwnerForm {
    public void addslots(Slots []MySlots)
    {

        for(int i=0;i<5;i++)
        {
            System.out.println("please Enter width and depth for slot " + (i+1));
            int w,d;
            Scanner input=new Scanner(System.in) ;
            w=input.nextInt();
            d=input.nextInt();
            MySlots[i].setSlotid(i);
            MySlots[i].setDepth(d);
            MySlots[i].setWidth(w);
        }
        //return MySlots ;
    }


}

