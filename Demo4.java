import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("nhập vào số phần tử của mảng");
            int n = sc.nextInt();
            int[]arry = new int[n];
            System.out.println("----MENU");
            System.out.println("1.nhập vào các giá trị của mảng");
            System.out.println("2.hiển thị các giá trị của phần tử trong mảng");
            System.out.println("3.tính tổng các phần tư trong mảng");
            System.out.println("4.in ra các phần tử có giá trị chẵn trong mảng");
            System.out.println("5.hiển thị các phần tử dưới dạng ma trận");
            System.out.println("6.tính tổng đg chéo chính");
            System.out.println("7.in ra đg biên");
            System.out.println("mời bạn nhập từ 1-5");
            int x = sc.nextInt();
            switch(x){
                case 1:
                    System.out.println("moi ban nhap gia tri cua mang");
                    for (int i = 0; i < n; i++) {
                        System.out.println("nhập vào phần tử thứ" + (i+1));
                        arry[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        System.out.printf("phần tử thứ %d =%d\n", i, arry[i]);

                    }
                    break;
                case 3:
                    int total = 0;
                    for (int j = 0; j < n; j++) {
                        total += arry[j];

                    }
                    System.out.println(total);
                    break;
                case 4:
                    for (int i = 0; i < n; i++) {
                        if (i % 2 == 0) {
                            System.out.println(arry[i]);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;

            }

        }while (true);
    }
}
