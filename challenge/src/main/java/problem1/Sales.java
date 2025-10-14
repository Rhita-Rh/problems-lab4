package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        int SALESPEOPLE;
        System.out.print("Enter the number of salesperson: ");
        Scanner scan = new Scanner(System.in);
        SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;

        int max_sale = 0;
        int id_max_sale = 0;

        int min_sale = sales[0];
        int id_min_sale = 0;

        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];

            if(sales[i] >=max_sale){
                max_sale = sales[i];
                id_max_sale = i+1;
            }

            if(sales[i] <= min_sale){
                min_sale = sales[i];
                id_min_sale = i+1;
            }
        }
        System.out.println("\nTotal sales: " + sum);

        //Question1
        double avg_sale = (double) sum/SALESPEOPLE; //casting
        System.out.println("\nAverage sale is: " + avg_sale);

        //Question2
        System.out.println("\nSalesperson " + id_max_sale + " had the highest sale with $" + max_sale);

        //Question3
        System.out.println("\nSalesperson " + id_min_sale + " had the lowest sale with $" + min_sale);

        //Question4
        int amount;
        System.out.println("\nEnter an amount: ");
        amount = scan.nextInt();
        int total_num_salesperson = 0;
        for(int i =0; i<sales.length; i++){
            if(sales[i] > amount){
                System.out.println((i+1) + " " + sales[i]);
                total_num_salesperson ++;
            }
        }
        System.out.println("The total number of salesperson who exceeded the entered amount is: " + total_num_salesperson);

        //Question5     each time in a loop we have i in System.out.println we replace it with (i+1)

        //Question6     Scanner scan = new Scanner(System.in);
        //              SALESPEOPLE = scan.nextInt();


    }
}