package Model;

import java.util.*;
import DAO.Doador.DAO;
import java.sql.SQLException;

public class Doador extends Pessoa {Vai toma no cu ezequiel

    // Atributos
    private double valordoado;
    private String recibos;
    private final DoadorDAO dao;
    //noooooooooooooooojo
    //nojooooooooo 2.0

    public Doador() {
        this.dao = new DoadorDAO(); // inicializado não importa em qual construtor
    }

    // Método Construtor de Objeto, inserindo dados
    public Doador(double valordoado, String recibos) {
        this.valordoado = valordoado;
        this.recibos = recibos;
        this.dao = new DoadorDAO(); // inicializado não importa em qual construtor
    }

    // Método Construtor usando também o construtor da SUPERCLASSE
    public Doador(double valordoado, String recibos, int rg, String nome, int telefone, int cpf, String email) {
        super(rg, nome, telefone, cpf, email);
        this.valordoado = valordoado;
        this.recibos = recibos;
        this.dao = new DoadorDAO(); // inicializado não importa em qual construtor
    }

    public double getValordoado() {
        return valordoado;
    }

    public void setValordoado(double valordoado) {
        this.valordoado = valordoado;
    }

    public String getRecibos() {
        return recibos;
    }

    public void setRecibos(String recibos) {
        this.recibos = recibos;
    }

    public DoadorDAO getDao() {
        return dao;
    }

    /*

            ABAIXO OS MÉTODOS PARA USO JUNTO COM O DAO

         */
    // Retorna a Lista de Alunos(objetos)
    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    // Cadastra novo aluno
    public boolean InsertDoadorBD(Doador objeto) {
        dao.InsertDoadorBD(objeto);
        return true;
    }

    // Deleta um aluno específico pelo seu campo ID
    public boolean DeleteDoadorBD(int cpf) {
        dao.DeleteDoadorBD(cpf);
        return true;
    }

    // Edita um aluno específico pelo seu campo ID
    public boolean UpdateDoadorBD(Doador objeto) {
        dao.UpdateDoadorBD(objeto);
        return true;
    }

    // carrega dados de um aluno específico pelo seu ID
    public Doador carregaDoador(int cpf) {
        dao.carregaDoador(cpf);
        return null;
    }
}