import java.util.Scanner;

public class GradeCalc {
	public static void main(String[] args){
                
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Grade Calculator");
        System.out.println(" ");
        System.out.println("Please Enter Grades for the Homework "); //following strings are for the 3 homework assignment grade inputs
        
        double hw1 = in.nextDouble();
        System.out.println("HW1: " +hw1);
        double hw2 = in.nextDouble();
        System.out.println("HW2: " +hw2);
        double hw3 = in.nextDouble();
        System.out.println("HW3: " +hw3);
        System.out.println(" ");
        
        System.out.println("Please Enter Grades for the Quizzes ");
        double q1 = in.nextDouble();
        System.out.println("Quiz1: " +q1);
        double q2 = in.nextDouble();
        System.out.println("Quiz2: " +q2);
        System.out.println(" ");
        System.out.println("Please Enter Grades for the Final Exam ");
        double f = in.nextDouble();
        System.out.println("Final: " +f);
        System.out.println(" ");
        
        double avghw = (hw1 + hw2 + hw3) /3;
        double qavg = (q1 + q2) / 2;
        double hwgrade = avghw * .2;
        double qgrade = qavg * .5;
        double fexam = f * .3;
        System.out.println("The average of the Homework is: " + avghw + "%");
        System.out.println("The average of the Quizzes is: " + qavg + "%");
        System.out.println("The average of the Final Exam is: " + f + "%");
        double fgrade = hwgrade + qgrade + fexam;
        System.out.println(" ");
        System.out.println("The Final grade is: " + fgrade + "%");
        
        
            }
        }
