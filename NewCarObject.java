public class NewCarObject{
    public static void main(String[] args){
        CarObject obj = new CarObject();
        obj.owner = "Peter"; 
        obj.location = "Portharcourt";
        obj.details();

        CarObject newobj = new CarObject();
        newobj.owner = "Lucky"; 
        newobj.location = "dollyhills";
        newobj.details();
        // obj.details("maryann", "Lagos");
        // newobj.details("Onyeka", "onitsha");
    }
}