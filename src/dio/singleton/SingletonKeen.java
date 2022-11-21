package dio.singleton;

public class SingletonKeen {

	private static SingletonKeen instancia = new SingletonKeen();
	
	private SingletonKeen() {
		super();
	}
	
	public static SingletonKeen getInstancia() {
		return instancia;
	}
}
