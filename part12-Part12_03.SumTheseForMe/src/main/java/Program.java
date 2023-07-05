
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here

        
    }
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int ans = 0, start, end;
        if(fromWhere < 0) {
            start = 0;
        } else {
            start = fromWhere;
        }

        if(toWhere > array.length) {
            end = array.length;
        } else {
            end = toWhere;
        }

        for(int i = start; i < end; i++) {
            if(array[i] <= largest && array[i] >= smallest) {
                ans += array[i];

            }
        }
        return ans;
    }

}
