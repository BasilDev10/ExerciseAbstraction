import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("--------------------Book-------------------");
        Book book = new Book("Book1",200,"author1");
        Book book2 = new Book("Book2",300,"author2");
        System.out.println(book);
        System.out.println("-------------------------------------------");
        System.out.println(book2);


        System.out.println("--------------------Movie-------------------");
        Movie movie = new Movie("Movie1",100,"director1");
        Movie movie2 = new Movie("Movie2",200,"director2");
        System.out.println(movie);
        System.out.println("-------------------------------------------");
        System.out.println(movie2);

        System.out.println("---------------------Moveable-----------------------");

        MovablePoint movablePoint = new MovablePoint(0,0,10,10);

        Scanner input = new Scanner(System.in);
        int userInput = 0;
        do{
            System.out.println("Enter Move : ");
            System.out.println("1. Move up\n2. Move down\n3. Move left\n4. Move right\n0. Exit");
            userInput =input.nextInt();
            switch(userInput){
                case 1:
                    movablePoint.moveUp();
                    System.out.println(movablePoint);
                    break;
                case 2:
                    movablePoint.moveDown();
                    System.out.println(movablePoint);
                    break;
                case 3:
                    movablePoint.moveLeft();
                    System.out.println(movablePoint);
                    break;
                case 4:
                    movablePoint.moveRight();
                    System.out.println(movablePoint);
                    break;
                case 0:
                    System.out.println("Stopped !!");
                    System.out.println(movablePoint);
                    break;


            }
            if (userInput == 0)break;
        }while(true);

    }
}