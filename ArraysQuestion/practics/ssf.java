package ArraysQuestion.practics;
public class ssf {
    public static void main(String[] args) {
        int arr = 234;
        System.out.println(diff(arr));
    }
    static int diff(int arr) {
        int product = 1;
        int sum = 0;
        while(arr>0){
            int rem = arr%10;
               sum += rem;
               product *= rem;
            arr = arr/10;
        }
   return product- sum;

    } 
}
