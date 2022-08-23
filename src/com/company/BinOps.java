package com.company;

public class BinOps {

    private int binaryToInt(String binaryNumber) {
        try {
            return Integer.parseInt(binaryNumber, 2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Ошибка формата. Указанное число (" + binaryNumber + ") не является двоичным");
        }
    }

    public String sum(String a, String b) {
        int sum = binaryToInt(a) + binaryToInt(b);
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int sum = binaryToInt(a) * binaryToInt(b);
        return Integer.toBinaryString(sum);
    }

}
