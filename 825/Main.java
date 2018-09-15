import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		int sec=0;
		int [] arr= {16,16};
		Arrays.sort(arr);
		
		Map<Integer,Integer> map=new HashMap<>();//可以说是非常地“奇技淫巧”了
		int le=arr.length;
		for(int i=0;i<le;i++) {
			if(map.containsKey(arr[i])) {
				int myc=map.get(arr[i]);
				sec+=myc;
			}else {
				int myc=0;
				for(int j=0;j<le;j++) {
					if(arr[i]<arr[j])
						break;
					if(arr[j]>100 && arr[i]<100)
						break;
					if(i!=j) {
						int vala=arr[i];
						int valb=arr[j];
						if(valb<=0.5*vala+7  ) {
							
						}else {
							sec++;
							myc++;
						}
						
					}
				}
				map.put(arr[i], myc);
				
			}
		}
	
		System.out.println(sec);
		
	}


}
