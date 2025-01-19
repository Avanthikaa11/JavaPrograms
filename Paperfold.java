// Paper size A0 has dimensions 1  189 mm * 841 mm each subsequent size A(n) is defined as A(n-1) cut in half parrallel to its shorter sides

//JAVA

import java.util.*;

class Paperfold {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of paper: ");
        int n = s.nextInt();

        double length = 1189, width = 841;

        System.out.printf("A0: %.0fmm x %.0fmm\n", length, width);

        for (int i = 1; i <= n; i++) {
            double temp = length;
            length = width;
            width = temp / 2;
            System.out.printf("A%d: %.0fmm x %.0fmm\n", i, length, width);
        }
    }
}

//PYHTON
n = int(input("Enter the size of paper: "))

length = 1189
width = 841

print(f"A0: {length:.0f}mm x {width:.0f}mm")

for i in range(1, n + 1):
    x = length
    length = width
    width = x / 2
    print(f"A{i}: {length:.0f}mm x {width:.0f}mm")
