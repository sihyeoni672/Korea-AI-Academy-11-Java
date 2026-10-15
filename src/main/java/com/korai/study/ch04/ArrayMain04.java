package com.korai.study.ch04;

public class ArrayMain04 {
    public static void main(String[] args) {
        int[] nums = new int[10];                     // 정수 10개를 넣을 수 있는 배열, 처음 생성시 각 공간이 0으로 초기화
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;                          // 1씩 증가하면서 1~10을 넣는다
        }
        System.out.println(arrayToString(nums));      // nums 배열을 arrayToString 메서드에 전달
    }

    static String arrayToString(int[] arr) {          //정수 배열을 받아서 문자열로 바꿔 반환하는 메서드
        String str = "";                              // 빈문자열 str을 만들고
        for (int i = 0; i < arr.length; i++) {        // for문을 돌면서 배열의 값을 하나씩 문자열에 추가
            if (i == 0) {                             // i==0이면 배열의 첫번째 위치이기 때문에 대괄호 [ 열기
                str += "[";
            } else if (i == arr.length - 1) {         // 현재 i가 배열의 마지막 위치인 9까지 왔으면 ] 대괄호 닫기
                str += "]";
            }
            str += arr[i] + ", ";                     // arr[i]로 배열의 값을 하나씩 가져와서 콤마를 문자열에 계속 추가합니다
        }
        return str;                                   // return str을 통해 문자열 반환, println으로 출력
    }
}

// 배열을 문자열로 직접 만들어서 출력하는 코드이다