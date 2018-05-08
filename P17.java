public class P17 {
    public static void main(String[] args) {
        int[] sir={11, 13, 9, 8, 16, 10, 2};
        int i;
        for (i=0;i<sir.length;i++)
            if(sir[i]>sir[i+1])
                System.out.println(sir[i]+" "+sir[i+1]);
    }
}
