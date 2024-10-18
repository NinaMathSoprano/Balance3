import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        int S1 = 300;
        int S2 = 1100;
        if (S2 >= 1000) System.out.println(S1 + S2 + S2 / 100);
        else {
            int S4 = S1 + S2;
            out.println(S1 + S2);
        }

    }
}