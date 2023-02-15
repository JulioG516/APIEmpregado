package dev.achilles.achillesstudy.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
// @Table(name = "empregados")
public class Empregado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nome;
    private String cpf;
    private Double salario;
    private Integer perfomance;
    private String[] beneficios;
    private String posicao;




    public String[] getBeneficios() {
        return beneficios;
    }
    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Integer getPerfomance() {
        return perfomance;
    }
    public void setPerfomance(Integer perfomance) {
        this.perfomance = perfomance;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    

}
