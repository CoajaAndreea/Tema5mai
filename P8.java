public class P8 {
    public static void main(String[] args) {

        //initializari
        double viteza=0;
        double distantaInM=0;
        double timpInSecunde=0;

        //citirea datelor de la tastatura
        double distanta=SkeletonJava.readDoubleConsole("Distanta parcursa este: ");
        double timp=SkeletonJava.readDoubleConsole("Numarul de ore petrecut pe drum este: ");

        //calcularea vitezei in m/s
        distantaInM=distanta*1000;
        timpInSecunde=timp*3600;
        viteza=distantaInM/timpInSecunde;
        System.out.println(viteza);
    }
}
