package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterinjectionTest {
	public static void main(String[]args){
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessageGenerator  generator=null;
		//locate SpringBeans cfgs file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC container(BEanFactory)
		factory=new XmlBeanFactory(res);
		//get Bean(main Bean)
		obj=factory.getBean("wish");
		//type Casting
		generator=(WishMessageGenerator)obj;
		//invoke Bussiness method
		System.out.println("message::"+generator.genereteWishMsg("raja"));
		
	}

}
