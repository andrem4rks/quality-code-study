package designpatterns.dto.domain;

import designpatterns.builder.domain.Person;
import designpatterns.factory.domain.Currency;
import designpatterns.singleton.singletoneager.domain.Aircraft;

public class ReportDTO {
    private Person person;
    private Currency currency;
    private Aircraft aircraft;

    private ReportDTO(Person person, Currency currency, Aircraft aircraft) {
        this.person = person;
        this.currency = currency;
        this.aircraft = aircraft;
    }

    public static final class ReportDTOBuilder {
        private Person person;
        private Currency currency;
        private Aircraft aircraft;

        public static ReportDTOBuilder builder() {
            return new ReportDTOBuilder();
        }

        public ReportDTOBuilder person(Person person) {
            this.person = person;
            return this;
        }

        public ReportDTOBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDTOBuilder aircraft(Aircraft aircraft) {
            this.aircraft = aircraft;
            return this;
        }

        public ReportDTO build() {
            return new ReportDTO(person, currency, aircraft);
        }
    }

    @Override
    public String toString() {
        return "ReportDTO: \n" +
                "person = " + person + "\n" +
                "currency = " + currency + "\n" +
                "aircraft = " + aircraft;
    }
}
