package Bai3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
    static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String input = sc.nextLine();
        if (input.trim() == "") {
            System.out.println("Loi : Chuoi khong duoc de trong");
            return;
        }
        String[] arr = input.trim().split("");
        Integer count1 = 0;
        Integer count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].trim().equals("}") || arr[i].trim().equals(")") || arr[i].trim().equals("]")) {
                stack1.push(arr[i]);
                count1++;
            }
            if (arr[i].trim().equals("{") || arr[i].trim().equals("(") || arr[i].trim().equals("[")) {
                stack2.push(arr[i]);
                count2++;
            }
        }
        Integer count = 0;
        do {
            for (String x : stack2){
                if (!stack1.pop().equals(x.trim())){
                    count++;
                }
            }
        }while (!stack1.isEmpty());
        if (count == count1 && count == count2) System.out.println("true");
        else System.out.println("false");
    }
}