package br.com.cod3r.command.migration;

import br.com.cod3r.command.migration.commands.ProductTable;
import br.com.cod3r.command.migration.commands.UserTable;
import br.com.cod3r.command.migration.commands.UserTableRoleColumn;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Client {

	public static void main(String[] args) {
		Map<String, List<String>> database = new LinkedHashMap<>();
		MigrationTool migrationTool = new MigrationTool();

		migrationTool.addMigration(new UserTable(database));
		migrationTool.addMigration(new ProductTable(database));
		migrationTool.addMigration(new UserTableRoleColumn(database));

		System.out.println(database);

		migrationTool.up();
		System.out.println(database);

		migrationTool.up();
		System.out.println(database);

		migrationTool.up();
		System.out.println(database);

		migrationTool.up();
		System.out.println(database);

		migrationTool.down();
		System.out.println(database);

		migrationTool.down();
		System.out.println(database);

		migrationTool.down();
		System.out.println(database);

		migrationTool.down();
		System.out.println(database);

		migrationTool.latest();
		System.out.println(database);

		migrationTool.roolback();
		System.out.println(database);
	}
}
