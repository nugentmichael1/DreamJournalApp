package com.revature.Models;
<<<<<<< HEAD
import jakarta.persistence.*;

@Entity
@Table(name = "users")
=======


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
>>>>>>> 9c73a5dc03eec89f760587bae0b9e144ea52aacf
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userid")
    int u_id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

<<<<<<< HEAD
=======
    @OneToMany(mappedBy = "user")
    private List<Dream> dreams;

>>>>>>> 9c73a5dc03eec89f760587bae0b9e144ea52aacf
    public User(int u_id, String username, String password) {
        this.u_id = u_id;
        this.username = username;
        this.password = password;
    }

<<<<<<< HEAD
    public int getU_id() {
        return u_id;
    }

=======
>>>>>>> 9c73a5dc03eec89f760587bae0b9e144ea52aacf
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