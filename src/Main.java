import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] result = new int[100];
        int k =0;
        double q;
        int q_int;
        for (int i=1000; i<10000; i++){
           seach: for (int j=10; j<100; j++){
               q= (double) i/j;
               q_int = (int) q;
               if (q !=q_int) {continue;}
               if (String.valueOf(q_int).length()>2) {continue;}
                else {
                    char[] number = String.valueOf(i).toCharArray();
                    /*char[] mult1 = String.valueOf(q_int).toCharArray();
                    char[] mult2 = String.valueOf(j).toCharArray();
                    checking: for (int z:number) {
                        for (int x=0;x<mult1.length; x++) {
                            if (z==mult1[x]){mult1[x]=0; continue checking;}
                        }
                        for (int x=0;x<mult2.length; x++) {
                            if (z==mult2[x]){mult2[x]=0; continue checking;}
                        }
                        continue seach;
                    }
                 */
                   char[] mult = (String.valueOf(q_int)+String.valueOf(j)).toCharArray();
                   Arrays.sort(number);
                   Arrays.sort(mult);
                   if (Arrays.equals(number,mult)) {
                       result[k++] = i;
                       result[k++] = q_int;
                       result[k++] = j;
                   }
                }
            }
        }
        for (int a=0; a<result.length; a+=3){
            if (result[a]!=0 && result[a]!=result[a+3]){
        System.out.println(result[a] + " = " + result[a+1] + " * "+ result[a+1]);
            }
        }
        return;
    }
}

