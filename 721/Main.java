

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main   {
	
	
	public static void main(String args[]) {
		String[][] accounts= {{"John", "johnsmith@mail.com", "john00@mail.com"}, {"John", "johnnybravo@mail.com"}, {"John", "johnsmith@mail.com", "john_newyork@mail.com"}, {"Mary", "mary@mail.com"}};
		//List<List<String>>  er= Arrays.asList(accounts);
		//List<List<String>> accounts;
		 Main m=new Main();
		 List<List<String>> result=new ArrayList<List<String>>();
		 int[] person=new int[accounts.length];
		for(int i=0;i<accounts.length;i++) {
			person[i]=i;
			
		}
		Map<String,Integer> email=new HashMap<String,Integer>(); 
		Map<Integer,List<String>> permap=new HashMap<Integer,List<String>>();
		 for(int i=0;i<accounts.length;i++) {
			 List<String>  er= new ArrayList<String>(Arrays.asList(accounts[i]));
			// List<String>  er=accounts.get(i);
			 for(int j=1;j<er.size();j++) {
				 if(email.containsKey(er.get(j))) {
					 m.union(person, i, email.get(er.get(j)));
				 }else {
					 email.put(er.get(j), i);
				 }
			 }
		 }
		 for(Map.Entry<String,Integer> ent:email.entrySet()) {
			 int realposition=m.found(person, ent.getValue());
			 if(permap.get(realposition)==null) {
				 List<String> mystr=new ArrayList<String>();
				mystr.add(accounts[realposition][0]);
				// mystr.add(accounts.get(realposition).get(0));
				 mystr.add(ent.getKey());
				 permap.put(realposition, mystr);
				 
			 }else {
				 List<String> mystr=permap.get(realposition);
				 mystr.add(ent.getKey());
				 permap.put(realposition, mystr);
			 }
			 
		 }
		 for(Map.Entry<Integer, List<String>> per:permap.entrySet()) {
			 List<String> userlist=per.getValue();
			 String username=userlist.get(0);
			 userlist.remove(0);
			 userlist.sort(null);
			 userlist.add(0, username);
			 result.add(userlist);
		 }
		 
	
		 for(int i=0;i<result.size();i++) {
			 for(int j=0;j<result.get(i).size();j++) {
				 System.out.println(result.get(i).get(j));
			 }
			 
		 }
		
		
		
		
 		
 	
	}
	public int found(int[] arr,int i) {
		if(arr[i]!=i) {
			i=arr[i];
			found(arr,arr[i]);
		//System.out.println(arr[i]+ " i"+ i);	
		}
		return i;
	}
	public void union(int[] arr,int from,int to) {
		int realform=found(arr,from);
		int realto=found(arr,to);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==realform)
				arr[i]=realto;
		}
				
	}
	
	
	

}
