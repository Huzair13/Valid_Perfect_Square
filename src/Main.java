import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number !!");

        int number=scanner.nextInt();

        boolean isPerfect=isPerfectSquare(number);
        System.out.println(isPerfect);
    }

    private static boolean isPerfectSquare(int number) {
        int i=1;
        while((i*i)<=number){
            if((i*i)==number){
                return true;
            }
            i++;
        }
        return false;
    }
}