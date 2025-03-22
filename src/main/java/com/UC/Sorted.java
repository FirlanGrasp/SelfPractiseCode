package com.UC;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sorted {

    public void maoPao(Integer[] objects){
        int length = objects.length;
        for(int i=0; i<length - 1; i++){
            for(int j=0; j< length - 1 - i; j++){
                if(objects[j] > objects[j+1]){
                    Integer temp = objects[j];
                    objects[j] = objects[j+1];
                    objects[j+1] = temp;
                }
            }
        }
    }

    public void choose(Integer[] objects){
        int length = objects.length;
        for(int i=0; i<length - 1; i++){
            Integer temp = objects[0];
            for(int j=0; j< length - i; j++){
                if(temp < objects[j]){
                    temp = objects[j];
                }
            }
            objects[length - i - 1] = temp;
        }
    }

    public void quick(int left, int right, Integer[] nums){
        if(left >= right) return ;

        int mid = nums[left];

        while(left < right){
            if(nums[right] >= mid){
                right--;
                continue;
            }else{
                nums[left] = nums[right];
                left++;
                while(left < right){
                    if(nums[left] <= mid){
                        left++;
                        continue;
                    }else{
                        nums[right] = nums[left];
                        right--;
                        break;
                    }
                }
            }

            nums[left] = mid;
            if(left - 1 >= 0){
                quick(0,left - 1, nums);
            }
            if(left + 1 <= nums.length - 1){
                quick(left+1,nums.length - 1, nums);
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Integer[] objects = new Integer[]{5,3,7,2,0,6,3,3,5,6,7,23,43,5,4,43,223,4556,87};
        Sorted sorted = new Sorted();
        long startTime = System.currentTimeMillis();
        sorted.maoPao(objects);
        long endTime = System.currentTimeMillis();
        List<Integer> list = Arrays.asList(objects);
        System.out.println(list);
        long totalTime = endTime - startTime;
        System.out.println("冒泡排序：" + totalTime);

        System.out.println("快排");
        sorted.quick(0, objects.length - 1, objects);
        list = Arrays.asList(objects);
        System.out.println(list);
    }


}
