package homework.exceptions.part_1;

public class ExceptionExample7 {
    public static void main(String[] args) {
        area(5.6, -4.4);
    }

    public static double area(double width, double height) {
        if (width < 0 | height < 0) {
            throw new IllegalArgumentException("Negative arguments: w = " + width + ", h = " + height);
        } else {
            return width * height;
        }
    }
}
