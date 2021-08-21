package com.webperside.webmallappv2.entity;

import com.webperside.webmallappv2.enums.DataStatus;
import com.webperside.webmallappv2.enums.UserStatus;
import com.webperside.webmallappv2.enums.UserType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "username")
    private String username; // todo
    @Column(name = "password")
    private String password;
    @Column(name = "user_type")
    private UserType userType; // todo
    @Column(name = "user_status")
    private UserStatus userStatus;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "created_at")
    private Instant createdAt;
    @Column(name = "modified_by")
    private Integer modifiedBy;
    @Column(name = "modified_at")
    private Instant modifiedAt;
    @Column(name = "data_status")
    private DataStatus dataStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Instant getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Instant modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public DataStatus getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(DataStatus dataStatus) {
        this.dataStatus = dataStatus;
    }
}


// findById() user name, surname, age
// company
// controller (servlet) -> service  layer -> dao layer
// controller (servlet) -> business layer -> service layer -> dao layer