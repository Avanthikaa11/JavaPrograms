/// currency least no of notes 1,2,5,10,50,100

//JAVA
import java.util.*;
class nofnotes{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the amount: ");
int n=s.nextInt(); //n=376

int c100=n/100; //how many 100 notes (376 divided by 100= 3 ... 3 100 notes)
n=n%100; //amount left (376 - 3(100) = 76

int c50=n/50; 
n=n%50;

int c10=n/10; 
n=n%10;

int c5=n/5; 
n=n%5;

int c2=n/2; 
n=n%2;

int c1=n;

int numberofnotes=c100+c50+c10+c5+c2+c1;
 System.out.println("Least number of notes required: (100's-" + c100 +
                           ", 50's-" + c50 +
                           ", 10's-" + c10 +
                           ", 5's-" + c5 +
                           ", 2's-" + c2 +
                           ", 1's-" + c1 +
                           ") = " + numberofnotes);
    
}
}

//PYTHON

n=int(input("enter the amount: "))
c100=n//100
n=n%100

c50=n//50
n=n%50

c10=n//10
n=n%10

c5=n//5
n=n%5

c2=n//2
n=n%2

c1=n//1
n=n%1

numberofnotes=c100+c50+c10+c5+c2+c1
print("least no of notes (100-{c100} , 50-{c50} , 10{c-10} , 5-{c5} , 2-{c2} , 1-{c1})\n",numberofnotes)
