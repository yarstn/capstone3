package com.example.capstone3ee.Model;

//package com.example.capstone3ee.Model;

// src/main/java/com/example/capstone3ee/Model/GroupInvitation.java

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class GroupInvitation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Groups group;

    @Column(columnDefinition = "varchar(20) not null ")
    private String status;


}