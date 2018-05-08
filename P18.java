public class P18 {
    public static void main(String[] args) {
        int x= SkeletonJava.readIntConsole("Introduceti x");
        int n= SkeletonJava.readIntConsole("Introduceti n");
        int suma=1;
        int putere=1;

        for (int i=0;i<n;i++) {
            putere = putere * x;
            suma = suma + putere;
        }

        System.out.println(suma);
    }
}
