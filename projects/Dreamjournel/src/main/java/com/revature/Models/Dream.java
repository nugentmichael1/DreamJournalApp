package com.revature.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;




@Entity //Denotes this class (entity) as having DB representation
@Table(name = "dreams") // Allows us to set additional information about the Table.
@NoArgsConstructor  //Empty constructor (does not set any values)
@AllArgsConstructor //Full constructor (sets all values) (requires all properties)
@Data
public class Dream {
    List<String> themes; // Notable subjects
    List<Integer> archetypes; // Identified Archetypes (Maybe AI assists with this)
    String description; //Dream journal entry.  Meat of item.  Possibly multiple pages long.
    int imageName;
    @Column(name = "interpretation_ai")
    String interpretationAI;  //AI will make this based on Jungian archetypes and theories.
    @Column(name = "interpretation_user")
    String interpretationUser; //User can provide their own interpretation
    //Timestamp
    @Id //makes this a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int id;
    @Column(name = "time_stamp", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime timeStamp = LocalDateTime.now();
    @Column
    private int fk_userid;
   /* @ManyToOne(fetch=FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "fk_userid")
    private User user;*/
}

