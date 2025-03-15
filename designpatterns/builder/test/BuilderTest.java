package designpatterns.builder.test;

import designpatterns.builder.domain.Person;

public class BuilderTest {


    public static void main(String[] args) {

//        Create a person without designpatterns.builder pattern
//        final Person person = new Person("André Marks", "andre.marks@email.com", "gabiru3d");
//        System.out.println(person);

//        Create a person with designpatterns.builder pattern
       final Person person1 = Person.PersonBuilder.builder()
               .name("André Marks")
               .email("andre.marks@email.com")
               .username("gabiru3d")
               .build();


        System.out.println(person1);
    }

}
