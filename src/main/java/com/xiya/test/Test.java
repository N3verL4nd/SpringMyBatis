package com.xiya.test;

import com.xiya.dao.PersonMapper;
import com.xiya.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by N3verL4nd on 2017/5/13.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


        PersonMapper personMapper = ctx.getBean(PersonMapper.class);
        List<Person> persons = personMapper.getAllPersons();
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
