package q10000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10996 {

	//πÈ¡ÿ πÆ¡¶ 10996 : ∫∞ ¬Ô±‚ - 21
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<n ; i++) {
			int count = 1;
			
			while(count <= 2){
				
				if(count % 2 != 0) {		// »¶ºˆ
					for(int j=1 ; j<=n ; j++) {
						sb.append(j % 2 != 0 ? "*" : " ");
					}
					sb.append("\n");
				} else {					// ¬¶ºˆ
					for(int j=1 ; j<=n ; j++) {
						sb.append(j % 2 == 0 ? "*" : " ");
					}
					sb.append("\n");
				}
				
				count++;
			}
		}
		
		System.out.println(sb);
	}
}
