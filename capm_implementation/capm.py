print("enter name of the stock")
name=input()

print("enter risk free rate")
risk_free_rate = float(input())

print("enter market return")
return_of_market= float(input())

print('enter beta')
beta=float(input())

expected_return = risk_free_rate + beta*(return_of_market - risk_free_rate)

print("the expected return of "+ name + ", as predicted by CAPM is : "+str(expected_return))

