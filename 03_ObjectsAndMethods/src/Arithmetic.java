import com.jayway.jsonpath.internal.function.numeric.Max;
import com.jayway.jsonpath.internal.function.numeric.Min;

public class Arithmetic {
    private int num1;
    private int num2;

    public Arithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSumNum() {
        return num1 + num2;
    }

    public int getComposNum() {
        return num1 * num2;
    }

    public int getMaxNum() {
        return Math.max(num1, num2);
    }

    public int getMinNum() {
        return Math.min(num1, num2);
    }

    public static void main(String[] args) {
        Arithmetic calc = new Arithmetic(1, 5);
        System.out.println("Сумма чисел: " + calc.getSumNum());
        System.out.println("Произведение чисел: " + calc.getComposNum());
        System.out.println("Максимальное из чисел: " + calc.getMaxNum());
        System.out.println("Минимальное из чисел: " + calc.getMinNum());
    }
}