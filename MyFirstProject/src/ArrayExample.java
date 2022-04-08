
public class ArrayExample {

	public static void main(String[] args) {
	
	//	int a[]=new int[5];
	//	a[0]=100;a[1]=200;a[2]=300;a[3]=400;a[4]=500;
		//for(int i=0;i<a.length;i++) {
	//		System.out.println(i);
	//	}
	//	for(int i:a) {
	//		System.out.println(i);
	//	}
		int b[][]=new int[3][2];
		b[0][0]=1;
		b[0][1]=2;
		b[1][0]=3;
		b[1][1]=4;
		b[2][0]=5;
		b[2][1]=6;


		/*for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.println(b[i][j]);
			}
		}*/
		for(int v[]:b) {
			for(int x:v) {
				System.out.println(x);
			}
		}
		String s="Welcome";
		String s1="To Java";
		String s3="        trimm  ";
		//System.out.println(s3.trim());
	//	System.out.println(s.concat(s1));
		//System.out.println(s);
		//System.out.println(s.length());
		//System.out.println(s.charAt(3));
		//System.out.println(s.replace("e","a"));
		System.out.println(s.substring(0,s.length()));
		
		int[] number=new int[5];
		number[0]=10;		
		number[1]=20;
		number[2]=33;
		number[3]=8;
		number[4]=65;
		int sum=0;
		/*for(int i1=0;i1<number.length;i1++) {
			sum=sum+number[i1];
			
		}
		System.out.println("Sum of elements in array is:"+sum);
		for(int k=0;k<number.length;k++) {
			if(number[k]==30) {
				System.out.println("The value of index for number 30 is:"+k);
			}*/
		/*for(int x=0;x<number.length;x++) {
			if(number[x]%2==0) {
				System.out.println(number[x]);
			}*/
		
		int min=number[0];
		for(int x=1;x<number.length;x++) {
			if(min>number[x]) {
				min=number[x];
			}
			
		}
		System.out.println("Minimum number in an array is: "+min);
			
		
		int c[]=new int[2];
		int d[]=new int[3];
		c[0]=1;
		c[1]=2;
		d[0]=3;
		d[1]=4;
		d[2]=5;
		int e[]=new int[c.length+d.length];
		e[0]=c[0];
		e[1]=c[1];
		e[2]=d[0];
		e[3]=d[1];
		e[4]=d[2];
		for(int t=0;t<e.length;t++) {
			System.out.println(e[t]);
		}
		
		
	}

		
		}
	
	
	
		

	


