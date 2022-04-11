
import java.util.Scanner;
public class Class {
    /**
     * Дана строка. Подсчитать количество содержащихся в ней прописных латинских букв.
     */
    public static void Task14() {
        System.out.println("Task#14");
        Scanner in = new Scanner(System.in);                                  //для хранения строки;
        System.out.print("Введите предложение: ");
        String s = in.nextLine();                                             //наше предложение;
        int result = s.replaceAll("[^A-ZА-Я]", "").length(); //заменяем все большие буквы на "";
        System.out.println("В этом предложении оличество СТРОЧНЫХ латинских или украинских букв = " + result);
    }

    /**
     *  Даны строки S, S1 и S2. Заменить в строке S последнее вхождение строки S1 на строку S2.
     */
    public static void Task37() {
        System.out.println("Task#37");
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите s: ");
        String s = sc.nextLine();
        System.out.println("Введите s1: ");
        String s1 = sc.nextLine();
        System.out.println("Введите s2: ");
        String s2 = sc.nextLine();

        s = s.replaceAll(s1, s2);   //заеменяю s1 на s2 и назначаю строке s ;
        System.out.println(s);
    }

    /**
     * Дан символ C. Вывести два символа,
     * первый из которых предшествует символу C в кодовой таблице,
     * а второй следует за символом C.
     */
    public static void Task3() {
        System.out.println("Task#3");
        char charC = 'c';   /*юникод С*/                                        /*перед С*/         /*после С*/
    System.out.printf("Символ \'%c\' перед ним %c после него %c", charC, (char) (charC - 2), (char) (charC + 1));
    }

    public static void main(String[] args) {
        Task14();
        Task37();
        Task3();
    }
}
