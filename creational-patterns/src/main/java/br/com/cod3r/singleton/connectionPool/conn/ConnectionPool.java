package br.com.cod3r.singleton.connectionPool.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	private static final ConnectionPool singleton = new ConnectionPool();
	private final List<Connection> connectionsPool;
	private final Integer POOL_SIZE = 2;

    public static ConnectionPool getInstance() {
       return singleton;
    }

	private ConnectionPool() {
		System.out.println("Creating Connection Pool");
		connectionsPool = new ArrayList<>();
		for (int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new Connection());
		}
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