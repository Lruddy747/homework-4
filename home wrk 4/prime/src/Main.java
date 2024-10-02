import java.util.*;

public class Main {
    public static void main(String[] args) {

        GenericStack<String> stack = new GenericStack<>();

        int i = 2;

        do {


            switch(i){
                case 2:
                    if(i == 2){
                        stack.push(String.valueOf(i));
                    }
                    break;
                case 3:
                    if(i == 3){
                        stack.push(String.valueOf(i));
                    }
                    break;
                case 5:
                    if(i == 5){
                        stack.push(String.valueOf(i));
                    }
                    break;
                case 7:
                    if(i == 7){
                        stack.push(String.valueOf(i));
                    }
                    break;
                case 11:
                    if(i == 11){
                        stack.push(String.valueOf(i));
                    }
                    break;
                case 13:
                    if(i == 13){
                        stack.push(String.valueOf(i));
                    }
                    break;

            }


            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0 && i % 13 != 0) {
                stack.push(String.valueOf(i));
            }

            i++;

        }while (stack.getSize() != 50);


        System.out.println(stack.toString());

    }
}
