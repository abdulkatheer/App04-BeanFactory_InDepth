package test;

import beans.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("resources/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        Student obj1 = (Student) factory.getBean("std");

        //even if id attribute not available, a dummy setter method is created in Bean class.
        Student obj2 = (Student) factory.getBean("std");

        System.out.println(obj1 == obj2); //true, hence Singleton class
    }
}
