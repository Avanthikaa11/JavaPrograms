// ramesh basic salary is input through the keyboard, his DA is 40% of basic salary, HRA is 20% of basic salary. Write a basic program to calculate his gross Salary

//JAVA


import java.util.*;
class salary{
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.print("basic salary: " );
int salary = s.nextInt();

 int DA = salary* 40/100;
 int HRA = salary*20/100;

int gross_pay= salary + DA + HRA;

System.out.println("gross pay:" +gross_pay);
}
}

//PYTHON

salary=float(input("enter basic salary"))
da=salary*40/100
hra=salary*20/100
gross=salary+da+hra
print("gross: ",gross)