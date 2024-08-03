package com.revature.Models;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userid")
    int u_id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;


   /* @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="fk_userid")
    @JsonManagedReference
    private List<Dream> dreams;*/


    public void setU_id(int u_id) {
        this.u_id = u_id;
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
}