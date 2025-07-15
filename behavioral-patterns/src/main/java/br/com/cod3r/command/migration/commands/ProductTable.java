package br.com.cod3r.command.migration.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductTable extends MigrationCommand {

    private static final String TABLE_NAME = "Product";
    private static final List<String> TABLE_COLUMNS = new ArrayList<>(List.of("Id", "Description", "Price"));

    public ProductTable(Map<String, List<String>> database) {
        super(database);
    }

    @Override
    public void execute() {
        database.put(TABLE_NAME, TABLE_COLUMNS);
    }

    @Override
    public void undo() {
        database.remove(TABLE_NAME);
    }
}
