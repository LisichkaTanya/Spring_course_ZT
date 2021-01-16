package spring_introduction;

import org.springframework.stereotype.Component;

@Component("catBean") //Если не указать в () id класса, то он создастся по-умолчанию из названия класса
                    // только первая буква будет прописной "cat"
                    //MyDog -> myDog; SQLClass -> SQLClass
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
