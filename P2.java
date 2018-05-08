public class P2 {
    public static void main(String[] args) {

        //citire numarului N de la tastatura
        int N= SkeletonJava.readIntConsole("Introduceti N");

        //initializari
        int[] numereArray=new int[N];
        double mediaAritmetica=0;
        int i=0;
        double suma=0;

        //introducerea numerelor
        System.out.println("Introduceti numerele");
        for (i=0;i<N;i++)
        {
            numereArray[i]=SkeletonJava.readIntConsole(" ");
        }

        //calcularea mediei aritmetice
        for (i=0;i<N;i++)
        {
            suma=suma+numereArray[i];
        }

        mediaAritmetica=suma/N;

        System.out.println("Media aritmetica este "+mediaAritmetica);
    }
}
