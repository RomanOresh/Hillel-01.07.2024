import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите вашу группу (1-3) \n" +
                "Группа 1. Доход до 10000 включительно. \n" +
                "Группа 2. Доход от 10000 до 25000 включительно. \n" +
                "Группа 3. Доход от 25000. \n");
        int group = scan.nextInt();

        System.out.println("Введите ваш доход: ");
        int dohod = scan.nextInt();


        double nalog = switch (group) {
            case 1 -> dohod * 0.025;
            case 2 -> dohod * 0.043;
            case 3 -> dohod * 0.067;
            default -> 0.0;
        };
        System.out.printf("Налог с вашего дохода " + "%.2f",nalog);
/*
        if (dohod >=1 && dohod <=10000){
            nalog = dohod * 0.025;
            System.out.printf("Налог с вашего дохода " + "%.2f",nalog);
        } else if  (dohod > 10000 &&  dohod <= 25000){
            nalog = dohod * 0.043;
            System.out.printf("Налог с вашего дохода " + "%.2f",nalog);
        } else if  (dohod > 25000) {
            nalog = dohod * 0.067;
            System.out.printf("Налог с вашего дохода " + "%.2f",nalog);
        } else System.out.println("Неверный ввод");
 */

    }


}
















