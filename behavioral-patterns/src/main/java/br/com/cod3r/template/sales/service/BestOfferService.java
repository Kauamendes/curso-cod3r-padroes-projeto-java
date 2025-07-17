package br.com.cod3r.template.sales.service;

import br.com.cod3r.template.sales.model.Cart;
import br.com.cod3r.template.sales.service.template.*;

import java.util.ArrayList;
import java.util.List;

public class BestOfferService {

	private List<BestOfferTemplate> templates;

	private void loadTemplates(Cart cart) {
		templates = new ArrayList<>();
		templates.add(new RegularPrice(cart));
		templates.add(new FreeDelivery(cart));
		templates.add(new BigCartDiscounts(cart));
		templates.add(new SpecialClient(cart));
		templates.add(new CategoryDiscounts(cart));
		templates.add(new BlackFriday(cart));
	}


	public void calculateBestOffer(Cart cart) {
		loadTemplates(cart);
		double bestOffer = Double.MAX_VALUE;
		for (BestOfferTemplate template : templates) {
			if (template.isAppliable()) {
				Double currentPrice = template.calculateOffer(cart);
				System.out.printf("%s: %.2f%n", template.getClass().getSimpleName(), currentPrice);
				bestOffer = (bestOffer > currentPrice) ? currentPrice : bestOffer;
			}
		}
		System.out.printf("Final Price: %.2f%n", bestOffer);
	}
}