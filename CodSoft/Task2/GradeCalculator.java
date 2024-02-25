import java.util.Scanner;

public class GradeCalculator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to \" Student Grade Calculator\"");

        System.out.print("Please! Enter number of Subjects: ");

        int subjects = scanner.nextInt();

        int [] marks = new int[subjects];
        String grade = "";
        int totalMarks = subjects * 100;
        int obtainedMarks = 0;
        int average = 0;

        for(int i =0; i < subjects; i++){
            System.out.print("Please! Enter marks of subject " + (i+1) + ":" );
            marks[i] = scanner.nextInt();

            while (true) {
              if(marks[i] > 100){
                System.out.println("Marks cannot be more than 100");
                System.out.println("Please! Enter marks less than 100");
                marks[i] = scanner.nextInt();
              }      
              if(marks[i] <= 100) break;
            }

            obtainedMarks = obtainedMarks + marks[i];
           

        }
        average = obtainedMarks / subjects;
        if(average < 50){
          grade = "F";
        }
        else if(average >= 50 && average<60){
          grade = "D";
        }
        else if(average >= 60 && average<65){
          grade = "C";
        }
        else if(average >= 65 && average<70){
          grade = "B-";
        }
        else if(average >= 70 && average<75){
          grade = "B";
        }
        else if(average >= 75 && average<80){
          grade = "B+";
        }
        else if(average >= 80 && average<85){
          grade = "A-";
        }
        else if(average >= 85 && average<=90){
          grade = "A";
        }
        else if(average > 90 && average<=100){
          grade = "A+";
        }

        System.out.println("Student marks calculations:\n Total marks: " + totalMarks + "\n Obtained marks: " + obtainedMarks);
        System.out.println(" Average percentage: " + average + "%");
        System.out.println(" Grade: " + grade);
        scanner.close();
    }
}