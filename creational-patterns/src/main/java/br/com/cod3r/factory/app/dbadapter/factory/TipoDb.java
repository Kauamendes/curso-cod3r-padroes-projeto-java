package br.com.cod3r.factory.app.dbadapter.factory;

import br.com.cod3r.factory.app.dbadapter.db.Db;
import br.com.cod3r.factory.app.dbadapter.db.OracleDB;
import br.com.cod3r.factory.app.dbadapter.db.PostgresDB;

public enum TipoDb {

    ORACLE(OracleDB.class),
    POSTGRES(PostgresDB.class);

    private final Class<? extends Db> dbClass;

    TipoDb(Class<? extends Db> dbClass) {
        this.dbClass = dbClass;
    }

    public Db createDatabase() {
        try {
            return dbClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar instância do banco de dados: " + dbClass.getSimpleName(), e);
        }
    }
}