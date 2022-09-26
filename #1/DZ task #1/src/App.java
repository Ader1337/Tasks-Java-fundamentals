public class App {

    public static boolean isLeapYear(int year) {
        /*
         * Провірка: Якщо число ділиться націло без остачі на 4, і не ділиться без
         * остачі на 100, або ділиться націло на 4, і на 400, тоді вернути true
         */
        if((year % 4 == 0 && year % 100 != 0)  || (year % 4 == 0 && year % 400 == 0) ){
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) throws Exception {
        System.out.println(isLeapYear(2080));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        
    }
}
