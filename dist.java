// the distance between two cities is the input in km.Write a program to convert and print the distance in meters,feets,inches,cm

//JAVA

import java.util.*;

class dist {
public static void main(String[] oppkmjfhgfh) {
Scanner s = new Scanner(System.in);
System.out.print("enter distance(km): ");
double distance = s.nextDouble();
double m = distance * 1000;
System.out.println("m: "+m);
double cm = m * 100;
System.out.println("cm: "+cm);
double inch = cm/2.54;
System.out.println("inch: "+inch);
double feet = inch/12;
System.out.println("Feet: "+feet);
}
}

//PYHTON

d = float(input("enter distnace in (km)"))
m=d*1000
print("distance in meters: ",m)
cm=m*100
print("distance in cm: ",cm)
i=cm/2.54
print("distance in inches: ",i)
f=i/12
print("distance in feet: ",f)



