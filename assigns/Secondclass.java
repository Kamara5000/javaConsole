import java.util.Scanner;
import java.lang.*;

public class Secondclass{
    public static void main(String[] args){
        int numOfstudent;
        String nameOfstudent;
        String[] question = {"4+4", "16+16", "7+7", "3+4"};
        int[] ans = {8,32,14,7};
        String score = "0";
        // int[] allScore = new int[numOfstudent];
        Scanner userInput = new Scanner(System.in);
        Scanner studentName = new Scanner(System.in);
        Scanner ansQuestion = new Scanner(System.in);
        
        System.out.println("How many student are taking the exam?");
        numOfstudent = userInput.nextInt();

        String[][] students = new String[numOfstudent][3];
        String fName = "";
        String lName = "";
        String selectedquestion = "";
        String selectedans = "";
        int myanswers;
        int[] allScore = new int[numOfstudent];
        int anotherScore = 0;
        for(int i = 0; i < students.length; i++){
            int nums = i+1;
            System.out.println("Student No " + nums + " What is your name ?");
            students[i][0] = studentName.nextLine();
            System.out.println("Student No " + nums + " What is your Lastname ?");
            students[i][1] = studentName.nextLine();
            students[i][2] = score;
            System.out.println("Your fullname is " + students[i][1] + " " + students[i][0] + "\n");
            System.out.println(" Your qusetions are as follows: " + "\n");
            int newScore = Integer.parseInt(score);
            String changeScore = "";
            for (String quests : question) {
                selectedquestion = quests;
                System.out.println("What is " + selectedquestion + "\n");
                myanswers = ansQuestion.nextInt();
                for (int answers = 0; answers < ans.length; answers++) {
                if(myanswers == ans[answers]){
                    newScore += 2;
                    changeScore = Integer.toString(newScore);
                } else {
                    newScore -= 0;
                    changeScore = Integer.toString(newScore);
                }
            }
        }
            int chanegmyScore = Integer.parseInt(students[i][2]);
                students[i][2] = changeScore;
                int maxScore = Integer.parseInt(students[i][2]);
                int checkingMax = Math.max(maxScore, 0);
                System.out.println("\n" + "Your total score is " + checkingMax + "\n");

                allScore[i] = Integer.parseInt(students[i][2]);
                anotherScore = allScore[0];

                for(int z = 1; z < allScore.length; z++){
                    int eachRes = allScore[z];
                    if(eachRes > anotherScore){
                        anotherScore = eachRes; 
                    }
                }
        }  

        for(int w = 0; w < students.length; w++){
            if(anotherScore == Integer.parseInt(students[w][2])){
                System.out.println(students[w][0] + " scored " + anotherScore);
            }
        }
        
    }
}