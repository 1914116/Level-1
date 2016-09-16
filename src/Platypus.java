public class Platypus {
		private String name;

		void sayHi(){
			System.out.println("The platypus " + name + " is smarter than your average platypus.");
		}
		Platypus(String name){
			this.name = name;
		}	
		
		public static void main(String[] args) {
			//1. Make an instance of your new pet platypus
			Platypus p = new Platypus("George");
			//2. Call the sayHi method
			p.sayHi();	
			//3. Create a constructor in the platypus class so that you can give your platypus a n(String name);
			
				}
		


}

