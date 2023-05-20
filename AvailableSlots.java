package project;

public class AvailableSlots {
    public void Display(Slots[] MySlots) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        for (int i = 0; i < 5; i++) {
            if (MySlots[i].getEmpty()) {
                System.out.print(" \n");
                System.out.printf(" slot %d", i + 1);
                System.out.printf(" width=%d", MySlots[i].getWidth());
                System.out.printf(" depth=%d", MySlots[i].getDepth());
                System.out.print(" \n");
            }
        }
        System.out.print(" \n");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");


    }
}