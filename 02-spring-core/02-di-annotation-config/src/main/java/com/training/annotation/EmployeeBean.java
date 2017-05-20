package com.training.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by amanurat on 3/15/2016 AD.
 */

@Component
public class EmployeeBean {

    private String firstName;

    private String lastName;

    @Autowired
    private AddressBean addressBean;


    private CompanyBean companyBean;

    @Autowired
    public EmployeeBean(CompanyBean companyBean) {
        this.companyBean = companyBean;
    }

    public AddressBean getAddressBean() {
        return addressBean;
    }

    public void setAddressBean(AddressBean addressBean) {
        this.addressBean = addressBean;
    }

    public CompanyBean getCompanyBean() {
        return companyBean;
    }

    public void setCompanyBean(CompanyBean companyBean) {
        this.companyBean = companyBean;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
