package project;

import java.text.ParseException;

public class DriverForm {
    public int parkIn (int num,Slots []array,vehicle object){
        int chosenSlot=0 ;
        if (num==1){
            Reservation obj = new FirstCome() ;
            chosenSlot = obj.getSlotId(array,object);
        }
        else if (num==2){
            Reservation obj = new BestFit() ;
            chosenSlot = obj.getSlotId(array, object);
        }
        if(chosenSlot!=0) {
            System.out.println("Your slot is slot number :" + chosenSlot);
        }
        else
            System.out.println("Sorry ,No available slots");
        return chosenSlot ;
    }

    public void parkOut (Slots[]array,int s) throws ParseException {
        CalcTime CT = new CalcTime();
        array[s-1].v.setDepartureTime(CT.CurrentTime());
        Bill b = new Bill() ;
        long cost = b.calcFees(array[s-1].v);
        System.out.println("The total fees is :");
        System.out.println(cost);
        Calculations c = Calculations.getistance();
        c.incr_income(cost);
        array[s-1].setEmpty(true);
    }
}
