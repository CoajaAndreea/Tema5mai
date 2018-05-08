public class P1 {

    public static void main(String[] args) {
        //citire numere de la tastatura
        double primulNr=SkeletonJava.readDoubleConsole("Primul numar este: ");
        double alDoileaNr=SkeletonJava.readDoubleConsole("Al doilea numar este: ");

        //initializare media aritmetica
        double mediaAritmetica=0;

        //formula pentru media aritmetica
        mediaAritmetica=(primulNr+alDoileaNr)/2;

        //afisare
        System.out.println("Media aritmetica a numerelor "+primulNr+" si "+alDoileaNr+" este: "+mediaAritmetica);
    }
}
