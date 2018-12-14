package com.kingyee.common.spring.mvc;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;

public class ControllerBeanNameGenerator implements BeanNameGenerator {
	@Override
	public String generateBeanName(BeanDefinition definition,
			BeanDefinitionRegistry registry) {
		return definition.getBeanClassName();
	}

}
