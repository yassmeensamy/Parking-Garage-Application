package project;

public class FirstCome implements Reservation {
    @Override
    public int getSlotId(Slots[] array, vehicle object) {
        int numSlot = 0 ;
        for(int i=0;i<5;i++)
        {
            if(array[i].getEmpty() && array[i].getDepth()>=object.getDepth()&&array[i].getWidth()>=object.getWidth())
            {
                array[i].setEmpty(false);
                numSlot = i+1;
                break;
            }
        }
        return numSlot;
    }
}
