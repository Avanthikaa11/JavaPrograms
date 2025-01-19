// if the marks obtained in 5 subjects are input write program to find out the aggregate marks and percentage marks assuming that 100 is maximum and 35 is minimum

//JAVA

import java.util.*;
class marks {
public static void main(String[] args){
Scanner s= new Scanner(System.in);
System.out.print("sub 1: ");
int sub1 = s.nextInt();
System.out.print("sub 2: ");
int sub2 = s.nextInt();
System.out.print("sub 3: ");
int sub3 = s.nextInt();
System.out.print("sub 4  : ");
int sub4 = s.nextInt();
System.out.print("sub 5: ");
int sub5 = s.nextInt();

int marks= sub1+sub2+sub3+sub4+sub5;
int percentage= marks/5;

if(sub1>100|| sub2>100|| sub3>100 || sub4>100 || sub5 >100) {
	System.out.println("Enter valid marks (maximum mark:100)");
}else {

if(sub1<35 || sub2<35 || sub3<35 || sub4<35 || sub5 <35) {
	System.out.println("You failed!");
}else{
	System.out.println("you have passed!");
	

System.out.println("aggregate : " + marks + " Percentage :" + percentage);
}
}

}
}

//PYTHON

sub1 = int(input("sub1: "))
sub2 = int(input("sub2: "))
sub3 = int(input("sub3: "))
sub4 = int(input("sub4: "))
sub5 = int(input("sub5: "))

marks=sub1+sub2+sub3+sub4+sub5
percentage=marks/500*100

if(sub1,sub2,sub3,sub4,sub5 >100) :
    print("enter valid marks")
else :
    if((sub1,sub2,sub3,sub4,sub5<35)) :
        print("you have failed")
    else :
        print("you hav epassed")
        print("marks: "+marks , "percentage: " +percentage)

