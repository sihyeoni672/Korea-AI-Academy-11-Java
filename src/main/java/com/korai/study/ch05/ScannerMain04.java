package com.korai.study.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerMain04 {
    public static void main(String[] args) {
        int[] nums = new int[]{10, 20, 50, 30, 80};
        Scanner a = new Scanner(System.in);

        while (true) {
            System.out.println("현재 배열: " + Arrays.toString(nums));
            System.out.print("계속 삭제하시겠습니까? (y/n): ");
            String answer = a.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.print("삭제할 숫자 입력: ");
                int b = Integer.parseInt(a.nextLine());
                int deleteIndex = -1;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == b) {
                        deleteIndex = i;
                        break;
                    }
                }
                if (deleteIndex == -1) {
                    System.out.println("해당 숫자가 없습니다.");
                    continue;
                }
                int[] num1 = new int[nums.length - 1];

                int j = 0;

                for (int i = 0; i < nums.length; i++) {
                    if (i != deleteIndex) {
                        num1[j] = nums[i];
                        j++;
                    }
                }

                nums = num1;
                System.out.println("삭제 완료!");

            } else if (answer.equalsIgnoreCase("n")) {
                break;

            } else {
                System.out.println("y 또는 n을 입력해주세요.");
            }
        }

        System.out.println("최종 배열: " + Arrays.toString(nums));
        a.close();
    }
}