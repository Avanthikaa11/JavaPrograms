// reverse 3 digit number 

//JAVA
import java.util.*;
class reverse {
public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	System.out.println("enter number");
int n=s.nextInt();
int sum=0;

while(n>0){
	int r=n%10;
	sum=sum*10+r;
	n=n/10;
}
System.out.println("reverse:"+sum);
 
 


}
}

//PYTHON

//# Reverse a 3-digit number
//n = 928
//sum = 0

//while n > 0:
    //r = n % 10  
    //sum = sum * 10 + r  
   // n //= 10 
//print("Reversed number:", sum)

