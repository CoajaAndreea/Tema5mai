public class P14 {
    public static void main(String[] args) {
        int nr= SkeletonJava.readIntConsole("Introduceti numar");

        //verificare conditie data
        if (nr>=9 && nr<=24)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
