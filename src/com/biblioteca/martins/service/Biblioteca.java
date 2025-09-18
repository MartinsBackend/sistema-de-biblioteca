package com.biblioteca.martins.service;

import com.biblioteca.martins.model.Livro;
import com.biblioteca.martins.model.Usuario;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public boolean adicionarLivro(Livro l) {
        if (l == null) {
            return false;
        }
        livros.add(l);
        return true;
    }

}
