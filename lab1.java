import java.text.DecimalFormat;
import java.util.Scanner;
public class lab1 {

    public static void  main(String[] args)
    {

        System.out.println("LAB-1:::::Salesperson’s Commission In A week");
        System.out.print("LAB-1:::Organisation\nEnter the total number of sales happened = ");
        Scanner s1=new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");

        double commission=-1;
        double salesTotal=s1.nextDouble();
        Boolean flag=true;
        if(salesTotal<0 || salesTotal>5000)
        {
            flag=false;
        }
        else if(salesTotal<1000)
        {
            commission=0.05 ;// 5% Commission

        }
        else if(salesTotal>=100 && salesTotal<4000)
        {
            commission=0.10 ;// 10% Commission

        }
        else
        {
            commission=.15;//15% Commission
        }

        if(flag)
        {

            System.out.println("---------Result-------\nCommission is "+commission*100+"%");
            System.out.println("Salesperson has earned $"+df.format(salesTotal*commission)+" commission for the "+salesTotal+" sales.\n ******KEEP ON GOING******");

        }
        else
        {
            System.out.println("Sales don’t add up ");


        }

    }
}
