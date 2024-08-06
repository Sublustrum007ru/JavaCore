package controller.util;

import controller.createArray;

public class CreateArrays implements createArray {
    @Override
    public int[] array(String args) {
        String[] temp = args.split(" ");
        int[] result = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            result[i] = Integer.parseInt(temp[i]);
        }
        return result;
    }
}
