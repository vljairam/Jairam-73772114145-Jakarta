import java.util.*;
class DuplicateOccurence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String S = obj.next();
        int count = 0;
        for(int i=0;i<S.length()-2;i++){
            if (S.charAt(i) == S.charAt(i+1) && S.charAt(i) == S.charAt(i+2)) {
        count++;
    }
        }
        System.out.print(count);
    }
}