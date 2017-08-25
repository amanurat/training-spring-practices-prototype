package com.training.annotation;

//TODO mark bean component
public class EmployeeBean {

    private String firstName;
    private String lastName;

    //TODO injection with setter
    private AddressBean addressBean;

    private CompanyBean companyBean;

    //TODO injection with constructor
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
