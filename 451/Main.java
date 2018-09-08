

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main   {
	
	
	public static void main(String args[]) {
		String   s="cccaaff";
		String[] sarr=s.split("");
		int[] arri=new int[256];
		int showcount=0;
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		for(char c:s.toCharArray()) {
			arri[c]++;
		}
		for(int i=0;i<=255;i++) {
			if(arri[i]!=0) {
				StringBuilder sb=new StringBuilder();
				if(map.containsKey(-arri[i])){
					String smap=map.get(-arri[i]);
					sb.append(smap);
					System.out.println("sd  "+smap);
					
				}
				
				for(int j=1;j<=arri[i];j++) {
					sb.append((char)i);
				}
				map.put(-arri[i], sb.toString());
				System.out.println(sb.toString());
				
			}
		}
 		Iterator it=map.keySet().iterator();
 		StringBuilder sb=new StringBuilder();
 		while(it.hasNext()) {
 			Integer ikey=(Integer) it.next();
 			String mystr=map.get(ikey);
 			sb.append(mystr);
 			
 		}
 		System.out.println(sb.toString());
 		//return sb.toString();
 	
	

	}
	
	

}
