import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public class TreeNode {
		    int val;
		      TreeNode left;
		     TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	public static void main(String[] args) {
		Main m=new Main();
		int[] pre = {1,2};
		int[] post = {2,1};
		m.constructFromPrePost(pre, post);
	
		
	}
	
    public TreeNode constructFromPrePost(int [] pre, int[] post) {
    	List<Integer> list=new ArrayList<>();
    	List<Integer> listpo=new ArrayList<>();
    	
    	for(int i=0;i<pre.length;i++) {
    		list.add(pre[i]);
    		listpo.add(post[i]);
    	}
    	
    		return 	fun(list,listpo);
        
        
    }
    public TreeNode fun(List<Integer>  pre,List<Integer> post) {
    	 TreeNode te=new TreeNode(pre.get(0));
    	 
    	 if(pre.size()>1) {
    	 
	    	 List<Integer> fe=new ArrayList<>();
	    	 List<Integer> fepo=new ArrayList<>();
	    	 List<Integer> preli=new ArrayList<>();
	    	 int cc=1;
	    	 List<Integer> prepo=new ArrayList<>();
	    	 int l=pre.get(1);
	    	 Boolean met=false;
	    	 for(int i=0;i<post.size()-1;i++) {
	    		 if(!met) {
	    			 fe.add(post.get(i));
	    			 preli.add(pre.get(cc));
	    			 cc++;
	    		 }else {
	    			 fepo.add(post.get(i));
	    			 prepo.add(pre.get(cc) );
	    			 cc++;
	    		 }
	    		 
	    		if(post.get(i)==l) {
	    			met=true;
	    		}
	    		
	    	 }
	    	 if(preli.size()>0&&fe.size()>0)
	    		 te.left=fun(preli,fe);
	    	 if(prepo.size()>0&&fepo.size()>0)
	    	 	te.right=fun(prepo,fepo);
	    	 
    	 }
    	 return te;
    	 
    }

	
	


}
