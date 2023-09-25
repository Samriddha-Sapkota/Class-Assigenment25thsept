import java.util.Scanner;

public class Result_Generator {
    public static void main(String[] args) {
        int user_Input;
        float total_Marks = 0, Percentage;

        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the number of subject(s). ");
        user_Input = sn.nextInt();

        for(int i = 1; i <= user_Input;i++){
            System.out.println("Enter the marks in subject" + i);
            float marks = sn.nextFloat();
            if(marks < 0){
                System.out.println("The Marks entered cannot be negative.");
            }
            total_Marks += marks;
        }
        Percentage = (total_Marks/(user_Input*100))*100;
        if (Percentage > 90 & Percentage <= 100){
            System.out.println("The student has scored A+");
        }else if(Percentage > 80 & Percentage <= 90){
            System.out.println("The student has scored A");
        }else if(Percentage > 70 & Percentage <= 80){
            System.out.println("The student has scored B+");
        }else if (Percentage > 60 & Percentage <= 70){
            System.out.println("The student has scored B");
        }else if(Percentage > 50 & Percentage <= 60){
            System.out.println("The student has scored C+");
        }else {
            System.out.println("The student has scored below C+");
        }
    }
}
