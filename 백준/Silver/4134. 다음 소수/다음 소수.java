import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {

	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			String num=br.readLine();
			BigInteger prime=new BigInteger(num);
			long val=Long.parseLong(num);
			long sqrt=(long) Math.sqrt(val);
			boolean s=false;
			for(int i=2;i<=sqrt;i++) {
				if(val%i==0) s=true;
			}
			if(s)
				sb.append(prime.nextProbablePrime());
			else if(val==0||val==1) {
				sb.append(prime.nextProbablePrime());
			}
			else
				sb.append(val);
			
			sb.append("\n");
			
			
			
		}
		System.out.println(sb);
		
	}
}