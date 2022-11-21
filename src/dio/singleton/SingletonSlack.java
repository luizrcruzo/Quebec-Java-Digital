package dio.singleton;

public class SingletonSlack {
	private static SingletonSlack instancia;	
	private SingletonSlack() {
		super();
	}
	
	public static SingletonSlack getInstancia() {
		if (instancia == null) {
			instancia = new SingletonSlack();
		}
		return instancia;
	}
}
