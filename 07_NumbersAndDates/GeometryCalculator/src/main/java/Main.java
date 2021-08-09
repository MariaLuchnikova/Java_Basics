import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь круга = " + GeometryCalculator.getCircleSquare(-20));
        double squareTriangle = GeometryCalculator.getTriangleSquare(-3, 4, 5);
        System.out.println(squareTriangle > 0 ? "Площадь треугольника = " + squareTriangle : "Пострение треугольника невозможно");
        System.out.println("Объем шара = " + GeometryCalculator.getSphereVolume(-20));
    }
}
