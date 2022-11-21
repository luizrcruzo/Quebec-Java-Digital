package dio.singleton;

public class SingletonSlackHolder {
	private static class InstanceHolder {
		public static SingletonSlackHolder instancia = new SingletonSlackHolder();
	}
	
	private SingletonSlackHolder() {
		super();
	}
	
	public static SingletonSlackHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
