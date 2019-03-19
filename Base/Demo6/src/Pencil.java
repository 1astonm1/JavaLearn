
public class Pencil {
	String name;
	
	public Pencil() {
		
	}
	
	public Pencil(String name) {
		this.name = name;
	}
	
	public static void write() {
		System.out.println("Ð´");
	}
}	

interface Eraser{
	public final String color = "°×É«";
	
	public abstract void clean();
}

class PencilWithEraser extends Pencil implements Eraser{
	public PencilWithEraser(){
		
	}
	
	public PencilWithEraser(String name) {
		super(name);
	}
	
	public void clean() {
		System.out.println("²Á¸É¾»");
	}
}

