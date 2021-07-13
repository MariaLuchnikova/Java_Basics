import com.jayway.jsonpath.internal.function.numeric.Max;
import com.jayway.jsonpath.internal.function.numeric.Min;

public class Arithmetic {
    private int Num1;
    private int Num2;

    public Arithmetic (int Num1, int Num2){
        this.Num1 = Num1;
        this.Num2 = Num2;
    }

    public int getSumNum(){
      return (Arithmetic.this.Num1 + Arithmetic.this.Num2);
    }

    public int getComposNum(){
        return (Arithmetic.this.Num1 * Arithmetic.this.Num2);
    }

    public int getMaxNum(){
        return Math.max(Arithmetic.this.Num1, Arithmetic.this.Num2);
    }

    public int getMinNum(){
        return Math.min(Arithmetic.this.Num1,Arithmetic.this.Num2);
    }

    public static void main(String[] args) {
        Arithmetic calc = new Arithmetic(1, 5);
        System.out.println("Сумма чисел: " + calc.getSumNum());
        System.out.println("Произведение чисел: " + calc.getComposNum());
        System.out.println("Максимальное из чисел: " + calc.getMaxNum());
        System.out.println("Минимальное из чисел: " + calc.getMinNum());
    }
    }