public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        //TODO: напишите ваш код, результат вывести в консоль
        String charset = "руб";
        int i = 0;
        int j = text.indexOf(charset);
        int totalEarn = 0;

        while (i < j) {
            if (Character.isDigit(text.charAt(i))) {
                totalEarn = totalEarn + Integer.parseInt(text.substring(i, j).trim());
                text = text.substring(j + charset.length());
                i = 0;
                j = text.indexOf(charset);
            } else i++;
        }
        System.out.println(totalEarn);
    }

}