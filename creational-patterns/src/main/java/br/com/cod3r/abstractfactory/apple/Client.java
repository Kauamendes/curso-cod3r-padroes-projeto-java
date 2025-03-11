package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11;

public class Client {

	public static void main(String[] args) {
		CountryRulesAbstractFactory brazilianRulesFactory = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory usRulesFactory = new USRulesAbstractFactory();

		IPhoneFactory iPhoneXBrazilianFactory = new IPhoneXFactory(brazilianRulesFactory);
		IPhoneFactory iPhone11BrazilianFactory = new IPhone11Factory(brazilianRulesFactory);

		System.out.println("### Ordering an iPhone X Brazilian standard");
		System.out.println(iPhoneXBrazilianFactory.orderIPhone("standard"));

		System.out.println("### Ordering an iPhone 11 Brazilian highEnd");
		System.out.println(iPhone11BrazilianFactory.orderIPhone("highEnd"));

		IPhoneFactory iPhoneXUSFactory = new IPhoneXFactory(usRulesFactory);
		IPhoneFactory iPhone11USFactory = new IPhone11Factory(usRulesFactory);

		System.out.println("### Ordering an iPhone X US standard");
		System.out.println(iPhoneXUSFactory.orderIPhone("standard"));

		System.out.println("### Ordering an iPhone 11 US highEnd");
		System.out.println(iPhone11USFactory.orderIPhone("highEnd"));
	}
}
