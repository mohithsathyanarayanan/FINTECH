import java.util.ArrayList;

public class portfolio 
{
    String name ; 
    ArrayList<stock> stocks_list ;
    float risk_free_rate ;
    float return_of_market ;

    portfolio(String n,ArrayList<stock> s, float rfr , float rom)
    {
        name=n ;
        stocks_list=s ;
        risk_free_rate = rfr ;
        return_of_market = rom ;
    }

    public void printar()
    {
        for(stock i : stocks_list)
        {
            System.out.print("name: "+i.name+" current price: "+i.current_price+" purchased price: "+i.purchased_price +" quantity: "+i.quantity+" present value : "+ i.quantity*i.current_price+" investment: "+ i.quantity*i.purchased_price +" beta: "+i.beta+" type: "+i.type+" CAPM return: "+ i.get_capm(risk_free_rate, return_of_market)+" future value "+ i.get_future_value(risk_free_rate, return_of_market)+"\n");
        }

    }

    public float mean_beta()
    {
        float invested_value= 1 ;
        for(stock i : stocks_list)
        {
            invested_value=invested_value+ i.current_price*i.quantity ;
        }

        float counter = 0 ;
        for(stock i : stocks_list) //weighted average
        {
           float weight= (i.current_price*i.quantity)/invested_value ;
           counter=counter+ weight*i.beta ; 
        }

        return counter ;
    }

    public float total_expected_value()
    {
        float counter = 0 ;
        for(stock i : stocks_list)
        {
            counter= counter+i.get_future_value(risk_free_rate, return_of_market) ;
        }

        return counter ;
    }

    public float total_invested_value()
    {
        float counter=0 ;
        for(stock i : stocks_list)
        {
            counter=counter+(i.purchased_price*i.quantity) ;
        }

        return counter ;
    }

    public float total_present_value()
    {
        float counter = 0 ;
        for(stock i : stocks_list)
        {   
            counter=counter+(i.current_price*i.quantity) ;
        }

        return counter ;
    }

    //implement below ,the function to find the piotroski score    
}
