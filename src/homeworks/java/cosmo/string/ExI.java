package homeworks.java.cosmo.string;

/**
 * Дан массив строк с номерами телефонов {“9806567890”, “89990980644”, “+79005556134”}.
 * Необходимо все номера телефонов отформатировать на вариант с +7-***-***-**-**.
 * 89990980644 -> +7-999-098-06-44
 * <p>
 * Подсказка: используйте методы .format() и .substring() класса String
 */
public class ExI {
    public static void main(String[] args) {
        String[] input = {"9806567890", "89990980644", "+79005556134", "89160164366" };

        for(String phone : input) {
            String digits = phone;


            if (digits.startsWith("+7")) {
                digits = digits.substring(2);
            } else if (digits.startsWith("8")) {
                digits = digits.substring(1);
            }

            String formatted = "+7-" + digits.substring(0, 3) + "-" +
                    digits.substring(3, 6) + "-" +
                    digits.substring(6, 8) + "-" +
                    digits.substring(8);

            System.out.println(phone + " -> " + formatted);
        }
    }
}