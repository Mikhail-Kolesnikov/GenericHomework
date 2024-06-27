import java.util.Scanner;

public class MessageApp {

    public static void main(String[] args) {


        System.out.println("Для ввода сообщения нажмите 1, для ввода цифр введите 2 :");
        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        scanner.nextLine();

        if (counter == 1) {

            Message<String> str = new Message<>(scanner.nextLine());

            String string = str.getMessage();

            System.out.println(string);

        } else if (counter == 2) {


            Message<Integer> integerMessage = new Message<>(scanner.nextInt());
            Integer integer = integerMessage.getMessage();

            System.out.println(integer);

        } else {
            System.out.println("Введите 1 или 2");
        }


    }
}

//       Message<String> str = new Message<>(scanner.nextLine());
//        String string = str.getMessage();
//System.out.println(string);

//        Message<Integer> integerMessage = new Message<>(scanner.nextInt());
//        Integer integer = integerMessage.getMessage();
//System.out.println(integer);
//
//
