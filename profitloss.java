//with selling and cost estimate if its profit or loss

//JAVA

import java.util.*;
class profitloss{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter costprice: ");
Float cp=s.nextFloat();
System.out.print("Enter sellingprice: ");
Float sp=s.nextFloat();

Float profitorloss=sp-cp;
if(sp>cp){
System.out.printf("Profit: %.2f\n",profitorloss);
}else if(sp<cp){
System.out.printf("Loss: %.2f\n",profitorloss);
}else{
System.out.print("no Profit or no loss");
}
}
}

//PYTHON
cp=float(input("enter cost price: "))
sp=float(input("enter sellingprice: "))
profitorloss=sp-cp
if(sp>cp):
    print(f"Profit: {profitorloss:.2f}")
elif(sp<cp):
     print(f"Loss: {profitorloss:.2f}")  
else :
           print("no profit or loss")
