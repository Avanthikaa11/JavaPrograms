// total selling price of 15 items and tital profit earnedd as an input. program to find cost price of one item

//JAVA

import java.util.*;
class costprice {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter total selling price of (15 items): ");
float sp = s.nextFloat();
System.out.print("Enter total profit: ");
float p=s.nextFloat();
float cp=sp-p;
float cponeitem=cp/15;

System.out.print("Cost price of one item : "+cponeitem);
}
}

//PYTHON

sp=float(input("Enter selling price(15 items)"))
p=float(input("Enter total profit"))
cp=sp-p
cpforoneitem=cp/15;
print("cost price for one item: " , cpforoneitem)