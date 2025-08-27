import java.util.Scanner;

public class Claculator {
    public static void main(String[] args ){
        Scanner ab=new Scanner(System.in);
        int choice;


        System.out.println("Enter Two Number :" );
        int a=ab.nextInt();
        int b=ab.nextInt();
        System.out.println("First Value is :"+a);
        System.out.println("First Value is :"+b);

        do {

            System.out.println("---------Chose Any One Number---------");
            System.out.println("Addition Press 1");
            System.out.println("Substraction Press 2");
            System.out.println("Multipication  Press 3");
            System.out.println("Division Press 4");
//            System.out.println("Addition Press 1");
//            System.out.println("Addition Press 1");
//            System.out.println("Addition Press 1");
//            System.out.println("Addition Press 1");
//            Scanner sc=new Scanner(System.in);
//            int choice;
            choice =ab.nextInt();


            switch (choice){
                case 1:
                    int c=a+b;
                    System.out.println("Addition : " +c);
                    System.out.println("===============================");
                    break;
                case 2:
                    int d=a-b;
                    System.out.println("Substraction : " +d);
                    System.out.println("===============================");
                    break;
                case 3:
                    int e=a*b;
                    System.out.println("Multipication  : " +e);
                    System.out.println("===============================");
                    break;
                case 4:
                    int f=a/b;
                    System.out.println("Division : " +f);
                    System.out.println("===============================");
                    break;
                default:
                    System.out.println("Sorry !!  Please Enter VALID NUMBER ");


            }


        }
        while (choice!=5);

            ab.close();

    }

}
