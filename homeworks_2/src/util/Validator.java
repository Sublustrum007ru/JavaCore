package util;

import view.Application;

import java.util.Arrays;

public class Validator {

    private final static Application app = new Application();

    public static boolean isNumeric(String args){
        while(true){
            try{
                Integer.parseInt(args);
                return true;
            }catch(NumberFormatException ne){
                return false;
            }
        }
    }


    public static boolean isArray(String args) {
        String[] temp = args.split(" ");
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if(isNumeric(temp[i])){
                count++;
            }
        }
        if(count == temp.length){
            return true;
        }else{
            return false;
        }
    }

    public static int isEmptyArr(String args){
        int result = 0;
        String[] temp = args.split(" ");
        result = temp.length;
        return result;
    }

    public static boolean isAdjac(String args){
        boolean result = false;
        String[] temp = args.split(" ");
        for (int i = 0; i < temp.length - 1; i++) {
            if(temp[i].equals("0") && temp[i + 1].equals("0")){
                result = true;
            }
        }
        return result;
    }

}
