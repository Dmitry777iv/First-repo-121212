public class LabRab3IvanovDV {

    public static void main (String[] args) {
        int [] array = {2,3,4,5,6,7,8,9,10};
        int sum = 1;
        for (int i = 0; i < 9;i++) {
         sum*=array [i];
        }
        System.out.println(sum);
    }
}
