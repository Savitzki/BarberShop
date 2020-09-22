package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marina Savitzki
 */
public abstract class Person {
    
    protected int id;
    protected String nome;
    protected char sexo;
    protected String email;
    protected Date dtNascimento;
    protected String rg;
    protected String telefone;

    public Person(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
/**
 * 
 * @param id
 * @param nome
 * @param sexo
 * @param dtNascimento
 * @param rg
 * @param email
 * @param telefone 
 */
    public Person(int id, String nome, char sexo,  String dtNascimento, String rg, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        try {
            this.dtNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dtNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Scheduling.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.rg = rg;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}
