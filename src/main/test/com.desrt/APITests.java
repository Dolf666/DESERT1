package com.desrt;

import com.desrt.api.InfoService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

import static junit.framework.Assert.assertNotNull;

public class APITests {
    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void qugenerateQueryTest() {

    }

    @Test
    public void testGetEmployeesById() {
        InfoService infoService = new InfoService();
       Response r= infoService.getEmployees();
        assertNotNull(r);
    }

    @Test
    public void testGetEmpoyeesResponseHeaderIsGet() {
        InfoService infoService = new InfoService();
        Response response= infoService.getEmployees();
        response.getMetadata();
        System.out.println(response.getMetadata());
        /*assertNotNull(s);
        System.out.println(s);
        assertEquals(200,s);*/
    }
}
