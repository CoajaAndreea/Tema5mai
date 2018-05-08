public class P16 {
    public static void main(String[] args) {
        int nr= SkeletonJava.readIntConsole("Introduceti numarul caruia vreti sa ii calculati factorialul");
        int p=1;

        for (int i=1;i<=nr;i++)
            p=p*i;

        System.out.println(p);
    }
}
