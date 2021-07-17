public class CarObject{
    
    String owner;
    // private String owner;
    String location;
    String model;

    // public void setowner(String ow){
    //     owner = ow;
    // }

    // public String getowner(){
    //     return owner;
    // }

    public CarObject(String owner, String location, String model){
        String gear = "0";
        String trafficator = "straight";
        this.owner = owner;
        this.location = location;
        this.model = model;
        details();
    }

    public CarObject(){
    }

    static public void details(){
        System.out.println("The car model is " + model + " it is owned by " + owner + " and she is located at " + location);
    }

    
    public static void main(String[] args){
        CarObject newobj = new CarObject("Maryann", "Onitsha", "Benz 2025");
        // newobj.setowner("ibrahim");
    }
  
}