package com.training.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by amanurat on 3/15/2016 AD.
 */
@Component
public class CompanyBean {

    @Value("${company.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
