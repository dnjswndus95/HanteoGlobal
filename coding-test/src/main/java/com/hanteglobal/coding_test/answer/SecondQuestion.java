package com.hanteglobal.coding_test.answer;

import java.util.Scanner;

public class SecondQuestion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("동전의 종류를 입력하세요(쉼표로 구분, ex) 1,2,3) : ");
       String inputStr = scanner.nextLine();

       String[] coinStrArr = inputStr.split(",");
       int[] coins = new int[coinStrArr.length];

       for(int i = 0; i < coins.length; ++i) {
           coins[i] = Integer.parseInt(coinStrArr[i]);
       }

        System.out.println("합을 입력하세요 : ");
        int sum = scanner.nextInt();

        System.out.println("answer ====> " + getCombinationCount(sum, coins));
    }

    public static int getCombinationCount(int sum, int[] coins) {
        int[] dp = new int[sum + 1];

        dp[0] = 1;


        for(int i = 0; i < coins.length; ++i) {
            for(int j = coins[i]; j <= sum; ++j) {
                dp[j] += dp[j - coins[i]];
            }
        }

        return dp[sum];
    }
}
