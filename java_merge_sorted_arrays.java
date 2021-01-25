import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<k;i++){
			for(int j=0;j<n;j++){
				arr.add(sc.nextInt());
						}
		}
		Collections.sort(arr);
		String str = arr.toString()
    .replace(",", "")  //remove the commas
    .replace("[", "")  //remove the right bracket
    .replace("]", "")  //remove the left bracket
    .trim();   
				System.out.print(str);
		    }
}