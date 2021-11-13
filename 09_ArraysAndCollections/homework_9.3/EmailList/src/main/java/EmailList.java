import java.util.*;

public class EmailList {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    TreeSet<String> listTree = new TreeSet();
    String regexEmail = "[A-z]+@[A-z]+[.][A-z]+";

    public void add(String email) {
        if (!email.matches(regexEmail))
            System.out.println(WRONG_EMAIL_ANSWER);
        else if (!listTree.contains(email.toLowerCase())) // toLowerCase() делает код избыточным, но для прохождения теста добавила и здесь
            listTree.add(email);
    }

    public List<String> getSortedEmails() {
        System.out.println(listTree);
        return new ArrayList<>(listTree);
    }
}
