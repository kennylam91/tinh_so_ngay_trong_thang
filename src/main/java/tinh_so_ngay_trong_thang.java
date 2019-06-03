import java.util.Scanner;
public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input month:");
        int month = input.nextInt();
        if (month < 0 || month > 12)
            System.out.println("Invalid month");
        else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 days");
                    break;
                case 2:
                    System.out.println("28 or 29 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days");
                    break;
            }
        }
    }
}
