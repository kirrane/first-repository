public class Shadow{

	public static void main (String[] args){
		Methods m = new Methods();
		m.globalVar();
	}
		int x = 1;
		int globalVar = 1;
		int localVar = 1;
		int Main = 1;

		public void globalVar(){
			System.out.println("Local x = ");
			localVar();
		}
		public void localVar(){
			System.out.println("Global x from method =");
			Main();
		}
		public void Main(){
			System.out.println("Global x from attribute: ");
		}

}