package com.allianz.helloWorld;

public class HomeWork8 {
	public static void main(String args[]) {
		//draw(3);
//		String [][] table = {
//				{"1","2","3"},
//				{"4","5","6"},
//				{"7","8","9"}
//		};
//		multiplyTable(table);
	}

	    //	Q 1.1
//		public static void draw(int n) {
//			for(int i =0;i<n;i++) {
//				System.out.print("*");
//			}
//		}
//		Q1.2
//		public static void draw(int n) {
//			for(int i=0;i<n;i++) {
//				for(int k =0;k<n;k++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
	// Q1.3
//		public static void draw(int n) {
//			for(int i=1;i<=n;i++) {
//				for(int k =1;k<=n;k++) {
//					System.out.print(k);
//				}
//				System.out.println();
//			}
//		}
//		Q1.4
//		public static void draw(int n) {
//			for(int i=1;i<=n;i++) {
//				for(int k =n;k>=1;k--) {
//					System.out.print(k);
//				}
//				System.out.println();
//			}
//		}
	// Q1.5
//		public static void draw(int n) {
//			for(int i=1;i<=n;i++) {
//				for(int k =1;k<=n;k++) {
//					System.out.print(i);
//				}
//				System.out.println();
//			}
//		}
	// Q1.6
//		public static void draw(int n) {
//			for(int i=n;i>=1;i--) {
//				for(int k =1;k<=n;k++) {
//					System.out.print(i);
//				}
//			System.out.println();
//		}
//		}
//		Q1.7
//		public static void draw(int n) {
//			for(int i=1;i<=n;i++) {
//				for(int k = 1+n*(i-1);k<=n*i;k++) {
//					System.out.print(k);
//				}
//				System.out.println();
//			}
//		}
//		Q1.8
//		public static void draw(int n) {
//			for(int i=1;i<=n;i++) {
//				for(int k = 1+n*(i-1);k<=n*i;k++) {
//					System.out.print(n*n-k+1);
//				}
//				System.out.println();
//			}
//		}
	// Q2
//	    public static void multiplyTable(String [][]table) {
//	        int [][] arr = new int [3][3];
//	        for(int i=0;i<arr.length;i++) {
//	            for(int j=0;j<arr[i].length;j++) {
//	                arr[i][j] = Integer.parseInt(table[i][j]);
//	            }
//	        }
	//
//	        for(int i=0;i<arr.length;i++) {
//	            for(int j=0;j<arr[i].length;j++) {
//	                System.out.print((arr[i][j])*2+" ");
//	            }
//	            System.out.println();
//	        }
//	    }
	// Q3.1
//	    public static void draw(int n) {
//	        for(int i =0;i<n;i++){
//	            System.out.println(i*2);
//	        }
//	    }
	// Q3.2
//	    public static void draw(int n){
//	        for(int i =1;i<=n;i++){
//	            System.out.println(i*2);
//	        }
//	    }
	// Q3.3
//	      public static void draw(int n){
//	        for(int i=1;i<=n;i++){
//	            System.out.print(i);
//	            for(int j = 2;j <=n;j++){
//	                System.out.print(j*i);
//	            }
//	            System.out.println();
//	        }
//	      }
	// Q3.4
//	    public static void draw(int n){
//	        int i,j;
//	        for (i = 1; i <= n; i++) {
//	            for(j=1;j<=n;j++){
//	                if(j==i){
//	                    System.out.print("_");
//	                }else System.out.print("*");
//	            }
//	            System.out.println();
//	            }
//	    }
	// Q3.5
//	    public static void draw(int n){
//	        int i,j;
//	        for (i = 1; i <= n; i++) {
//	            for(j=n;j>0;j--){
//	                if(j==i){
//	                    System.out.print("_");
//	                }else System.out.print("*");
//	            }
//	            System.out.println();
//	            }
//	    }
	// Q3.6
//	    public static void draw(int n){
//	        for(int i=1;i<=n;i++) {
//	            for(int k =i ;k>0;k--){
//	                System.out.print("*");
//	            }
//	            for (int j = i; j <n; j++) {
//	                System.out.print("_");
//	            }
//	            System.out.println();
//	        }
//	    }
	// Q3.7
//	    public static void draw(int n){
//	        for(int i=0;i<n;i++) {
//	            for(int k =i ;k<n;k++){
//	                System.out.print("*");
//	            }
//	            for (int j = i; j >0; j--) {
//	                System.out.print("_");
//	            }
//	            System.out.println();
//	        }
//	    }
	// Q3.8
//	    public static void draw(int n){
//	        for (int i= 0; i<= n-1 ; i++) {
//	            for (int j=0; j<=i; j++) {
//	                System.out.print("*");
//	            }
//	            for (int j = i; j <n-1; j++) {
//	               System.out.print("_");
//	            }
//	            System.out.println();
//	        }
//	        for (int i=n-1; i>0; i--) {
//	            for(int j=0; j <= i-1;j++) {
//	                System.out.print("*");
//	            }
//	            for (int j = i; j <n; j++) {
//	                System.out.print("_");
//	            }
//	            System.out.println();
//	        }
//	    }
// Q3.9
//	public static void draw(int n) {
//		for (int i= 0; i<= n-1 ; i++) {
//            for (int j=0; j<=i; j++) {
//                System.out.print(i+1);
//            }
//            for (int j = i; j <n-1; j++) {
//               System.out.print("_");
//            }
//            System.out.println();
//        }
//        for (int i=n-1; i>0; i--) {
//            for(int j=0; j <= i-1;j++) {
//                System.out.print(i);
//            }
//            for (int j = i; j <n; j++) {
//                System.out.print("_");
//            }
//            System.out.println();
//        }
//	}
}
