package com.test_project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class MockitoTest2ApplicationTests {

	@InjectMocks
	StdService ss;
	@Mock
	StdDao sd;

	@Before
	  public void init() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void getObj(){
	List<Student> ls=new ArrayList<>();
	Student s1=new Student("Hari","male", 16, 11);
	Student s2=new Student("Vijay","male", 17, 12);
	Student s3=new Student("Rangesh","male", 15, 10);
	Student s4=new Student("Kamal","male", 16, 11);
	
	ls.add(s1); ls.add(s2); ls.add(s3); ls.add(s4);
	
	List<Student> ln=new ArrayList<>();
	Student s5=new Student("Hari","male", 16, 11);
	Student s6=new Student("Vijay","male", 17, 12);
	Student s7=new Student("Rangesh","male", 15, 10);
	Student s8=new Student("Kamal","male", 16, 11);
	
	ln.add(s5); ln.add(s6); ln.add(s7); ln.add(s8);
	
	when(sd.getObj()).thenReturn(ls);
	
	assertNotNull(ls);
	
	for(int i=0;i<ls.size();i++) {
		for(int j=0;j<ln.size();j++) {
        assertEquals(ls.get(i).getGender(),"male");
	}}
	
	}
	
	
		
		
		
	


}
