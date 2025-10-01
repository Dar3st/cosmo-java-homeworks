package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";


        String cleanedInput = input.replace("?", "").trim();
        String[] words = cleanedInput.split(" ");


        StringBuilder resultBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            resultBuilder.append(words[i]);
            if (i > 0) {
                resultBuilder.append(" ");
            }
        }

        String result = resultBuilder.toString().replaceFirst("д", "Д").replace("Г", "г") + "?";

        System.out.println("Исходная строка: " + input);
        System.out.println("Результат: " + result);
    }
}