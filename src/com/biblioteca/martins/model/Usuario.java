package com.biblioteca.martins.model;

public class Usuario {
    private static int proxId = 0;
    private final int id;
    private String nome;
    private String gmail;

    public Usuario(String nome, String gmail) {
        proxId++;
        this.id = proxId;
        this.nome = nome;
        this.gmail = gmail;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String consultarInfoUsuario() {
        return "Id: " + id + "\n"
                + "Nome: " + nome + "\n"
                + "Gmail: " + gmail;
    }
}
