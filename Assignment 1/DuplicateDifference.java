import java.util.*;
class DuplicateDifference {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++){
            A[i] = obj.nextInt();
        }
        ArrayList<Integer> seen = new ArrayList();
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(A[i]==A[j] && !seen.contains(A[i])){
                    seen.add(A[i]);
                }
            }
        }
        if(seen.isEmpty()){
           System.out.print("There is no duplicate elements in given array"); 
        }
        else{
            System.out.println("The difference between first duplicate element and last duplicate element is: "+Math.abs(seen.get(0) - seen.get(seen.size()-1)));
        }
    }
}