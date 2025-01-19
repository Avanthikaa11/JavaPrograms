//add 1 to every digit in the number

//JAVA
import java.util.*;
class add1todigits{
public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	System.out.print("enter number: ");
int n=s.nextInt();

String result="";
while(n>0){
int digit=n%10;
 int newdigit=(digit+1)%10;
 result=newdigit+result;
n=n/10;
}
System.out.print("new number: "+result);
}
}

//PYTHON
n=int(input("enter a number: "))
result=""
while n>0:
    digit=n%10;
    newdigit=(digit+1)%10
    result=str(newdigit)+result
    n=n//10
print("sum: ",result)
    