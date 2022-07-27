package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor doctor = context.getBean(Doctor.class);
        //Nurse nurse = context.getBean(Nurse.class);

        //Method two that data can be extracted is through casting

        //Nurse nurse = (Nurse) context.getBean("nurse");
        //nurse.assist();
        //doctor.assist();

        //Calling the classes though Interfaces
        Staff staff = context.getBean(Nurse.class);
        staff.assist();

        //Calling the Doctor Class through the Interface
        Staff doc = context.getBean(Doctor.class);
        doc.assist();



    }
}
