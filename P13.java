public class P13 {
    public static void main(String[] args) {
        int suma=0;
        int nr= SkeletonJava.readIntConsole("Introduceti numere");

        while (nr!=0) //citire pana la introdcerea lui 0
        {
            nr= SkeletonJava.readIntConsole(" ");

            if(nr>4 && nr<11) //verificarea conditiei data pentru calcularea sumei
                suma=suma+nr;
        }

        System.out.println("Suma numerelor mai mari decat 4 si mai mici decat 11 este "+suma);
    }
}
