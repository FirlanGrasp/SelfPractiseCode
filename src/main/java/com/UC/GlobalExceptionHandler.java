package com.UC;


//@RestControllerAdvice
//@Sl4j
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(BusinessException.class)
//    public BaseResponse businessExceptionHandler(BusinessException e){
//        log.info("...");
//        return BaseResponse(...);
//    }
//
//}


import java.util.Arrays;
import java.util.Scanner;

public class GlobalExceptionHandler {

    public static void main(String[] args) {
        int[] a = {1,2,3,4};

        int[] b = Arrays.copyOfRange(a,1,4);

        System.out.println(Arrays.toString(b));

        Arrays.fill(a, 9);
        System.out.println(Arrays.toString(a));

        Arrays.fill(a, 1,4,7);
        System.out.println(Arrays.toString(a));

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int c  = sc.nextInt();
        Arrays.sort(a);
        System.out.println(c + Arrays.toString(a));

    }


}