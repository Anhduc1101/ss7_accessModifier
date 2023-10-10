package bt2;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của hình tròn: ");
        System.out.println("r: ");
        double r = Double.parseDouble(scanner.nextLine());
        System.out.println("Diện tích hình tròn là : " + StaticMethod.calCircleArea(r));

        System.out.println("Nhập vào kích thước của hình chữ nhật: ");
        System.out.println("w:");
        double w = Double.parseDouble(scanner.nextLine());
        System.out.println("h:");
        double h = Double.parseDouble(scanner.nextLine());
        System.out.println("Diện tích hình chữ nhật là: " + StaticMethod.calRectangleArea(w, h));

        System.out.println("Nhập vào 3 cạnh của tam giác: ");
        System.out.println("a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("c: ");
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("Diện tích hình tam giác là: " + StaticMethod.calTriangleArea(a, b, c));

    }
}
