package modifiers;

public class AccessModifiers {
	
		int numbers;
		float hrs;
		int noc;
		void pupils() {//m1
			System.out.println("Number of Students");
		}
		void displayHours() {
			System.out.println("Number of Hours");
		}
		void displayClass() {//m3
			System.out.println("Number of Class");
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AccessModifier am = new AccessModifier();
			am.displayStudents();
		}

	}

