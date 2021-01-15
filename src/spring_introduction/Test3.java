package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Pet pet = context.getBean("myPet", Pet.class);
//        Pet pet = new Dog();
        //Вместо ручного создания объектов мы используем DI с помощью конструктора, то есть в файле "applicationContext.xml"
        //мы написали <constructor-arg ref="myPet">
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
