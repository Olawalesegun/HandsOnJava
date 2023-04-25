import java.util.Scanner;
public class Tat {
    public static void main(String[] args) {
        highestScore();
    }
    public static void highestScore(){
        //  Write a program that prompts the user to enter the number of students and each students
        //  name and score, and finally displays the name of the student with the highest score.

        /*  TODO:
          1. Declare a class.
          2. Declare a method.
          3. Instantiate a scanner object to receive input
          4. Prompt user to enter number of students
          5. Declare variable to accept number of students
          6. prompt the user to Enter name of students.
          7. If student name is same as entered, assign student score to a variable easily identified for each student.
          8.
        */
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Number of student: ");
        int studentNo = userInput.nextInt();
        int[] age = new int[studentNo];
        String[] name = new String[studentNo];
        for(int count=0; count<studentNo; count++){
            System.out.println("Enter student age");
            age[count] = userInput.nextInt();
            System.out.println("Enter student name");
            name[count] = userInput.nextLine();
        }
        for(int count=0; count<studentNo; count++){
            System.out.printf("%dn%d%n", age[count], name[count]);
        }
        /*String[] name;
        if(name == "Shola"){
            int sholaScore = userInput.nextInt();
        }
        else if(name == "Tunde"){
            int tundeScore =
        }*/
    }
}

