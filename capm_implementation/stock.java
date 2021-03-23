import java.util.*;

public class stock
{
    String name ;
    float current_price ;
    float purchased_price ;
    float beta ;
    int quantity ;
    String type ;

    stock(String n,float cur_pr, float pur_price , float b , int quan , String ty)
    {
        name=n ;
        current_price= cur_pr ;
        purchased_price=pur_price ;
        beta=b ;
        quantity=quan ;
        type=ty ;
    }

    public void get_name()
    {
        System.out.println(name);
    }

    public void get_price()
    {
        System.out.println(current_price);
    }

    public void get_beta()
    {
        System.out.println(beta);
    }

    public void get_quantity()
    {
        System.out.println(quantity);
    }

    public void get_type()
    {
        System.out.println(type);
    }

    public void get_total_value()
    {
        System.out.println(quantity*current_price);
    }

    public float get_capm(float risk_free_rate,float return_of_market)
    {
        float expected_return = risk_free_rate + beta*(return_of_market-risk_free_rate) ;
        
        return expected_return ;
    }

    public float get_future_value(float risk_free_rate, float return_of_market)
    {
        float unrealised_gain = (current_price*quantity)*get_capm(risk_free_rate, return_of_market)/100 ;
        float future_value= (current_price*quantity)+unrealised_gain ;
        return future_value ;
    }
    
}