// sum of first and last digit

//JAVA

import java.util.*;
class sumoffirstandlastdigit {
public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	System.out.println("enter number: ");
int n=s.nextInt();
if(n>=1000 && n<=9999){
int firstdigit=n/1000;
int lastdigit=n%10;
int sum=firstdigit+lastdigit;
System.out.println("sum of first an dlast digit:"+sum);
 }else{
	 System.out.println("Enter 4 digit number");
 }


}
}

//PYTHON

n=int(input("Enter a 4 digit numebr: "))
if (n>=1000 and n<=9999) :
    firstdigit=n//1000
    lastdigit=n%10
    sum=firstdigit+lastdigit
    print("sum of frst and last digit:{sum}")
else :
    print("Enter 4 digit number")