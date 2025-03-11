package br.com.cod3r.abstractfactory.apple.factory;

import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		switch (level) {
			case "standard": return new IPhone11(rules);
			case "highEnd": return new IPhone11Pro(rules);
			default: return null;
		}
	}
}