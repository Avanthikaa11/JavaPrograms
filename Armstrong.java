//armstrong

//JAVA

class Armstrong {
public static void main(String[] args){
int n=928;
int sum=0;

while(n>0){
	int r=n%10;
	sum=sum+r*r*r;
	n=n/10;
}
System.out.println("armstrong:"+sum);
 
 


}
}

// PYTHON

n = 928
original_n = n  # Store the original number for reference
sum = 0

while n > 0:
    r = n % 10  
    sum += r ** 3 
    n//= 10  

print("Armstrong sum:", sum)
