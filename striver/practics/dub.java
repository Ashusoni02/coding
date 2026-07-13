package practics;

public class dub {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,3,3};
        int n = a.length;
        System.out.println(checkunique(a, n));
    }
    public static int checkunique(int[] a ,int n ){
        int unique = 1;
        for (int i = 0; i < n-1; i++) {
            if (a[i]!= a[i+1]) {
             unique++;
        }
    }
        return unique;
    }
}
