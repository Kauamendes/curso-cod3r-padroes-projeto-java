package br.com.cod3r.bridge.mvc;

import br.com.cod3r.bridge.mvc.dao.UserMongoDao;
import br.com.cod3r.bridge.mvc.dao.UserMysqlDao;
import br.com.cod3r.bridge.mvc.dao.UserOracleDao;
import br.com.cod3r.bridge.mvc.dao.UserPostgresDao;
import br.com.cod3r.bridge.mvc.model.User;
import br.com.cod3r.bridge.mvc.services.UserEJB;
import br.com.cod3r.bridge.mvc.services.UserRest;
import br.com.cod3r.bridge.mvc.services.UserService;
import br.com.cod3r.bridge.mvc.services.UserSoap;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");

		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);

		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userRestOracleService.save(user);

		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userRestOracleService.save(user);

		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestOracleService.save(user);
	}
}
