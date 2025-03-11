package br.com.cod3r.singleton.connectionPool.monostate;

import br.com.cod3r.singleton.connectionPool.monostate.conn.Connection;
import br.com.cod3r.singleton.connectionPool.monostate.conn.ConnectionPool;

import java.util.Objects;

public class Client {

	public static void doQuery1() {
		ConnectionPool pool = new ConnectionPool();
		Connection connection = pool.getConnection();
		if (Objects.nonNull(connection))
			connection.query("SELECT * FROM A1");
	}
	
	public static void doQuery2() {
		ConnectionPool pool = new ConnectionPool();
		Connection connection = pool.getConnection();
		if (Objects.nonNull(connection))
			connection.query("SELECT * FROM A2");
	}
	
	public static void doQuery3() {
		ConnectionPool pool = new ConnectionPool();
		Connection connection = pool.getConnection();
		if (Objects.nonNull(connection))
			connection.query("SELECT * FROM A3");
	}

	public static void main(String[] args) {
		System.out.println("Connection Pool Size: 2");
		doQuery1();
		doQuery2();
		doQuery3();
	}
}
