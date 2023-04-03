package in.ashokit.test;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import in.ashokit.entity.Student;

public class XmlToJavaObject {

	public static void main(String[] args) {
		
		
        try {
        	
        	File file= new File("src\\main\\resources\\student.xml");
        	
        	 JAXBContext instance = JAXBContext.newInstance(Student.class);
        	
        	Unmarshaller createUnmarshaller = instance.createUnmarshaller();
        	
        	Student students =(Student) createUnmarshaller.unmarshal(file);
        	
        	System.out.println(students.getName());
        	
            
                  	
        	
        				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
