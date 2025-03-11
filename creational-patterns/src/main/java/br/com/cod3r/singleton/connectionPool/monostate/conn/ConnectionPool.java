package br.com.cod3r.singleton.connectionPool.monostate.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	private static final int POOL_SIZE = 2;
	private static final List<Connection> connectionsPool = new ArrayList<>();

	static {
		System.out.println("Creating Connection Pool");
		for (int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new Connection());
		}
	}

	public ConnectionPool() {
		System.out.println("New instance of Connection Pool");
	}

	public Connection getConnection() {
		Connection connection = connectionsPool.stream()
				.filter(c -> !c.isInUse())
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Nenhuma conexão disponivel no momento"));

		connection.setInUse(true);
		return connection;
	}

	public void leaveConnection(Connection connection) {
		connection.setInUse(false);
	}
}