package ch05.solving;

public class PrintMaxValue {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int max = Integer.MIN_VALUE;
        for(int e : array){
            if(max < e){
                max = e;
            }
        }
        System.out.println(max);
    }
}
