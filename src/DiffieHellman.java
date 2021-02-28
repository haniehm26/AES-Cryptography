import java.util.Scanner;

public class DiffieHellman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long p = s.nextInt();
        long g = s.nextInt();
        long a = s.nextInt(); // Alice
        long b = s.nextInt(); // Bob

        // (g^a) % p
        long A = pow(g, a, p); // Alice
        long B = pow(g, b, p); // Bob

        // Alice gets B
        // Bob gets A

        // (B^a) % p
        long sA = pow(B, a, p); // Alice Key
        long sB = pow(A, b, p); // Bob Key

        long result = -1;

        if (sA == sB) {
            result = sA;
        }

        System.out.print(A + " " + B + " " + result);
    }

    static long pow(long a, long b, long p) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a % p;
        } else {
            long result = a % p;
            for (int i = 1; i < b; i++) {
                result = result * a % p;
            }
            return result;
        }
    }
}
