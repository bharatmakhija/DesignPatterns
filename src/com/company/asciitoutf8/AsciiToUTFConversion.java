package com.company.asciitoutf8;

public class AsciiToUTFConversion {

    public static void main(String[] args) {

        Character c = '&';
        String s = "&";
        byte[] arr = s.getBytes();
        System.out.println(arr);
    }

}
