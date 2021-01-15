package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {

        //Создаем спринг-контейнер из которого будет создаваться наш бин
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
