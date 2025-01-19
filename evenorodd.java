// integer is even or odd

//JAVA

import java.util.*;
class evenorodd{
public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	System.out.print("enter number: ");
int n=s.nextInt();
if(n%2==0){
	System.out.println("number is even ");
	}else{
	System.out.println("number is odd ");
	}
	}
	}
	
//PYTHON
n=int(input("enter a number: "))
if (n%2==0):
    print("Number is even")
else:
    print("number is odd")
