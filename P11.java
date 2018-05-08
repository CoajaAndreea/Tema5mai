public class P11 {
    public static void main(String[] args) {
        //citire
        int nr= SkeletonJava.readIntConsole("Introduceti numar");

        //initializare
        int[] sir = {1,3,4,6,7,8,10,12,14,23};
        int i=0;
        int ok=0;

        for(i=0;i<sir.length;i++)
        {
            if(nr==sir[i]) //verificarea existentei nr in sirul dat
            {
                ok=i;
                break;
            }

            if (nr<sir[i]) //sirul fiind ordonat nu are rost sa se repete insturctiunile din for daca nr<sir[i]
                break;
        }

        //afisare
        if (ok!=0)
            System.out.println(ok);
        else
            System.out.println(-1);

    }
}
