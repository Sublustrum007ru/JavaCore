package view;

import controller.util.CreateArrays;
import util.Finds;
import util.Validator;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    private static final Validator valid = new Validator();
    private static final CreateArrays createArr = new CreateArrays();
    private static int[] arrInt = new int[]{};
    private static final Finds finds = new Finds();
    private static boolean flag = true;

    public static void app(){
        String input = prompt("Введите числа массива, разделяя их пробелом: ");
        while(flag) {
            if(valid.isEmptyArr(input) >= 2) {
                if (!valid.isArray(input)) {
                    input = prompt("Во введенной строке массива чисел, допущена ошибка. Повторите ввод: ");
                } else {
                    flag = false;
                }
            }else{
                input = prompt("Маасив не может быть пустым. Повторите ввод: ");
            }
        }
        arrInt = createArr.array(input);
        System.out.println(Arrays.toString(arrInt) + " -> Count evens = " + finds.countEvens(arrInt));
        System.out.println("The difference between tha Max and Min is equals = " + finds.diff(arrInt));

        System.out.println(valid.isAdjac(input));
    }


    public static String prompt(String args){
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print(args);
        result = scanner.nextLine();
        return result;
    }


}
