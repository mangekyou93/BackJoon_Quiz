package q5000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5063 {
	
	//¹éÁØ ¹®Á¦ 5063 : TGN
	//ºÐ·ù : ±¸Çö
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");

			int r = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(e < r) {
				sb.append("do not advertise").append("\n");
			} else {
				if(e - r == c) {
					sb.append("does not matter").append("\n");
				} else if(e - r - c < 0) {
					sb.append("do not advertise").append("\n");
				} else {
					sb.append("advertise").append("\n");
				}
			}
			
			/*
			if(r>e-c) {										//³ë±¤°í ÀÌµæ > ±¤°í ÀÌµæ - ±¤°í ºñ¿ë	: ±¤°í x
                System.out.println("do not advertise");
            }
            else if(r==e-c) {								//³ë±¤°í ÀÌµæ = ±¤°í ÀÌµæ - ±¤°í ºñ¿ë	: »ó°ü¾øÀ½
                System.out.println("does not matter");
            }
            else {											//³ª¸ÓÁö						: ±¤°í O
                System.out.println("advertise");
            }
			 */
		}
		
		System.out.println(sb);
	}
}
