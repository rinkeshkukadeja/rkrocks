package Callbacks;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class Beanpostprocessor implements BeanPostProcessor , BeanFactoryPostProcessor{
	
	public Object postProcessBeforeInitialization(Object bean, String beanname)
	{
		System.out.println("bean started ...."+beanname);
		return bean;	
	}

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		System.out.println("hehehe bean factory....");
	}

}
