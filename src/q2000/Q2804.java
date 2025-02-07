package q2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2804 {

	//【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【
	//背稽錘 庚薦績 熱走原 さげ
	//庚薦 佐重旭製せせせ
	//print櫛 戚訓暗 陥 業旭精汽 獣降せせせせ
	//【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【【
	//拷層 庚薦 2804 : 滴稽什趨球 幻級奄
	//歳嫌 : 鋼差庚
	//庚薦拭辞 N < M 繕闇亀 蒸製
	//AAAAAAAB BEST 照喫
	static int n,m;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken().toUpperCase();
		String B = st.nextToken().toUpperCase();
		
		boolean check = false;
		
		for(int i=0 ; i<B.length() ; i++) {
			for(int j=0 ; j<A.length() ; j++) {
				if(A.charAt(j) == B.charAt(i)) {
					n = j;
					m = i;
					check = true;
					break;
				}
			}
			
			if(check) break;
		}
		
		for(int i=0 ; i<B.length() ; i++) {
			
			if(i == m) {
				sb.append(A).append("\n");
				continue;
			}
			
			for(int j=0 ; j<B.length() ; j++) {
				
				if(j == n) {
					sb.append(B.charAt(i));
				} else {
					sb.append(".");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
}
