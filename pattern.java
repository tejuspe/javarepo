public class pattern{

    public static void patterno(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void intpattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);			
			}
			System.out.println();
		}		
	}
	public static void intnewpattern(int n) {
		int a = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a);			
			}
			System.out.println();
			a++;
		}		
	}
	
	public static void reversepattern(int n){
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void noreversepattern(int n){
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pyramid(int n) {
		int a=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=a+i;j++) {
				System.out.print("*");
			}
			System.out.println();
			a++;
		}
	}
	
	public static void invpyramid(int n) {
		int a=n;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<a+i;j++) {
				System.out.print("*");
			}
			System.out.println();
			a--;
		}
	}
	
	public static void completepyramid(int n){
		int a=0;
		int b;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=a+i;j++) {
				System.out.print("*");
			}
			System.out.println();
			a++;
		}
		b=a;
	
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<b+i;j++) {
			System.out.print("*");
		}
		System.out.println();
		b--;
	}
}
    public static void main(String args[]){
        System.out.println("Hi tejas");
        System.out.println("hello java");
		patterno(3);
		intpattern(5);
		intnewpattern(5);
		reversepattern(5);
		noreversepattern(5);
		pyramid(5);
		invpyramid(5);
		completepyramid(9);
    }
}