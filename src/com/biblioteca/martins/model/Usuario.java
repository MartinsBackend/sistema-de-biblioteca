package com.biblioteca.martins.model;

public class Usuario {
    private static int proxId=0;
    private final int id;
    private String nome;
    private  String gmail;

    public Usuario(String nome, String gmail) {
        proxId++;
        this.id = proxId;
        this.nome = nome;
        this.gmail = gmail;
    }
}
