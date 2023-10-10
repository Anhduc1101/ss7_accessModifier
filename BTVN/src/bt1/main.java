package bt1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MyClass myClass=new MyClass();
        System.out.println("chuoi: ");
        String chuoi=scanner.nextLine();
        myClass.setMyString(chuoi);
        System.out.println("Dữ liệu của bạn: " +myClass.getMyString());
    }
}
