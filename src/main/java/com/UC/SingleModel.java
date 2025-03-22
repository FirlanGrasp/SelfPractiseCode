package com.UC;

public class SingleModel {

    private SingleModel(){}

    private static class GEt{
        private static final SingleModel singleModel = new SingleModel();
    }

    public static SingleModel get(){
        return GEt.singleModel;
    }
}

enum S2{
    Instance(2);

    private int a;


    S2(int b){
        a = b;
    }

}

enum DAY{
    MONDAY(8){
        public void println(){
            System.out.println("1Day");
        }
    },
    Tuesday(7){
        public void println(){
            System.out.println("2Day");
        }
    };

    private final int time;

    DAY(int t){
        time = t;
    }

    public int getTime(){
        return time;
    }

    abstract public void println();

    public static void main(String[] args) {
        DAY[] day = DAY.values();
        for (DAY d : day) {
            d.println();
        }

        DAY day2 = DAY.valueOf("Tuesday");
        System.out.println(day2.getTime());

        DAY day3 = DAY.valueOf("MONDAY");
        System.out.println(day3.name());

        System.out.println(day3.ordinal());
    }

}