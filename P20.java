public class P20 {
    public static void main(String[] args) {
        int[] sir={4,5,7,2,9,6,12,45,76};

        for(int i=0;i<sir.length/2;i++)
        {
            sir[i]=sir[i]*2;
        }

        for (int i=sir.length/2;i<sir.length;i++)
        {
            if(sir[i]%2!=0)
                sir[i]=sir[i]*3;
        }

        for (int i=0;i<sir.length;i++)
            System.out.print(sir[i]+" ");
    }
}
