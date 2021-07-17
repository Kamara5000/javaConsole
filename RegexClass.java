import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexClass{

    public RegexClass(){
        // String comment = "This is a java class talking about regular expression today";
        // Pattern text = Pattern.compile("java class", Pattern.CASE_INSENSITIVE);
        // Matcher search = text.matcher(comment);
        // boolean available = search.find();
        // if(available){
        //     System.out.println("we found it");
        // }else{
        //     System.out.println("no such word exists");
        // }
            //if any word contain  abc Pattern.compile("[abc]", Pattern.CASE_INSENSITIVE)
            //if any sentence contain  0-9    Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE)
            //if any sentence does not contain abc  This    Pattern.compile("[^abc]", Pattern.CASE_INSENSITIVE)
            //if any sentence contain  start with This    Pattern.compile("r\^this", Pattern.CASE_INSENSITIVE)
            //if any sentence contain a last word that is 'this'  Pattern.compile("$this", Pattern.CASE_INSENSITIVE)
            //if any sentence contain a match twice  Pattern.compile("re{2", Pattern.CASE_INSENSITIVE)
            //if any sentence contain  any word character Pattern.compile("\w", Pattern.CASE_INSENSITIVE)
            //if any sentence doesnt contain  any word Pattern.compile("\W", Pattern.CASE_INSENSITIVE)
            //if any sentence contain  any whitespace Pattern.compile("\s", Pattern.CASE_INSENSITIVE)
            //if any sentence doesnot contain any whitespace  0-9 Pattern.compile("\S", Pattern.CASE_INSENSITIVE)
            //if any sentence contain  number/digit Pattern.compile("\d", Pattern.CASE_INSENSITIVE)
            //if any sentence contain non/digit Pattern.compile("\D", Pattern.CASE_INSENSITIVE)
            //if any sentence begining Pattern.compile("\a", Pattern.CASE_INSENSITIVE)
            //if any sentenc ends  Pattern.compile("\Z", Pattern.CASE_INSENSITIVE)
            //if any sentence contain any character except new line  0-9 Pattern.compile(".", Pattern.CASE_INSENSITIVE)



            // String comment = "This is a java class talking about todays date been 17/06 of year 2021";
            // String matchP = "(.*)(\\d+)(.*)";
            // Pattern text = Pattern.compile(matchP, Pattern.CASE_INSENSITIVE);
            // Matcher search = text.matcher(comment);
            // boolean available = search.find();
            // if(available){
            // System.out.println("we found "+search.group());
            // }else{
            // System.out.println("no such word exists");
            // }

            String comment = "This is a java class talking about todays date been 17/06 of year 2021";
            String matchP = "java";
            Pattern text = Pattern.compile(matchP, Pattern.CASE_INSENSITIVE);
            Matcher search = text.matcher(comment);
            String output = search.replaceAll("C++"); 
            //replaceFirst- replace any first match
            System.out.println(output);
            




        
    }

    public static void main(String[] args){
        RegexClass fc = new RegexClass();
        
    }
}