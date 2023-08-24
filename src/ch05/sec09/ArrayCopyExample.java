package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStringArray={"java", "array", "copy"};
        String[] newStrArray = new String[5];
        System.arraycopy(oldStringArray,0,newStrArray,0,oldStringArray.length);
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
