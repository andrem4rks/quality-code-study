package designpatterns.factory.domain;

public class CurrencyFactory {

    public static Currency newCurrency(ECountry country) {
        switch (country) {
            case BRAZIL:
                return new Real();
            case EUA:
                return new Dollar();
            default:
                throw new IllegalArgumentException("County not supported!");
        }
    }

}