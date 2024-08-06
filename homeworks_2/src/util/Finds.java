package util;

public class Finds {
    public static int countEvens(int[] args){
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            if(args[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int diff(int[] args){
        int result = 0;
        result = findMax(args) - findMin(args);
        return result;
    }

    public static int findMax(int[] args){
        int max = args[0];
        for (int i = 1; i < args.length - 1; i++) {
            if(max < args[i]){
                max = args[i];
            }
        }
        return max;
    }

    public static int findMin(int[] args){
        int min = args[0];
        for (int i = 1; i < args.length - 1; i++) {
            if(min > args[i]){
                min = args[i];
            }
        }
        return min;
    }

}
