package Model;

import java.util.*;
import DAO.Donatario.DAO;
import java.sql.SQLException;

public class Donatario extends Pessoa {

    //Atributos
    private double ValorRecebido;
    private int saldoDisponivel;

    public Donatario() {
        this.dao = new DonatarioDao();
    }

    public Donatario(double valorRecebido, int saldoDisponivel) {
        ValorRecebido = valorRecebido;
        this.saldoDisponivel = saldoDisponivel;
    }

    // Método Construtor usando também o construtor da SUPERCLASSE
    public Donatario(double ValorRecebido, int saldoDisponivel, int rg, String nome, int telefone, int cpf, String email) {
        super(rg, nome, telefone, cpf, email);
        this.ValorRecebido = valorRecebido;
        this.saldoDisponivel = saldoDisponivel;
        this.dao = new DonatarioDAO();

    }

    public double getValorRecebido() {
        return ValorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        ValorRecebido = valorRecebido;
    }

    public int getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(int saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }
}