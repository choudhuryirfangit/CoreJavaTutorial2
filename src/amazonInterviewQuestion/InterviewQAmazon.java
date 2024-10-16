package amazonInterviewQuestion;

import java.util.ArrayList;

public class InterviewQAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {4,5,6,4,5,4,5,6,5,4,7,5,6,9,9};
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!ar.contains(a[i])) {
				ar.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
					}
			}
				
				System.out.println(a[i]+" - "+k);
				if(k==1) {
					System.out.println(a[i]+" is the unique number");
				}
			}
			
		}
			
	}

}
