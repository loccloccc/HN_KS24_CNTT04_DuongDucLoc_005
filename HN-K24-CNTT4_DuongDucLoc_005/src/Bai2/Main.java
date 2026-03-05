package Bai2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi cac danh muc : ");
        String input = sc.nextLine();
        if (input.trim() == ""){
            System.out.println("Loi : Chuoi khong duoc de trong");
            return;
        }
        String[] arr = input.split(",");
        for (String x : arr){
            map.put(x.toLowerCase().trim(), map.getOrDefault(x.toLowerCase().trim(),0)+ 1);
        }
        map.forEach((k,v) -> {
            System.out.println(k + " : " + v);
        });
        System.out.println("Moi ban nhap san pham muon tim kiem ");
        String search = sc.nextLine();
        map.forEach((k,v) ->{
            if (k.equals(search.trim().toLowerCase())){
                System.out.println("search : " + search + " : " + v);
            }
        });

    }
}
