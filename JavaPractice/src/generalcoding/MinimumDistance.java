package generalcoding;

public class MinimumDistance {
	
	public static void main(String args[]) {
		
		String[] s= {"gouri", "Dattu","Laxmi","Shubham","mahadev","kajal"};
		
		String word1="Dattu";
		String word2="kajal";
		
		int d1=-1,d2=-1,ans=Integer.MAX_VALUE;
		for(int i=0;i<s.length;i++) {	
			if(s[i].equals(word1)) {
				 d1=i;
			}
			if(s[i].equals(word2)) {
				 d2=i;
			}
			  if (d1 != -1 && d2 != -1)
			  {
		            ans = Math.min(ans, Math.abs(d1 - d2));
			  }
		}
		System.out.print(ans);
		}
	}

