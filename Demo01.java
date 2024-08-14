public class Demo01 {
    public static void main(String[] args) {
        //khai báo mảng 1 chiều
        //cần khai báo mảng 1 chiều chứa 5 pt có kiểu dữ liệu số nguyên int
        int [] array = new int [5];
        //khai báo mảng 1 chiều có 5 phần tử kiểu int gán giá trị cho 5 ptu
        int [] array01 = {3,6,7,9,2};
        // truy cập các phần tử của mangr
        //truy xuất để lấy ra giá trị thông qua chỉ mục của mảng
        System.out.println("giá trị của phần tử thứ 3 của mảng array01" +array01[2]);
        //th2:truy xuất để gán gtri các ptu trong mang thông qua chỉ mục
        array[0] =8;
        //vì trong java phải cùng kiểu dữ liệu lên chỉ đc là int
        System.out.println("giá trị của phần thử thứ nhất la" + array[0]);
        //dùng mảng duyệt ra các phần tử mảng
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
