package builder;

public class BuilderTest {


    public static void main(String[] args) {

//        Create a person without builder pattern
//        final Person person = new Person("André Marks", "andre.marks@email.com", "gabiru3d");
//        System.out.println(person);

//        Create a person with builder pattern
       final Person person1 = new Person.PersonBuilder()
               .name("André Marks")
               .email("andre.marks@email.com")
               .username("gabiru3d")
               .build();
        System.out.println(person1);
    }

}
