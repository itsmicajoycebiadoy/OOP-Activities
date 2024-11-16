public class Shape_Implementation {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "red", true);
        Shape rectangle = new Rectangle(4.0, 6.0, "blue", false);
        Shape square = new Square(3.0, "green", true);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}



