import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int[] array=new int[n];
//        int s=0;
//        for (int i = 0; i < n; i++) {
//            array[i]=scanner.nextInt();
//            s+=array[i];
//        }
//        int min= Arrays.stream(array).min().orElse(0);
//        System.out.println("min:"+min);
//
//        int avg=s/n;
//
//        System.out.println(avg);
//
//        char[] string=scanner.next().toCharArray();
//        boolean s = false;
//        for(int i=0;i<string.length;i++){
//            if (!Character.isDigit(string[i])){
//                s=false;
//                break;
//            }
//            else s=true;
//        }
        String string1=scanner.next();
        if (isDigits(string1)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static boolean isDigits(String string){
        if (string.length()==1){
            return Character.isDigit(string.charAt(0));
        }
        else{
            return isDigits(string.substring(1)) && Character.isDigit(string.charAt(0));
        }
    }
}