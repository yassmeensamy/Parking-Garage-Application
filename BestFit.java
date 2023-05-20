package project;

public class BestFit  implements Reservation {
    @Override
    public int getSlotId(Slots[] array, vehicle object) {
        int numSlot = 0;
        int minWidth = 10000;
        int minDepth = 10000;
        for (int i = 0; i < 5; i++) {
            if (array[i].getEmpty() && array[i].getDepth() >= object.getDepth() && array[i].getWidth() >= object.getWidth()) {
                if (minWidth > object.getWidth() && minDepth > object.getDepth()) {
                    minWidth = object.getWidth();
                    minDepth = object.getDepth();
                    numSlot = i + 1;
                }
            }
        }
        return numSlot;
    }
}