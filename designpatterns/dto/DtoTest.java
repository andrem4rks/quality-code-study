package designpatterns.dto;

import designpatterns.builder.domain.Person;
import designpatterns.dto.domain.ReportDTO;
import designpatterns.factory.domain.Currency;
import designpatterns.factory.domain.CurrencyFactory;
import designpatterns.factory.domain.ECountry;
import designpatterns.singleton.singletoneager.domain.Aircraft;

public class DtoTest {
    public static void main(String[] args) {
        Person person = buildPerson();
        Currency currency = buildCurrency();
        Aircraft aircraft = buildAircraft();

        ReportDTO report = ReportDTO.ReportDTOBuilder.builder()
                .person(person)
                .currency(currency)
                .aircraft(aircraft)
                .build();

        System.out.println(report);
    }

    private static Person buildPerson() {
        return Person.PersonBuilder.builder()
                .email("email@email.com")
                .name("name")
                .username("username")
                .build();
    }

    private static Currency buildCurrency() {
        return CurrencyFactory.newCurrency(ECountry.BRAZIL);
    }

    private static Aircraft buildAircraft() {
        return new Aircraft("777");
    }
}
