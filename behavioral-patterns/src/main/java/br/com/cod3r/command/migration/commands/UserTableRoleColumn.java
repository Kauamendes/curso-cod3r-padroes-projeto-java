package br.com.cod3r.command.migration.commands;

import java.util.List;
import java.util.Map;

public class UserTableRoleColumn extends MigrationCommand {

    private static final String TABLE_NAME = "User";
    private static final String ROLE_COLUMN = "Role";

    public UserTableRoleColumn(Map<String, List<String>> database) {
        super(database);
    }

    @Override
    public void execute() {
        database.get(TABLE_NAME).add(ROLE_COLUMN);
    }

    @Override
    public void undo() {
        database.get(TABLE_NAME).remove(ROLE_COLUMN);
    }
}
