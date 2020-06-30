package com.example.codeclan.FileStructure.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="extension")
    private String extension;

    @Column(name="size")
    private int size;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name="folder_id")
    private Folder folder;

    public File(String name, String extension, int size, Folder folder){
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

}
