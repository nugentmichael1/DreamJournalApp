package com.revature.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Entity //Denotes this class (entity) as having DB representation
@Table(name = "dreams") // Allows us to set additional information about the Table.
@NoArgsConstructor  //Empty constructor (does not set any values)
@AllArgsConstructor //Full constructor (sets all values) (requires all properties)
@ToString
@EqualsAndHashCode
public class Dream {
    //Timestamp
    @Id //makes this a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "d_id", updatable = false)
    private LocalDateTime timeStamp;
    List<String> themes; // Notable subjects
    List<Integer> archetypes; // Identified Archetypes (Maybe AI assists with this)
    String description; //Dream journal entry.  Meat of item.  Possibly multiple pages long.
    String imageURL;
    String interpretationAI;  //AI will make this based on Jungian archetypes and theories.
    String interpretationUser; //User can provide their own interpretation
}
