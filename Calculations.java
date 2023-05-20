package project;

public class Calculations {
    public int num_vechile = 0;
    public long total_income = 0;
    private static Calculations istance = new Calculations();

    private void calculations() {
    }

    public static Calculations getistance() {
        return istance;
    }

    public void numVehicles() {
        num_vechile++;
    }

    public void incr_income(long fees) {
        total_income += fees;
    }

}

