import java.util.Scanner;
public class FirstClassAssignment{
	public static void main(String[] Args){
		// System.out.println("It is working");
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("WELCOME TO JAVA CLASS !!!");
		System.out.print("How many students do you wish to Register? Enter the number: ");
		String studentNos = userInput.nextLine();

		String[][] studentInfo = new String[Integer.parseInt(studentNos)][6];

		// String[][] studentInfo = new String[5][6];
		
		for(int i = 0; i < studentInfo.length; i++){
			
			System.out.print("Enter your FirstName: ");
			studentInfo[i][0] = userInput.nextLine();

			System.out.print("Enter your LastName: ");
			studentInfo[i][1] = userInput.nextLine();

			System.out.print("Enter your Course: ");
			studentInfo[i][2] = userInput.nextLine();

			System.out.print("Enter your Level: ");
			studentInfo[i][3] = userInput.nextLine();

			System.out.print("Enter your Age: ");
			studentInfo[i][4] = userInput.nextLine();
			
			String fullname = studentInfo[i][0] + " "+ studentInfo[i][1];
			System.out.println("fullname: "+ studentInfo[i][0] + " "+ studentInfo[i][1]);
			System.out.println("Course: "+ studentInfo[i][2]);
			System.out.println("Level: "+ studentInfo[i][3]);
			System.out.println("Age: "+ studentInfo[i][4]);
				
			if( i+1 == studentInfo.length ){
				System.out.println("Thanks to all Students for supplying their details");
				System.out.println("CLICK TO WRITE TEST");
			}else {
				System.out.println("Thanks for registering your details!!! "+ fullname + ", Click enter for next student");
			}
			userInput.nextLine();
		}
		int[] allResult = new int[Integer.parseInt(studentNos)];

		for(String[] stud : studentInfo) {
			String[] questions= {
						"Is Boolean a programming language? True or False",
						"Are you a programmer? Yes or No",
						"Does Java starts with an alphabet J? True or False",
						"Are you are a Human Being?  A. Yes   B. Not yet   C. None of the Above   D. No",
						"Which of the following is a JAVA file extension?  A. jsx   B.js   C. html   D. java   E. None of the Above",
				};
			int[] answerArr = {0,0,0,0,0};
			int reslt = 0;
			System.out.println("Welcome "+ stud[0].toUpperCase() + " " + stud[1].toUpperCase());
			System.out.println("Click to write your Test "+ stud[0].toUpperCase());
			userInput.nextLine();
			for(int qq = 0; qq < questions.length; qq++){
				System.out.print("Question "+ (qq+1 + ": "));
				System.out.println(questions[qq]);
				System.out.print("Answer: ");
				String myAnswer = userInput.nextLine();
				if (qq==0) {	
					if (myAnswer.toLowerCase().equals("false")) {
						answerArr[0] = 1;
					} else {
						System.out.println("This is Incorrect");
					}
				} else if(qq == 1){
					if (myAnswer.toLowerCase().equals("yes")) {
						answerArr[1] = 1;
					} else {
						System.out.println("This is Incorrect");
					}
				} else if(qq == 2){
					if (myAnswer.toLowerCase().equals("true")) {
						answerArr[2] = 1;
					} else {
						System.out.println("This is Incorrect");
					}
				} else if (qq == 3){
					if (myAnswer.toLowerCase().equals("yes") || myAnswer.toLowerCase().equals("a")) {
						answerArr[3] = 1;
					} else {
						System.out.println("This is Incorrect");
					}
				} else if(qq == 4){
					if (myAnswer.toLowerCase().equals("java") || myAnswer.toLowerCase().equals("d")) {
						answerArr[4] = 1;
					} else {
						System.out.println("This is Incorrect");
					}
				}
			}
			reslt = answerArr[0] + answerArr[1] + answerArr[2] + answerArr[3] + answerArr[4];
			System.out.println(stud[0].toUpperCase() + ", You scored "+ reslt +" out of "+ questions.length + " with " + (reslt*100)/questions.length + "%.");
			userInput.nextLine();
			stud[5] = "" + reslt;

		}

		// Trying to get the maximum number inside an array of numbers
		for(int std = 0; std < studentInfo.length; std++){
			allResult[std] = Integer.parseInt(studentInfo[std][5]); //converting string of numbers from each arrays and inserting it into only a single array 
		}
		String winnerName = null;
		int maxRes = allResult[0];  //intializing the maximum result variable with the first element in an array;
	
		for(int yy = 1; yy < allResult.length; yy++){
			int eachRes= allResult[yy];
		 	if(eachRes > maxRes){
				maxRes = eachRes; //finalizing the maximum value from the array list
			}
		}
		for(int std = 0; std < studentInfo.length; std++){
			if(maxRes == Integer.parseInt(studentInfo[std][5])){   //checking to know know the array for the maximum value;
				winnerName = studentInfo[std][0].toUpperCase() + " " +studentInfo[std][1].toUpperCase();  //fetching out the user with the maximum result;
				// winnerName[std] = studentInfo[std][0].toUpperCase() + " " +studentInfo[std][1].toUpperCase();
			}
		}
		System.out.println("And the winner is: " + winnerName + " with the maixmum score of: " + maxRes);
		// for (int winName = 0; winName < winnerName.length; winName++) {
			// System.out.println("The Winner is: " + winnerName[winName] + " with the maximum score of: " + maxRes);		
			
		// }
	}
}