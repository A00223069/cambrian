import java.util.Scanner;
public class lab1 {

    public static void  main(String[] args)
    {

        System.out.println("LAB-1:::::Salesperson’s Commission In A week");
        System.out.print("LAB-1:::Organisation\nEnter the total number of sales happened = ");
        Scanner s1=new Scanner(System.in);
        double commision=-1;
        double salesTotal=s1.nextDouble();
        Boolean flag=true;
        if(salesTotal<0 || salesTotal>5000)
        {
            flag=false;
        }
        else if(salesTotal<1000)
        {
            commision=0.05 ;// 5% Commission

        }
        else if(salesTotal>=100 && salesTotal<4000)
        {
            commision=0.10 ;// 10% Commission

        }
        else
        {
            commision=.15;//15% Commission
        }

        if(flag)
        {

            System.out.println("---------Result-------\nCommission is "+commision*100+"%");
            System.out.println("Salesperson has earned $"+salesTotal*commision+" commission for the "+salesTotal+" sales.\n ******KEEP ON GOING******");

        }
        else
        {
            System.out.println("Sales don’t add up ");


        }

    }
}
