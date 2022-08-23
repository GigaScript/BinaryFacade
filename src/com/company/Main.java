package com.company;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(
                bins.sum("11011", "11011")
        );
        System.out.println(
                bins.mult("11011", "11011")
        );
    }
}
