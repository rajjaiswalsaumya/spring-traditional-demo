package org.cdac.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by grohit on 9/5/2015.
 */

@Entity
@Table(name = "users")
public class Users {

    @Id
    @SequenceGenerator(name = "my_gen", sequenceName = "my_seq")
    @GeneratedValue(generator = "my_gen")
    private Integer Id;
    @Column
    private String username;
    @Column
    private String password;
    @Temporal(TemporalType.DATE)
    @Column(name = "last_loggedin_on", nullable = false)
    private Date lastLoginDate = new Date();

    public Users() {
    }

    public Users(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
