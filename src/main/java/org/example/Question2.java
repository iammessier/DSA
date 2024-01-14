package org.example;

public class Question2 {
    static void findPair(int group1_size, int[] stu1, int group2_size, int[] stu2, int coin_sum){
        boolean gotSum = false;
        for (int i = 0; i < group1_size; i++) {
            for (int j = 0; j < group2_size; j++) {
                if(stu1[i]+stu2[j] == coin_sum){
                    int x = i+1;
                    int y = j+1;
                    System.out.println(x+", "+y);
                    gotSum = true;
                }
            }
        }
        if(gotSum == false){
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        int coin_sum = 4;
        int group1_size = 3;
        int group2_size = 3;
        int[] stu1 = {1,3,7};
        int[] stu2 = {3,2,5};
        findPair(group1_size,stu1,group2_size,stu2,coin_sum);
    }
}
