package com.silvionetto.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Bean {
    
    public Bean() {}
    
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
