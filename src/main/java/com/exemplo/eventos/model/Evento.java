package com.exemplo.eventos.model;

/**
 * Classe de Model (Modelo) que representa um Evento.
 * Os atributos abaixo devem ter o MESMO NOME dos "name" usados
 * nos campos <input> do formulário HTML, pois é assim que o
 * Spring MVC consegue casar os dados enviados no formulário
 * com os atributos desse objeto (data binding).
 */
public class Evento {

    private String nome;
    private String data;
    private String local;
    private String descricao;

    public Evento() {
    }

    public Evento(String nome, String data, String local, String descricao) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                ", local='" + local + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
