package com.msr.study.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2022-05-03 17:28
 **/
public class PersonPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // 初始化之前的处理
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 初始化之后的处理
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
