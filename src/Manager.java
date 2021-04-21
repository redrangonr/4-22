import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    Scanner scanner = new Scanner(System.in);
    List<CanBo> canBos = new ArrayList<>();
    public Manager(){
        Officer officer1 = new Officer("Hoa","17/8/89","Hà Nội");
        Officer officer2 = new Officer("Nhu","2/3/83","Hải Phòng");
        Officer officer3 = new Officer("Thao","9/6/86","Phú Thọ");
        canBos.add(new CanBo(900,12,32,officer1)) ;
        canBos.add(new CanBo(800,12,56,officer2));
         canBos.add(new CanBo(1000,34,12,officer3));


    }
    public void display() {
        for(CanBo list : canBos){
            System.out.println();
        }
        scanner.nextLine();
    }
    public void getInfo(){
        System.out.println("Nhập tên");
        String name =scanner.nextLine();
        System.out.println("Nhập quên quán");
        String town = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String date = scanner.nextLine();
        System.out.println("Nhập lương cứng");
        int hard = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tiền phạt");
        int fine =scanner.nextInt();
        System.out.println("Nhập tiền thưởng");
        int bonus =scanner.nextInt();
        Officer officer = new Officer(name,date,town);
        canBos.add(new CanBo(hard,bonus,fine,officer));

    }
    public void Salary(){
        for(CanBo list : canBos){
            list.setSalary(list.getHard()-list.getFine()+ list.getBonus());
            System.out.println(list.getOfficer().getName() +"" +list.getSalary()+"$");
        }
    }
    public void findMore_8_trieu(){
        int count=1;
        for (CanBo list : canBos){
            if(list.getSalary()>=800){
                System.out.println(list);
                count =2;
            }


        }//if(){
           // System.out.println("Toàn Thằng nghèo");
       //}
    }
}
