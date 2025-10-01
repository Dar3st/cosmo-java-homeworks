package homeworks.java.cosmo.string;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>
 * Подсказка: используйте методы .split() и .charAt() класса String
 */
public class ExH {
    public static void main(String[] args) {
        String fullName = "Носов Алексей Олегович";
        String[] splitName = fullName.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < splitName.length; i++){
            sb.append(splitName[i].charAt(0)).append(".");
        }
        System.out.println(sb);
    }
}
