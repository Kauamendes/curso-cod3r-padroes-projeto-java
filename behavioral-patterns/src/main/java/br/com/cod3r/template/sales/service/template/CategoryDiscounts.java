package br.com.cod3r.template.sales.service.template;

import br.com.cod3r.template.sales.model.Cart;
import br.com.cod3r.template.sales.model.Category;

import java.util.EnumMap;
import java.util.Map;

public class CategoryDiscounts extends BestOfferTemplate {

    private Map<Category, Double> discountsByCategory;

    public CategoryDiscounts(Cart cart) {
        super(cart);
        loadDiscounts();
    }

    public void loadDiscounts() {
        discountsByCategory = new EnumMap<>(Map.of(Category.ELETRONICS, 0.3, Category.CLOTHES, 0.05));
    }

    @Override
    public boolean isAppliable() {
        return true;
    }

    @Override
    protected void calibrateVariables() {
        regularItemsPrice = cart.getItems().stream()
                .reduce(0d, (acc, item) ->
                                acc + (item.getValue() *
                                        (discountsByCategory.get(item.getCategory()) != null ?
                                                1 - discountsByCategory.get(item.getCategory()) : 1d))
                        , Double::sum);
    }
}
