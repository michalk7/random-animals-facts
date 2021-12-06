package com.michalk7.random_animals_facts.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Fact {
    private Status status;
    private String _id;
    private String user;
    private String text;
    private String type;
    private boolean deleted;
    private Date createdAt;
    private Date updatedAt;
    private int __v;
    private String source;
    private boolean used;
}
