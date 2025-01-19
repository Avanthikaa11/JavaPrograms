// swap 2 numbers with 2 variables

//JAVA

class Swap2 {
    public static void main(String args[]) {
        int x = 5;
        int y = 6;


        x = x + y; // x becomes 11 (5 + 6)
        y = x - y; // y becomes 5 (11 - 6)
        x = x - y; // x becomes 6 (11 - 5)

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}


//PYTHON


x = 5
y = 6

# Swapping
x = x + y  # x becomes 11 (5 + 6)
y = x - y  # y becomes 5 (11 - 6)
x = x - y  # x becomes 6 (11 - 5)

print("x:", x)
print("y:", y)
