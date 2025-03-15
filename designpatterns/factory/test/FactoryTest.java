package designpatterns.factory.test;

import designpatterns.factory.domain.Currency;
import designpatterns.factory.domain.CurrencyFactory;
import designpatterns.factory.domain.ECountry;

public class FactoryTest {
    public static void main(String[] args) {

        final Currency currencyBR = CurrencyFactory.newCurrency(ECountry.BRAZIL);
        System.out.println(currencyBR.getSymbol());

        final Currency currencyUS = CurrencyFactory.newCurrency(ECountry.EUA);
        System.out.println(currencyUS.getSymbol());

    }
}