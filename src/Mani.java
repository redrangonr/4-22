import java.util.Scanner;

public class Mani {
    public static void main(String[] args) {
    Manager manager = new Manager();
    CanBo canBo = new CanBo();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhập thêm cán bộ");
            System.out.println("2. Hiển thị danh sách cán bộ");
            System.out.println("3. Hiển thị lương");
            System.out.println("4.Hiển thị luong lớn hơn 8 triệu");
            System.out.println("5. Thoát");
            int selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    manager.getInfo();
                    break;
                }
                case 2: {
                    manager.display();
                    break;
                }
                case 3: {
                    manager.Salary();
                    break;
                }
                case 4:{
                    System.out.println("Những thằng lương hơn 8 triệu");
                    manager.findMore_8_trieu();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }
        } while (true);
    }
}
