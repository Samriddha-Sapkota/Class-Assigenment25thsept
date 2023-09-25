import java.util.Scanner;

public class Billing_system {
    public static void main(String[] args) {
        int Ordered_Quantity =0,Ordered_Items = 0, user_Input;
        double Total_amount, temp_amount = 0,amount = 0, VAT, discount;
        System.out.println("\t\tFood Menu");
        System.out.println("Food Item" + "\tRate");
        System.out.println("1." + "MoMo " + "\t \tRs 150");
        System.out.println("2." + "Pizza" + "\t \tRs 350");
        System.out.println("3." + "Burger" + "\tRs 250");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of item yous you want to order. ");
        user_Input = sc.nextInt();
        for (int i = 1; i <= user_Input;i++){
            System.out.println("Enter the S.N of the number you want to order. ");
            Ordered_Items = sc.nextInt();
            System.out.println("Enter the quantity of the food you want to order. ");
            Ordered_Quantity = sc.nextInt();
            if (Ordered_Items >= 1 && Ordered_Items <= 3){
                System.out.println("Your order has been placed successfully!");
            }else if(Ordered_Items < 0 || Ordered_Items > 3){
                System.out.println("Invalid Input. Please enter a number between 1 and 3.");
                return;
            }else{
                System.out.println("Invalid Input. Please enter a valid number.");
                return;
            }if (Ordered_Items == 1){
                temp_amount = Ordered_Quantity * 150;
                System.out.println(Ordered_Quantity + " plate(s) MoMo has been ordered");
            }
            else if (Ordered_Items == 2){
                temp_amount = Ordered_Quantity * 350;
                System.out.println(Ordered_Quantity + " pizza(s) has been ordered");
            }
            else {
                temp_amount = Ordered_Quantity * 250;
                System.out.println(Ordered_Quantity + " burger(s) has been ordered");
            }
            amount += temp_amount;
        }
        VAT = ((double) 13 /100) * amount;
        discount = ((double) 10 /100)* amount;
        Total_amount = amount + VAT + discount;

        System.out.println("****************Life is Chatpat****************");
        System.out.println("Your amount before VAT and discount is " + amount);
        System.out.println("Your total amount with VAT and discount is " + Total_amount);
    }
}
