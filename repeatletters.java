// write a program to accept yoir name and print letters which are repeated

import java.util.*;
class repeatletters{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("enter your name: ");
char[] name = s.nextLine().toLowerCase().toCharArray();
for(int i=0;i<name.length();i++){
for(int j=0;j<i;j++){
if(name[i]==name[j]){
j++;
}
}
System.out.print(j);
}
}
}

