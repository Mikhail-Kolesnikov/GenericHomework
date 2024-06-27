import java.util.Scanner;

public class MessageApp {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Message <String> str =new Message<>(scanner.nextLine());
        String string= str.getMessage();
        System.out.println(string);


        Message<Integer> integerMessage= new Message<>(scanner.nextInt());
        Integer integer= integerMessage.getMessage();
        System.out.println(integer);









    }
}

