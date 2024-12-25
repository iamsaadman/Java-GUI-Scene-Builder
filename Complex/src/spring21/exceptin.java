package spring21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] data = new int[10];
        for(int i=0;i<data.length;i++)
        {
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                data[a]= b/c;
            }catch (InputMismatchException e){
                System.out.println("Input mitchmatch");
                sc.nextLine();
                i--;
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Done!");
            }

        }


    }
}
