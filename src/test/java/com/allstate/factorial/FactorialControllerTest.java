package com.allstate.factorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigInteger;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

/**
 * Created by localadmin on 2/2/17.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(FactorialController.class)
public class FactorialControllerTest {
    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFactorialController() throws Exception {
//        this.mvc.perform(get("/math/factorial/3"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.factorial", is(BigInteger.valueOf(6))));
    }

}