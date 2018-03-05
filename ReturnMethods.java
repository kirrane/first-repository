public class ReturnMethods{

	public static void main (String[] args){
		ReturnMethods m = new ReturnMethods(); //instance
		int number = m.method1(); //calling method 1
		System.out.println("Method 3 returned " +number+" via method1 and method2");
		Index.main(null);
	}

		public int method1(){
			System.out.println("Method 1 here and i am calling method 2");
			return method2();//calling method 2
		}

		public int method2(){
			System.out.println("Hi method 1, from method 2, i am calling method 3");
			return method3();// calling method 3
		}

		public int method3(){
			System.out.println("Hi method 2, from method 3, tell method 1 i say hello");
			return 5;
		}
}