package com.webperside.webmallappv2.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class CustomUserDetails extends User {

    private Integer id;
    private String fullName;
    private String gender;
    private Integer companyId;
    private String companyName;

    public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities, Integer id, String fullName, String gender, Integer companyId, String companyName) {
        super(username, password, authorities);
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.companyId = companyId;
        this.companyName = companyName;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }
}
