import java.util.*;

public class
PhoneBook {
    public static final String REGEX_NAME_CONTACT = "[А-я-]+";
    public static final String REGEX_PHONE_NUMBER = "[7]{1}[9]{1}[0-9]{9}";
    TreeMap<String, String> phoneContact = new TreeMap<>();

    public boolean isValidPhoneNumber(String phoneNumber) {
        return (phoneNumber.matches(REGEX_PHONE_NUMBER));
    }

    public boolean isValidNameContact(String nameContact) {
        return (nameContact.matches(REGEX_NAME_CONTACT));
    }

    public void addContact(String phone, String name) {
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (isValidPhoneNumber(phone) && isValidNameContact(name)) {
            if (!phoneContact.isEmpty()) {
                for (Map.Entry<String, String> entry : phoneContact.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    String newPhone = key + ", " + phone;
                    if (value.equals(name)) {
                        phoneContact.remove(key);
                        phoneContact.put(newPhone, name);
                    } else phoneContact.put(phone, name);
                }
            } else phoneContact.put(phone, name);
            System.out.println("Контакт сохранен!");
        } else System.out.println("Неверный формат ввода");
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        return (phoneContact.containsKey(phone)) ? phoneContact.get(phone) + " - " + phone : "";
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        TreeSet<String> foundByName = new TreeSet<>();
        if (phoneContact.containsValue(name)) {
            for (Map.Entry<String, String> entry : phoneContact.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value.equals(name))
                    foundByName.add(value + " - " + key);
            }
        }
        return foundByName;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> foundAllContact = new TreeSet<>();
        if (!phoneContact.isEmpty()) {
            for (Map.Entry<String, String> entry : phoneContact.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                foundAllContact.add(value + " - " + key);
                System.out.println(foundAllContact);
            }
        }
        return foundAllContact;
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}