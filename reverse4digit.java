//reverse 4 digit number

//JAVA
import java.util.*;
class reverse4digit {
public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	System.out.println("enter number: ");
int n=s.nextInt();
if(n>=1000 && n<=9999){
int sum=0;
while(n>0){
	int r=n%10;
	sum=sum*10+r;
	n=n/10;
}
System.out.println("reverse:"+sum);
 }else{
	 System.out.println("Enter 4 digit number");
 }


}
}

//PYTHON

n=int(input("enter a 4 digit number: "))
if (n>=1000 and n<=9999) :
    sum=0
    while(n>0):
        r=n%10
        sum=sum*10+r
        n=n//10
    print("reverse",sum)
else :
    print("Enter 4 digit number")