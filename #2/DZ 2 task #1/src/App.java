public class App {
    public static int sumOfDigits(int number) {
        //Конвертую тип даних int в масив char, в якому за індексами будуть міститись всі цифри
        char[] digits = Integer.toString(number).toCharArray();
         //Обявляю змінну для сумми результату
        int sum = 0;
        // Проходжу по масиву символів
        for (int i = 0; i < digits.length; i++) {
            // конвертую елемент за індексом i в тип int і додаю його до сумми
            sum = sum += Character.getNumericValue(digits[i]);
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        sumOfDigits(1123);
    }
}
