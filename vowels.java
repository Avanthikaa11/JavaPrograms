//write a program to accept your name and find vowels your name

import java.util.*;
class vowels{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("enter your name: ");
String name = s.nextLine().toLowerCase();
for(int i=0;i<name.length();i++){
char ch=name.charAt(i);
if(ch== 'a' || ch=='e' || ch=='i'||ch=='o' || ch=='u'){
	System.out.print(ch + " ");
}
}
}
}
