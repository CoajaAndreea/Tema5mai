public class P9 {
    public static void main(String[] args) {

        double distantaDintreOrase=SkeletonJava.readDoubleConsole("Distanta dintre orase este: ");
        double vitezaIon=SkeletonJava.readDoubleConsole("Viteza lui Ion este: ");
        double vitezaFlorica=SkeletonJava.readDoubleConsole("Viteza Floricai este: ");
        double distantaIon=0;
        double distantaFlorica=0;
        double timp=0;
        double delta=0;

        delta=Math.sqrt(distantaDintreOrase*distantaDintreOrase-4*vitezaFlorica*vitezaIon);

        if(distantaDintreOrase>delta)
        {
            distantaIon=(distantaDintreOrase+delta)/-2;
        }
        else
        {
            distantaIon=(distantaDintreOrase-delta)/-2;
        }

        timp=vitezaIon/distantaIon*60;

        System.out.println("Ion si Florica se intalnesc dupa "+timp+" minute");
        System.out.println("Distanta parcursa de Ion este de "+distantaIon+"km");
    }
}
