package project;

public class TotalIncome implements Display {
    @Override
    public void display() {
        System.out.println("The total income is :");
        Calculations c = Calculations.getistance();
        System.out.println(c.total_income);
    }

}