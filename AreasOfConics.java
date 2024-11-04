import java.util.Scanner;

public class AreasOfConics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose the shape (Triangle, Square, Circle, Rectangle, Rhombus): ");
        String shapeType = scanner.nextLine().toLowerCase();

        switch (shapeType) {
            case "triangle":
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double areaTriangle = 0.5 * base * height;
                System.out.println("Area of Triangle: " + areaTriangle);
                break;
                
            case "square":
                System.out.print("Enter the side of the square: ");
                double side = scanner.nextDouble();
                double areaSquare = side * side;
                System.out.println("Area of Square: " + areaSquare);
                break;
                
            case "circle":
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double areaCircle = 3.14 * radius * radius;
                System.out.println("Area of Circle: " + areaCircle);
                break;
                
            case "rectangle":
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                double areaRectangle = length * breadth;
                System.out.println("Area of Rectangle: " + areaRectangle);
                break;
                
            case "rhombus":
                System.out.print("Enter the length of the first diagonal of the rhombus: ");
                double diagonal1 = scanner.nextDouble();
                System.out.print("Enter the length of the second diagonal of the rhombus: ");
                double diagonal2 = scanner.nextDouble();
                double areaRhombus = 0.5 * diagonal1 * diagonal2;
                System.out.println("Area of Rhombus: " + areaRhombus);
                break;
                
            default:
                System.out.println("Invalid shape type. Please enter a valid shape.");
                break;
        }
        
        scanner.close();
    }
}
