package project;

public class vehicle {
    private int width;
    private int depth ;
    private String modelName ;
    private int modelYear ;
    private int id ;
    private String arrivalTime ;
    private String departureTime ;

    public vehicle() {

    }
    public vehicle (int w , int d , String mn , int my , int i  ){
        this.width = w ;
        this.depth = d ;
        this.modelName = mn ;
        this.modelYear = my ;
        this.id = i ;
        CalcTime obj = new CalcTime();
        arrivalTime= obj.CurrentTime();
        Calculations c = Calculations.getistance();
        c.numVehicles();
    }

    public void setWidth (int w ){
        width = w ;
    }
    public void setDepth (int d ){
        depth = d ;
    }
    public void setModelName (String mn ){
        modelName = mn ;
    }
    public void setModelYear (int my ){
        modelYear = my ;
    }
    public void setId (int i ) {id = i ;}
    public void setDepartureTime (String dt ){
        departureTime = dt ;
    }
    public int getWidth () {
        return width ;
    }
    public int getDepth () {return depth ;}
    public int getModelYear (){
        return modelYear ;
    }
    public int getId (){
        return id ;
    }
    public String getModelName (){
        return modelName ;
    }
    public String getArrivalTime (){
        return arrivalTime ;
    }
    public String getDepartureTime (){
        return departureTime ;
    }
}
