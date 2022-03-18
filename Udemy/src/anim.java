
	class Animal{
		class Monkeys extends Animal{
			
		}
	}

	class anim {
		
		public void m1(Animal a) {
			System.out.println("Animal version");
		}
		public void m1(Animal.Monkeys m) {
			System.out.println("Monkey version");
		}
		
	
	public static void main(String[] args) {
		anim aa = new anim();
		Animal a = new Animal();
		aa.m1(a);
		//Animal.Monkeys m = new Animal.Monkeys();
		//aa.m1(m);
		

	}

}
