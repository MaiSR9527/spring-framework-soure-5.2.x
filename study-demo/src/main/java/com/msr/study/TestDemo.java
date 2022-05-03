package com.msr.study;

import com.msr.study.bean.Person;
import com.msr.study.config.PersonFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2022-05-03 17:42
 **/
public class TestDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person bean = (Person) applicationContext.getBean("personFactoryBean");
        PersonFactoryBean personFactoryBean = (PersonFactoryBean) applicationContext.getBean("&personFactoryBean");
        System.out.println(bean);
        try {
            System.out.println(personFactoryBean.getObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
