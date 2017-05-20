package com.training.annotation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by amanurat on 3/15/2016 AD.
 */
@ContextConfiguration(locations = "classpath:spring-config.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeBeanTest {

    @Autowired
    private EmployeeBean employeeBean;


    @Test
    public void testLoadEmployee() throws Exception {
        Assert.assertNotNull(employeeBean);
    }


    @Test
    public void testLoadEmployeeWithAddressDependency() throws Exception {
        Assert.assertNotNull(employeeBean);
        Assert.assertNotNull(employeeBean.getAddressBean());
    }
    @Test
    public void testLoadEmployeeWithCompanyDependency() throws Exception {
        Assert.assertNotNull(employeeBean);
        Assert.assertNotNull(employeeBean.getCompanyBean());
        assertEquals("Google", employeeBean.getCompanyBean().getName());

    }
}