

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main   {
	public static List<List<String>>  fi;
	
	public static void main(String args[]) {
		String[][] accounts= {{"John", "johnsmith@mail.com", "john00@mail.com"}, {"John", "johnnybravo@mail.com"}, {"John", "johnsmith@mail.com", "john_newyork@mail.com"}, {"Mary", "mary@mail.com"}};
		// List<List<String>>  er= Arrays.asList(account);
		//List<List<String>> accounts;
		 Main m=new Main();
		 m.fi=new ArrayList<List<String>>();
		 
		
		 for(int i=0;i<accounts.length;i++) {
			 List<String> myList=new ArrayList<String>(Arrays.asList(accounts[i]));
			 
			 m.ppush(myList);
		 }
		 int oldl=-1;
		 int nowl=m.fi.size();
		 
		 while (oldl!=nowl){
			 List< List<String>> fifi=m.fi;
			 m.fi=new ArrayList<List<String>>();
			 for(int i=0;i<fifi.size();i++) {
			 
				 m.ppush(fifi.get(i));
			 }
			 oldl=fifi.size();
			 nowl=m.fi.size();
		 }
		 
		 for(int i=0;i<m.fi.size();i++) {
			 String usn=m.fi.get(i).get(0);
			 List<String > sr=new ArrayList<String>();
			 List<String > sr1=m.fi.get(i);
			 for(int j=1;j<sr1.size();j++) {
				 String tstr=sr1.get(j);
				 Boolean isf=false;
				 for(int k=0;k<sr.size();k++) {
					 if(tstr.equals(sr.get(k))) {
						 isf=true;
						 break;
					 }
				 }
				 if(!isf) {
					 sr.add(tstr);
				 }
			 }
			 
			 
			
			 sr.sort(null);
			 List<String > sr2=new ArrayList<String>();
			 sr2.add(usn);
			 sr2.addAll(sr);
			 m.fi.set(i, sr2);
			 
			 for(int j=0;j<m.fi.get(i).size();j++) {
				 
				 System.out.print(m.fi.get(i).get(j)+" ");
				
			 }
			 System.out.println("");
		 }
		
		
		
 		
 	
	}
	
	
	
	public void ppush(List<String> ss ) {
		if(fi!=null && fi.size()>0) {
			Boolean isFound=false;
			int thei = 0;
		
			List<String> thest = null;
			for(int i=0;i<fi.size();i++) {
				if(fi.get(i).get(0).equals(ss.get(0))) {
					List<String> ch1=fi.get(i);
					for(int ii=1;ii<ch1.size();ii++) {
						for(int jj=1;jj<ss.size();jj++) {
							if(ch1.get(ii).equals(ss.get(jj))) {
								isFound=true;
								thei=i;
								thest=ch1;
								break;
							}
						}
					}
				}
			}
			if(isFound) {
				for(int ii=1;ii<thest.size();ii++) {	
					for(int jj=1;jj<ss.size();jj++) {
					
						if(thest.get(ii).equals(ss.get(jj))) {
							//System.out.println(ss.get(jj));
							ss.remove(jj);
							jj--;
						}
					}
					
				}
				ss.remove(0);
				thest.addAll(ss);
				fi.set(thei, thest);
				
				
			}else {
				fi.add(ss);
			}
				
			
		}else {
			fi.add(ss);
		}
	}
	

}
