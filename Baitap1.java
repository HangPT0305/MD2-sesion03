import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        int row,col;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhaajp vao so hang ma tran :");
        row = scanner.nextInt();
        System.out.print("Nhaajp vao so cot ma tran :");
        col = scanner.nextInt();
        //khai baos mangr hai chieu co hang va cot
        int[][] array=new int[row][col];
        //in menu
        do{
            System.out.println("---MeNu----");
            System.out.println("1.Nhập vào các phần tử của mảng");
            System.out.println("2.Hiển thị các giá trị của phần tử trong mảng");
            System.out.println("3.Tính tổng các phần tử trong mảng");
            System.out.println("4.In các phần tử có giá trị chẵn trong mảng");
            System.out.println("5.hiển thị các phần tử dưới dạng ma trận");
            System.out.println("6.Tính tổng các đường chéo chính");
            System.out.println("7.In ra đương biên");
            System.out.println("8.thoát");
            System.out.println("mời chọn từ 1-8");
            int choice=scanner.nextInt();
            switch(choice){
                case 1:
                    //nhập các phần tử tong mảng
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("array [%d][%d] = ",i,j );
                            array[i][j] = scanner.nextInt();

                        }
                    }
                    break;
                    case 2:
                        //hiển thị các phần tử
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                System.out.printf("array [%d][%d] = %d ",i,j,array[i][j]);

                            }
                        }
                        break;
                        case 3:
                            //in tổng các phần tử
                            int total = 0;
                            for (int i = 0; i < row; i++) {
                                for (int j = 0; j < col; j++) {
                                    total += array[i][j];
                                }
                            }
                            System.out.println("tổng cac phần tử : "+total);
                            break;
                            case 4:
                                //in ra các phần tử có giá trị chẵn
                                for (int i = 0; i < row; i++) {
                                    for (int j = 0; j < col; j++) {
                                        if (array[i][j] % 2 ==0){
                                            System.out.println("array [%d][%d] : "+array[i][j]+" ");
                                        }
                                    }
                                }
                                break;
                                case 5:
                                    //hiển thị các ptu duoi dang ma trận
                                    for (int i = 0; i < row; i++) {
                                        for (int j = 0; j < col; j++) {
                                            System.out.printf("\t [%d]]",+array[i][j]);
                                        }
                                        System.out.println(" ");
                                    }
                                    break;
                                    case 6:
                                        //tính tổng đg chéo chính
                                        int n = 0;
                                        for (int i = 0; i < row; i++) {
                                            for (int j = 0; j < col; j++) {
                                                if(i==j){
                                                    System.out.println("array [%d][%d] : "+array[i][j]+" ");
                                                    n += array[i][j];

                                                }
                                            }
                                        }
                                        System.out.println("tổng đường chéo chính là" + n);
                                        break;
                                        case 7:
                                            //in ra đường biên
                                            for (int i = 0; i < row; i++) {
                                                for (int j = 0; j < col; j++) {
                                                    if (i==0||j==0||i==array.length-1||j==array.length-1){
                                                        System.out.printf("\t %d",array [i][j]);
                                                    }else {
                                                        System.out.println(" ");
                                                    }
                                                }
                                            }
            }
        }while(true);
    }
}
