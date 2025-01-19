// the length and breadth of rectangle and radius of circle are input.calculate area of erctangle perimeter of erctangle , are adn circuference of circle

//l*b
//2(l+b)
//3.14(r)^2
//2*3.14(r)

//JAVA

import java.util.*;
class area{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("l :");
float l= s.nextInt();
System.out.print("l :");
float b= s.nextInt();

float area=l*b;
float perimeter=2*l+b;

System.out.println("area: "+area);
System.out.println("perimeter: "+perimeter);

System.out.print("r :");
double r= s.nextInt();

double areac=3.14*r*r;
double c=2*3.14*r;


System.out.println("areac: "+areac);
System.out.println("circuference: "+c);

}
}

//PYTHON
l=float(input('Enter length of recctangle: '))
b=float(input('Enter breadth of recctangle: '))
radius=float(input('Enter radius of circle: '))
areaRect=l*b
perimeter=2*(l+b)
areacirc=3.14*radius*radius
circumference=2*3.14*radius
print("area of Rectangle: ", areaRect)
print("perimeter of Rectangle: ", perimeter)
print("area of Circle: ", areacirc)
print("circumference of Circle: ", circumference)



