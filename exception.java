import java.util.HashSet;
import java.util.Iterator;

public class exception{
    public exception(){

        int x = 8;
        try{
            String[] food = {"yam", "beans", "garri", "potato", "donut"};
            if(x > 4){
                throw new ArrayIndexOutOfBoundsException("invalid value supplied");
            }else{
                System.out.println(food[x]);
            }
            
        }catch(Exception e){
            System.out.println("invalid value");
            //System.out.println(e); if an errror is throw
        }
        finally{
            System.out.println("operation completed");
        }


    }

    public static void main(String[] args){
        exception r = new exception();
    }
}