package exercises;

public class tablice {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Ann";
        names[1] = "Tom";
        names[2] = "Pete";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

      /*  int[]  lottoNumbers=new int[] {1,2,3,4,5,6};
        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);*/

        //System.out.println("ilosc w tablicy lotto to " + names.length);


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
