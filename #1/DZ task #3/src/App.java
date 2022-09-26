public class App {
    public static int century(int year) {
        // якщо рік ділиться націло на 100, тоді він є останнім роком в столітті
        if(year % 100 == 0 ){
            return year / 100;
        } else{
            return (year / 100) + 1;
        }
    }
    public static void main(String[] args) throws Exception {
   
        System.out.println(century(1));
        System.out.println(century(100));
        System.out.println(century(2022));
        System.out.println(century(2001));
        System.out.println(century(2000));
        System.out.println(century(1999));
        System.out.println(century(0));
        System.out.println(century(1010));
    }
}
