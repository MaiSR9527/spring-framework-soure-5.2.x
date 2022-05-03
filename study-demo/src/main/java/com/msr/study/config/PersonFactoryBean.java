package com.msr.study.config;

import com.msr.study.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2022-05-03 16:58
 **/
public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setDescription("create from PersonFactoryBean");
        person.setAge(16);
        person.setName("Mai");
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
