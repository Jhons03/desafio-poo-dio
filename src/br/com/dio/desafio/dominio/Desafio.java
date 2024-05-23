package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Desafio extends Conteudo{
    private String nome;
    private String linguagem;
    private String dificuldade;

    public Desafio() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 40d;
    }

    @Override
    public String toString() {
        return "Desafio{" +
                "nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", dificuldade='" + dificuldade + '\'' +
                '}';
    }
}
