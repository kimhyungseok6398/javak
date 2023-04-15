package polymorphism;

public interface Cat1 {
	class Cat implements Pet{		// 고양이
		public void 울기() {
			System.out.println("야옹");
		}
		public void 먹기() {
			System.out.println("츄르");
		}
	}

	class Dog implements Pet{		// 강아지
		public void 울기() {
			System.out.println("멍멍");
		}
		public void 먹기() {
			System.out.println("개껌");
		}
	}

	class Bird implements Pet{			// 새

		@Override
		public void 울기() {
			System.out.println("짹짹");
		}

		@Override
		public void 먹기() {
			System.out.println("모이");
	
			package polymorphism;

			public interface Pet {
				public void 울기();
				public void 먹기();
}
