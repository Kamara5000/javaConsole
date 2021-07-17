import java.util.Scanner;

public class Thirdassign {
    static Scanner userInput = new Scanner(System.in);
    static Scanner login = new Scanner(System.in);
    static Scanner chooseoption = new Scanner(System.in);
    static Scanner typenOofstudents = new Scanner(System.in);
    static Scanner menuTab = new Scanner(System.in);
    static Scanner selectedans = new Scanner(System.in);

    static String score = "0";
    static String[] questions = {"1+1", "2+2", "Are you a developer ?"};
    static String[] answers = {"2", "4", "No"};
    static String stuanswer = "";
    static int zeroIndex = 0;
    static String choose;
    static String[][] newStudents;
    static int numOfstudent = 0;
    static int newScore = Integer.parseInt(score);
    static  int anotherScore = 0; 
    static int[] allScore = new int[numOfstudent];
    
    public static void main(String[] args){
        String register = "Register";
        String exam = "Exam";
        String scores = "High score";
        String exits = "Exit";
        System.out.println("\n Type any of these to choose \n");
        System.out.println(" > " + register + "\n" + " > " + exam + "\n" + " > "+ scores + " \n" + " > " + exits);
        choose = chooseoption.nextLine(); 
        if(choose.equals(register)){
        System.out.println("\n How many students are you registering ?");
        numOfstudent = typenOofstudents.nextInt();
        String[][] students = new String[numOfstudent][4];
        newStudents = students;
        System.out.println("Start Registration!");
        for(int i = 0; i < students.length; i++){
            students[i][3] = score;
            Register(students[i]);
        }
    }  else if(choose.equals(exam)){
        System.out.println("\n This is exam portal \n");
        Cbtexam(newStudents);
    }
    System.out.println("Type 0 to go back to menu");
    zeroIndex = menuTab.nextInt();
    if(zeroIndex == 0){
        System.out.println("\n Type any of these to choose \n");
        System.out.println(" > " + register + "\n" + " > " + exam + "\n" + " > "+ scores + " \n" + " > " + exits);
        choose = chooseoption.nextLine(); 
        if(choose.equals(exam)){
            System.out.println(" Login to start exam \n");
            Cbtexam(newStudents);
        }
    }

}
    public static void Register(String[] students){
        System.out.println(" Enter your name ?\n");
        students[0] = userInput.nextLine();
        System.out.println(" Enter your username ?\n");
        students[1] = userInput.nextLine();
        System.out.println(" Enter your password ?\n");
        students[2] = userInput.nextLine();   
    }

    public static void Cbtexam(String[][] students){
        
        String selectedquestion = "";
        String myanswers = "";
        for(int i = 0; i < students.length; i++){
            Scanner loginUser = new Scanner(System.in);
            System.out.println(" Enter your username \n");
            String username = loginUser.nextLine();
            System.out.println(" Enter your password \n");
            String password = loginUser.nextLine();
            String changeScore = "";
            if(students[i][1].equals(username) && students[i][2].equals(password)){
                System.out.println("Your fullname is " + students[i][1] + " " + students[i][0] + "\n");
                System.out.println(" Your questions are as follows: " + "\n");
                int newScore = Integer.parseInt(score);
                for (String quests : questions) {
                    selectedquestion = quests;
                    System.out.println("What is " + selectedquestion + "\n");
                    myanswers = selectedans.nextLine();
                    for (int ans = 0; ans < answers.length; ans++) {
                    if(myanswers.equals(answers[ans])){
                        newScore += 2;
                        changeScore = Integer.toString(newScore);
                    } else {
                        newScore -= 0;
                        changeScore = Integer.toString(newScore);
                    }
                }
            }
                int chanegmyScore = Integer.parseInt(students[i][3]);
                    students[i][3] = changeScore;
                    int maxScore = Integer.parseInt(students[i][3]);
                    int checkingMax = Math.max(maxScore, 0);
                    System.out.println("\n" + "Your total score is " + checkingMax + "\n");
                    allScore[i] = Integer.parseInt(students[i][3]);
                    // System.out.println(students[i][3]);
                    anotherScore = allScore[0];
    
                    for(int z = 1; z < allScore.length; z++){
                        System.out.println(allScore[z]);
                        int eachRes = allScore[z];

                        if(eachRes > anotherScore){
                            anotherScore = eachRes; 
                        }
                    }

        } 
            // else {
            //     System.out.println("Incorrect password");
            //     System.out.println(" Enter your username \n");
            //     username = loginUser.nextLine();
            //     System.out.println(" Enter your password \n");
            //     password = loginUser.nextLine();
            // }
        }

        for(int w = 0; w < students.length; w++){
            if(anotherScore == Integer.parseInt(students[w][3])){
                System.out.println(students[w][0] + " scored " + anotherScore);
            }
        }
    }

        public static void Studentmarks(){
         
        }
}

    
