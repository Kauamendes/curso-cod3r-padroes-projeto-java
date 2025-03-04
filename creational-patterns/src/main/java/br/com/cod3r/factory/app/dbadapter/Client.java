package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.Db;
import br.com.cod3r.factory.app.dbadapter.factory.TipoDb;

public class Client {

	private static final String SELECT_QUERY = "SELECT * FROM USERS";
	private static final String INSERT_QUERY = "INSERT INTO USERS(id, nome) VALUES (1, 'Usuario')";

	public static void main(String[] args) {
		Db db = new Db();
		db.query(SELECT_QUERY);
		db.update(INSERT_QUERY);

		Db oracleDB = TipoDb.ORACLE.createDatabase();
		oracleDB.query(SELECT_QUERY);
		oracleDB.update(INSERT_QUERY);

		Db postgresDb = TipoDb.POSTGRES.createDatabase();
		postgresDb.query(SELECT_QUERY);
		postgresDb.update(INSERT_QUERY);
	}
}
