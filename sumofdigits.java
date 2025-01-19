//calculate sum of 4 digit

//JAVA
import java.util.*;
class sumofdigits {
public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	System.out.print("enter number: ");
int n=s.nextInt();
int sum=0;

while(n>0){
	int r=n%10;
	sum=sum+r;
	n=n/10;
}
System.out.print("sum:"+sum);
}
}

//PYTHON
sum = 0
n = int(input("Enter number: "))
      
while n > 0:
    r = n % 10
    sum = sum + r
    n = n // 10
    
print("sum:", sum)
  
 
  