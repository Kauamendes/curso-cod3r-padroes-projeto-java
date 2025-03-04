package br.com.cod3r.factory.app.dbadapter.db;

public class Db implements DBOperations {

    public void query(String sql) {
        System.out.println("Querying " + sql + " in default database implementation");
    }

    public void update(String sql) {
        System.out.println("Uptade querry " + sql + " in default database implementation");
    }
}