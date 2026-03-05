package Bai1;

import java.util.*;

public class Main {
    static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Moi ban nhap do dai danh sach : ");
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println("Loi : So luong khong hop le");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu : " + (i+1) + " : ");
            list.add(sc.nextDouble());
        }

        double max = -99999.999;
        double min = 99999;
        for (Double x : list){
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Max : " + max + " | Min : " + min);

        double sum = 0;
        for (Double x : list){
            sum += x;
        }
        System.out.println("Average : " + (sum/n));


        Set<Double> set = new HashSet<>();
        for (Double x : list){
            set.add(x);
        }
        Double[] arr2 = new Double[100];
        int count = 0;
        for (Double x : set){
            arr2[count++] = x;
        }

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr2[i]  < arr2[j]){
                    double temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        System.out.print("Unique (Desc) :");
        for (int i = 0; i < count; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println(" ");


        for (Double x : set){
            if (x >= 50.0){
                System.out.println("Express :" + x);
            }
        }


    }
}
