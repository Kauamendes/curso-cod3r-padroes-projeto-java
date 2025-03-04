package br.com.cod3r.factory.app.dbadapter.db;

public class OracleDB extends Db {

	@Override
	public void query(String sql) {
		System.out.println("Querying " + sql + " in Oracle database");
	}

	@Override
	public void update(String sql) {
		System.out.println("Uptade querry " + sql + " in Oracle database");
	}
}
