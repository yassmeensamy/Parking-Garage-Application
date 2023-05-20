package project;

public class Slots {
    private int width ;
    private int depth ;
    private int slotId ;
    private boolean isEmpty ;
    public vehicle v ;

    public Slots ( int w , int d ,int s  ) {
        this.width = w;
        this.depth = d ;
        this.slotId = s ;
        this.isEmpty = true;
    }

    public Slots() {
        isEmpty = true ;

    }

    public void setWidth(int w){
        width = w ;
    }
    public void setDepth(int d){
        depth = d ;
    }
    public void setSlotId(int id){
        slotId = id ;
    }
    public void setEmpty(boolean iE ){
        isEmpty = iE ;
    }
    public int getWidth(){
        return width ;
    }
    public int getDepth(){
        return depth ;
    }
    public int getSlotId(){
        return slotId ;
    }
    public boolean getEmpty(){
        return isEmpty ;
    }

    public void setSlotid(int i) {
        slotId = i ;
    }

}
