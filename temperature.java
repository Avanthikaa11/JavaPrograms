// temperature of city in fahrenhit is input .convert into centigrade

//JAVA

import java.util.*;
class temperature{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Temp in F : ");
float f= s.nextFloat();
float cg= (5f/9f)*(f-32);
 System.out.println("temp in centigrade: "+cg);
 }
 }
 
 //PYTHON
 f=float(input('Enter Fahrenhit value: '))
cg=(5/9)*(f-32)
print("cg: " , cg)