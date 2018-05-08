public class P19 {
    public static void main(String[] args) {
        int[] sir={4,5,7,2,9,6,12,45,76};
        int aux=sir[0];
        int ok=1;

         for(int i=0;i<sir.length;i++)
             if(sir[i]>sir[i+1])
             {
                 aux=sir[i];
                 sir[i]=sir[i+1];
                 sir[i+1]=sir[i];
                 ok=0; //verificam daca sirul este ordonat sau nu
             }

             if(ok==1)
                 System.out.println("Sirul este crescator");
                else
                 for (int i=0;i<sir.length;i++)
                     System.out.println(sir[i]);
    }
}
