import java.util.Arrays;
public class A {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {111, 13, 25, 9, 34, 1};
			Arrays.sort(a);
			
			System.out.println(a[a.length-2]);
			System.out.println(a[a.length-5]);
			
			int max=a[0];
			int min=a[0];
			
			for(int i=0;i<a.length;i++) {
				if(max<a[i]) {
					max=a[i];
				}else if(min>a[i]) {
					min=a[i];
				}
			}
			System.out.println(max);
			String str ="infosys";
			//	output="InFoSyS"
			StringBuffer sb= new StringBuffer();
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
					if(i%2==0) {
						sb.append(Character.toUpperCase(ch));
					}else {
						sb.append(Character.toLowerCase(ch));
					}
			}
			System.out.println(sb);
			System.out.println("Swamy Vadde");

		
		
	}

}
