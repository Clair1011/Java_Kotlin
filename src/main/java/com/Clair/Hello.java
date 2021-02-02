package com.Clair;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello");
        Person p = new Person();
        p.hello();
        int age = 19; //基本資料型態
        Integer age2 = 19; // age2變物件 (參照資料型態)
        // age2.byteValue()
        char c = 'A';
        byte b = 120;
        float weight = 66.5f; // 預設為double,使用float後須加f
        double height = 1.7;
        boolean adult = true;
        boolean enroll = false;
        String name = "Claire"; //字串字首需大寫
        //為基本資料設計的類別稱包裝類別 Wrapper class
    }
}
