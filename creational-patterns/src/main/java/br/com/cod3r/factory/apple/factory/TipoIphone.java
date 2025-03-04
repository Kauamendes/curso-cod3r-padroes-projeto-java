package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.*;

public enum TipoIphone {

    IPHONE_ONZE(IPhone11.class),
    IPHONE_ONZE_PRO(IPhone11Pro.class),
    IPHONE_X(IPhoneX.class),
    IPHONE_XS_MAX(IPhoneXSMax.class);

    private final Class<? extends IPhone> iPhoneClass;

    TipoIphone(Class<? extends IPhone> iPhoneClass) {
        this.iPhoneClass = iPhoneClass;
    }

    public IPhone getIphone() {
        try {
            return iPhoneClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar instância de Iphone: " + iPhoneClass.getSimpleName(), e);
        }
    }
}
