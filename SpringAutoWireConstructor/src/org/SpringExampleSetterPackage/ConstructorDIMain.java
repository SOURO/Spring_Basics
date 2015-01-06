package org.SpringExampleSetterPackage;  
  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.core.io.ClassPathResource; 
public class ConstructorDIMain {  
  
	public static void main(String[] args) {  
        ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");  
  
        country countryObj = (country) appContext.getBean("CountryBean");  
        String countryName=countryObj.getCountryName();  
        String capitalName=countryObj.getCapital().getCapitalName();  
        System.out.println(capitalName+" is capital of "+countryName);  
         
    }   
} 