import java.util.Scanner;
public class HighestScoreName {

    public static void main(String[] args) {
        highestScoreName();
    }

    public static void highestScoreName(){
        //  Write a program that prompts the user to enter the number of students and each students
        //  name and score, and finally displays the name of the student with the highest score.
        int highestNo = 0;
        String highestName;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Kindly enter the number of students, who partook in the exam");
        int numberOfStudent = userInput.nextInt();
        for(int count=0; count<numberOfStudent; count++){
            System.out.printf("Enter the name of student: ");
            String name = userInput.next();
            System.out.printf("Enter the score for %s: ", name);
            int score = userInput.nextInt();
            if(score>highestNo){
                highestNo=score;
                highestName = name;
                System.out.println("The student with the highest score is " + highestNo);
                System.out.println("The student with the highest score name is " + highestName);
                System.out.println();
                System.out.println();
            }
            else highestScoreName();
        }
        userInput.close();
    }
}
