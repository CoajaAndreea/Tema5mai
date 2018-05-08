public class P7 {
    public static void main(String[] args) {

        //citirea pretului
        double pretProdus=SkeletonJava.readDoubleConsole("Pretul produsul este: ");

        double pretTVA=0;
        pretTVA=0.19*pretProdus;

        System.out.println(pretTVA);
    }
}
