
public class Polymorphisim {

	public static void main(String[] args) {
		
				square s1=new square();
				s1.render();

			}

		}
		class Polygon{
			public void render() {
				System.out.println("Polygon...");
			}
		}
		class square extends Polygon{
			public void render() {
				System.out.println("Redering a square");
			}
		}
		class Circle extends Polygon{
			public void render() {
				System.out.println("Rendering circle...");
			}
		}


	


