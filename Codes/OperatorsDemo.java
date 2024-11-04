public class OperatorsDemo {

    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));
        
        // 2. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 5;
        System.out.println("c = " + c);
        c += 3; // c = c + 3
        System.out.println("c += 3 -> c = " + c);
        c -= 2; // c = c - 2
        System.out.println("c -= 2 -> c = " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2 -> c = " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2 -> c = " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3 -> c = " + c);
        
        // 3. Comparison Operators
        System.out.println("\nComparison Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        
        // 4. Logical Operators
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT
        
        // 5. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int p = 6; // Binary: 110
        int q = 4; // Binary: 100
        System.out.println("p & q: " + (p & q)); // Bitwise AND
        System.out.println("p | q: " + (p | q)); // Bitwise OR
        System.out.println("p ^ q: " + (p ^ q)); // Bitwise XOR
        System.out.println("~p: " + (~p)); // Bitwise NOT
        
        // 6. Conditional Operator
        System.out.println("\nConditional Operator:");
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("age >= 18 ? \"Adult\" : \"Minor\" -> " + result);
        
        // 7. Increment and Decrement Operators
        System.out.println("\nIncrement and Decrement Operators:");
        int num = 5;
        System.out.println("num: " + num);
        System.out.println("num++: " + (num++)); // Post-increment
        System.out.println("After num++ -> num: " + num);
        System.out.println("++num: " + (++num)); // Pre-increment
        System.out.println("num--: " + (num--)); // Post-decrement
        System.out.println("After num-- -> num: " + num);
        System.out.println("--num: " + (--num)); // Pre-decrement
        System.out.println("--num: " + (--num)); // Pre-decrement
        System.out.println("After --num -> num: " + num);

        // Additional examples to show effect on num
        num++;
        System.out.println("After num++ (post-increment) -> num: " + num);

        ++num;
        System.out.println("After ++num (pre-increment) -> num: " + num);

        num--;
        System.out.println("After num-- (post-decrement) -> num: " + num);

        --num;
        System.out.println("After --num (pre-decrement) -> num: " + num);

    }
}
