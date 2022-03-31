package com.example.Recogency.model;

import org.apache.tomcat.jni.Local;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String origem;

    @Column(nullable = false)
    private String destino;

    @Column(nullable = false, name = "data_saida")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date saida;

    @Column(nullable = false, name = "data_retorno")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date retorno;

    @Column(nullable = false)
    private double preco;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String origem, String destino, Date saida, Date retorno, double preco) {
        this.id = id;
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
        this.saida = saida;
        this.retorno = retorno;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public Date getRetorno() {
        return retorno;
    }

    public void setRetorno(Date retorno) {
        this.retorno = retorno;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Double.compare(cliente.preco, preco) == 0 && Objects.equals(id, cliente.id) && Objects.equals(nome, cliente.nome) && Objects.equals(origem, cliente.origem) && Objects.equals(destino, cliente.destino) && Objects.equals(saida, cliente.saida) && Objects.equals(retorno, cliente.retorno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, origem, destino, saida, retorno, preco);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", saida=" + saida +
                ", retorno=" + retorno +
                ", preco=" + preco +
                '}';
    }
}


