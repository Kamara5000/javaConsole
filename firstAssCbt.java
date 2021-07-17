import java.util.Scanner;

public class firstAssCbt {
    Scanner studentInput = new Scanner(System.in);
    String[][] studentDetails;
    String studNum;
    
    public firstAssCbt(){
      
        System.out.println("WELCOME TO JAVA101 CBT TEST 1!!!!");
        studentInfo();
        quiz();
        result();
    
       // System.out.print(studentDetails[0][0]);
    }

    public  void studentInfo(){
        System.out.print("Enter number of Students: ");
        studNum = studentInput.nextLine();

        studentDetails = new String[Integer.parseInt(studNum)][6];

        System.out.println(studentDetails.length);

        for (int i =0; i< studentDetails.length; i++) {

            System.out.println("Enter the details of student number " + (i+1)  );
            
            System.out.print("Enter your FirstName: ");
            studentDetails[i][0] = studentInput.nextLine(); 
            
            System.out.print("Enter your  Last name:");
            studentDetails[i][1] = studentInput.nextLine();

            System.out.print("Enter your course: ");
            studentDetails[i][2]=studentInput.nextLine();

            System.out.print("Enter your level: ");
            studentDetails[i][3]=studentInput.nextLine();

            System.out.print("Enter your age: ");
            studentDetails[i][4]=studentInput.nextLine();

            String fullname = studentDetails[i][0] + " "+ studentDetails[i][1];

            if( i+1 == studentDetails.length ){
				System.out.println("All students registered");
				System.out.println("CLICK TO WRITE TEST");
			}else {
				System.out.println("Thanks for registering your details!!! "+ fullname + ", Click enter for next student");
			}
			studentInput.nextLine();

        }

    }

    public void quiz(){



        for (String[] stud : studentDetails) {
            String[] test= {
                "java is a programming language? True or False",
                "Is java dificult to learn? Yes or No",
                "Java is the only programming  language? True or False",
                "Are you a java student?  A. Yes   B. Not yet   C. None of the Above   D. No",
                "Which of the following not a java keyword?  A. kut   B.int  C. boolean   D. float   E. None of the Above",
            };

            int ans[] ={0,0,0,0,0};
            System.out.println("Welcome "+ stud[0].toUpperCase() + " " + stud[1].toUpperCase());
			System.out.println("Click to write your Test "+ stud[0].toUpperCase());
			studentInput.nextLine();

            for (int j = 0; j < test.length; j++) {
                System.out.print("Question "+ (j+1 + ": "));
				System.out.println(test[j]);
				System.out.print("Answer: ");
				String answer = studentInput.nextLine();
				if (j==0) {	
					if (answer.toLowerCase().equals("true")) {
						ans[0] = 1;
					} else {
						System.out.println("This is Incorrect");
					}
                }else if(j == 1){
					if (answer.toLowerCase().equals("yes")) {
						ans[1] = 1;
					} else {
						System.out.println("This is Incorrect");
					}
				} else if(j == 2){
					if (answer.toLowerCase().equals("false")) {
						ans[2] = 1;
					} else {
						System.out.println("This is Incorrect");
					}
				} else if (j == 3){
					if (answer.toLowerCase().equals("yes") || answer.toLowerCase().equals("a")) {
						ans[3] = 1;
					} else {
						System.out.println("This is Incorrect");
					}
				} else if(j == 4){
					if (answer.toLowerCase().equals("kut") || answer.toLowerCase().equals("a")) {
						ans[4] = 1;
					} else {
						System.out.println("This is Incorrect");
					}
				} 
            }

            int result = ans[0]+ans[1]+ans[2]+ans[3]+ans[4];

            System.out.println(stud[0].toUpperCase() +  " You obtain " + (result*100)/test.length + "%.");
			studentInput.nextLine();
			stud[5] = "" + ((result*100)/test.length);

        }
        
    }

    public void result(){
        int[] results = new int[Integer.parseInt(studNum)];
        String winner = null;
        
        //System.out.println(studentDetails[0][5]);
        for (int i = 0; i < studentDetails.length; i++) {
            results[i] = Integer.parseInt(studentDetails[i][5]);
            
        }
        int higestScore = results[0];

        for (int k = 1;  k< results.length; k++) {
            int score = results[k];
            if (score>higestScore) {
                higestScore=score;
             }
            
        }

        
        for(int win = 0; win < studentDetails.length; win++){
			if(higestScore == Integer.parseInt(studentDetails[win][5])){  
				winner = studentDetails[win][0].toUpperCase() + " " +studentDetails[win][1].toUpperCase();
				
			}
		}

        System.out.println("The winner is"+""+ winner + "" + "with"+""+ higestScore + "%" +""+ "highest score"  );
        

    
    }



    

    public static void main(String[] args) {
        firstAssCbt fa = new firstAssCbt();
    }
}
