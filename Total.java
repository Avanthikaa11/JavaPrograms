// write a program to accept a 8 digit number, print the sum of odd numbers and the sum of even numbers and their total

import java.util.*;
class Total {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter an 8 digit number: ");
int n=s.nextInt();

int evensum=0;
int  oddsum=0;

while(n>0){
int r=n%10;
 if(r%2==0){
    evensum=evensum+r;
   }
   else {
    oddsum=oddsum+r;
   }
   n=n/10;
   }
   
 int totalsum=evensum+oddsum;
 System.out.println("even sum: "+evensum);
 System.out.println("odd sum: "+oddsum);
 System.out.println("total sum: "+ totalsum);
 
 }
 }
