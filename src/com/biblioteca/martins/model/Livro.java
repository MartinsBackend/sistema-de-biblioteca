package com.biblioteca.martins.model;

public class Livro {
    private static int proximoId = 0;
    private final int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao) {
        proximoId++;
        this.id = proximoId;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String consultarInformacoes() {
        return "Id: " + id + "\n"
                + "Título: " + titulo + "\n"
                + "Autor: " + autor + "\n"
                + "Ano da Publicação: " + anoPublicacao + "\n"
                + "Disponibilidade: " + disponivel;
    }

    public boolean verificarDisponibilidade() {
        return disponivel;
    }

    public boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        disponivel = true;
        return true;
    }
}
