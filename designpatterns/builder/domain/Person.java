package designpatterns.builder.domain;

public class Person {
    private String name;
    private String email;
    private String username;

    private Person(String name, String email, String username) {
        this.name = name;
        this.email = email;
        this.username = username;
    }

    public static final class PersonBuilder {
        private String name;
        private String email;
        private String username;

        private PersonBuilder() {}

        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder username(String username) {
            this.username = username;
            return this;
        }

        public Person build() {
            return new Person(name, email, username);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
