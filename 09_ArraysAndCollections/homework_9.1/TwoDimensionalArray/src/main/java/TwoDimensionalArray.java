public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]
        char[][] TwoDimensionalArray = new char[size][size];
        int lastIndex = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || j == lastIndex - i) TwoDimensionalArray[i][j] = symbol;
                else TwoDimensionalArray[i][j] = ' ';
                System.out.print(TwoDimensionalArray[i][j]);
            }
            System.out.println();
        }
        return TwoDimensionalArray;
    }
}
