import java.util.Scanner;
public class SumOfColumnInArray {
    public static void showArray(float[][]arr){
        for (int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
    public float SumOfColumn(int column,float[][]arr){
        float sum=0;
        if (column<0||column>arr.length-1){
            System.out.println("Giá trị cột bạn nhập vào ko có tồn tại trong mảng");
        }else {
            for (int i=0;i<arr.length;i++) {
                sum+=arr[i][column];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tọa độ x: ");
        int x=scanner.nextInt();
        System.out.println("Nhập tọa độ y: ");
        int y=scanner.nextInt();
        float[][] arr=new float[x][y];
        for (int i=0;i<arr.length;i++){
            System.out.println("Nhập hàng thứ "+(i+1));
            for (int j =0;j<arr[i].length;j++){
                System.out.println("Nhập phần tử thứ "+(j+1));
                arr[i][j]=scanner.nextFloat();
            }
        }
        System.out.println("Bạn muốn tính tổng ở cột nào? ");
        int column=scanner.nextInt();
        SumOfColumnInArray a=new SumOfColumnInArray();
        System.out.println("Mảng đã nhập là: ");
        showArray(arr);
        System.out.println("Tổng tại cột "+column+" là: "+a.SumOfColumn(column,arr));

    }
}
