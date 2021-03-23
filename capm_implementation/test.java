import java.util.ArrayList;
import java.util.Scanner ;

public class test
{
    public static void main(String[] args) 
    {
        System.out.println("enter number of portfolios");
        Scanner scan = new Scanner(System.in) ;
        int  number_of_portfolios = scan.nextInt() ;
        ArrayList<portfolio> p_list = new ArrayList<portfolio>() ;

        for(int i = 0 ; i<number_of_portfolios ; i++)
        {
            System.out.println("enter portfolio name");
            String port_name = scan.next() ;

            System.out.print("enter risk free rate");
            float risk_free_rate = scan.nextFloat() ;

            System.out.println("enter return of market");
            float return_of_market = scan.nextFloat() ;


            System.out.println("enter number of stocks in this portfolio");
            int number_of_stocks = scan.nextInt() ;

            ArrayList<stock> stock_list = new ArrayList<stock>() ;

            for(int j= 0 ; j<number_of_stocks ; j++)
            {
                System.out.println("enter name of the stock");
                String name = scan.next() ;

                System.out.println("enter current price");
                float current_price = scan.nextFloat() ;

                System.out.println("enter purchased price");
                float purchased_price = scan.nextFloat() ;

                System.out.println("enter beta");
                float beta = scan.nextFloat() ;

                System.out.println("enter quantity");
                int quantity = scan.nextInt() ;

                System.out.println("enter type");
                String type = scan.next() ;

                stock s = new stock(name, current_price,purchased_price, beta, quantity, type) ;
                stock_list.add(s) ;
            }

            portfolio p = new portfolio(port_name, stock_list, risk_free_rate, return_of_market) ;
            p_list.add(p) ;
        }

        for(portfolio i : p_list)
        {
            System.out.println(i.name+" " + i.return_of_market+" "+i.risk_free_rate+"\n");
            i.printar();
            System.out.println("the total invested amount is : "+i.total_invested_value());
            System.out.println("the prsent value of the portfolio is: "+ i.total_present_value() +"\n" );
            System.out.println("the present unrealized gain on the portfolio is: "+ (i.total_present_value()-i.total_invested_value())+"\n");
            System.out.println("the mean beta of the portfolio is: "+ i.mean_beta()+"\n");
            System.out.println("the expected value in future is: "+ i.total_expected_value()+"\n");
            System.out.println("the expected future gain is : "+(i.total_expected_value()-i.total_invested_value())+"\n");
            System.out.println("PORTFOLIO END");
            
        }

        System.out.println("PROGRAM END");

        
        



        
        
    }
}