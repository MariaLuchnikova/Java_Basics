public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse(String[] strings) {
        int sizeArray = strings.length;
        for (int j = 0; j < sizeArray; j++) {
            for (int i = 0; i < sizeArray / 2; i++) {
                String varStr = strings[i];
                strings[i] = strings[sizeArray - 1 - i];
                strings[sizeArray - 1 - i] = varStr;
            }
            System.out.print(strings[j] + " ");
        }
        return strings;
    }
}
