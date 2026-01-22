
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        try{
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextInt()){
                int n = sc.nextInt();
                boolean found = false;
                int count = 0;
                for(int i = 2; i < n; i++){
                    if(isPerfect(i)){
                        System.out.print(i + " ");
                        found = true;
                        count++;
                    }
                }
                System.out.print("So luong so nguyen to < n :" + count);
                System.out.println();
            }
        } catch (FileNotFoundException e){
        }
    }
    public static boolean isPerfect(int n){
        if (n <= 1){
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= n/2; i++){
            if (n%i == 0){
                sum+=i;
            }
        }
        if (sum == n){
            return true;
        } else return false;
    }
}