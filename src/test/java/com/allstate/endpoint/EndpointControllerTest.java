package com.allstate.endpoint;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

/**
 * Created by localadmin on 2/2/17.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(EndpointController.class)
public class EndpointControllerTest {
    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testEndPointController() throws Exception {
        String driverId = "abc";

        this.mvc.perform(get(String.format("/drivers/%s/trips", driverId)))
                .andExpect(status().isOk())
                .andExpect(content().string("you are looking for driver id: abc"));
    }

    @Test
    public void testIndexEndpoint() throws Exception {
        this.mvc.perform(get("/vehicles?year=1987&doors=2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.year", is(1987)))
                .andExpect(jsonPath("$.doors", is(2)));
    }

    @Test
    public void testIndexEndpoint2() throws Exception {
        this.mvc.perform(get("/vehicles?doors=2"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.doors", is(2)));
    }

}