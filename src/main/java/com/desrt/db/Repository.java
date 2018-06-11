package com.desrt.db;

import com.desrt.model.Employee;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Repository {

    static SessionFactory factory;

    static {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        factory = configuration.buildSessionFactory(serviceRegistry);
    }


    public List<Employee> getEmployees() {

        Session session = factory.openSession();
        List<Employee> entities;
        System.out.println("tada");
        try {

            SQLQuery q = session.createSQLQuery("select * from resource_data");
            q.addEntity(Employee.class);
            entities = q.list();
            return entities;
        } finally {
            session.close();
        }
    }

    public List<Employee> getEmployeesByPID(int id) {

        Session session = factory.openSession();
        List<Employee> entities;
        try {

            String queryString = "select * from resource_data where pid=:id";
            SQLQuery q = session.createSQLQuery(queryString);
            q.setInteger("id", id);
            q.addEntity(Employee.class);
            entities = q.list();

            System.out.println(entities.toString());
            return entities;
        } finally {
            session.close();
        }
    }



    public   List<Employee> getEmployeeNames() {
        Session session = factory.openSession();

        List<Employee> entities = new ArrayList<>();
        List<Object []> unitos=new ArrayList<>();
        List<Employee> unitos1 = new ArrayList<>();
        String ids = "";
        try {


            Criteria cr=session.createCriteria(Employee.class)
                    .setProjection(Projections.projectionList()
                  .add(Projections.property("firstName"))
                  .add(Projections.property("surname"))
                   .add(Projections.property("PID")));
            List<Object []> list=cr.list();



            for(Object [] e:list){
                System.out.println(e[0]+" "+e[1]+" "+e[2]);
                System.out.println(e);
                System.out.println(e.toString());
                entities.add(new Employee(e[0].toString(),e[1].toString(),e[2].toString()));

            }
            System.out.println(list);

           return entities;//unitos;

        } finally {
            session.close();
        }
    }

    public   List<Employee> getEmployeeNamesBy10(int ofs,int lmt) {
        Session session = factory.openSession();

        List<Employee> entities = new ArrayList<>();
        List<Object []> unitos=new ArrayList<>();
        List<Employee> unitos1 = new ArrayList<>();
        String ids = "";
        try {

            Criteria cr=session.createCriteria(Employee.class)
                    .setFirstResult(ofs) // Index of first row to be retrieved.
                    .setMaxResults(lmt)
                    .setProjection(Projections.projectionList()
                            .add(Projections.property("firstName"))
                            .add(Projections.property("surname"))
                            .add(Projections.property("resourceRole"))
                            .add(Projections.property("PID"))
                            .add(Projections.property("location"))
                            .add(Projections.property("resourceAllocation"))
                            .add(Projections.property("openForTimeEntry"))
                            .add(Projections.property("dateOfHire")));
            List<Object []> list=cr.list();

            for(Object [] e:list){
                System.out.println(returnDateValue("2014-04-18 00:00:00.0")+"========================================");
                System.out.println(e[0]+" "+e[1]+" "+e[2]+" "+e[3]+" "+e[4]+" "+e[5]+" "+e[6]+" "+e[7]);//+returnNotNullValuesForConstructor(e[5]+""));
                entities.add(new Employee(returnNotNullValuesForConstructor(e[0]),returnNotNullValuesForConstructor(e[1]),returnNotNullValuesForConstructor(e[2]),returnNotNullValuesForConstructor(e[3]),returnNotNullValuesForConstructor(e[4]),returnNotNullValuesForConstructor(e[5]),returnNotNullValuesForConstructor(e[6]),new Date()));//e[4].toString(),e[5].toString(),e[6].toString()));

            }

            return entities;//unitos;

        } finally {
            session.close();
        }

}

    private String returnNotNullValuesForConstructor(Object s) {
        String result=" ";
            if(s==null){

            return result;
        }
        else{
            result=s.toString();

        }
        return result;
    }

    public Date returnDateValue(String dateString){
        DateFormat formatter;
        Date date=new Date();
        formatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss.S");
        try {
            date = formatter.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


}


