package br.com.guilhermeoli.domain;

/**
 * @author guiol
 */
public class Cliente {

    private String nome;

    private Long Cpf;

    private Long tel;

    private String end;

    private Integer numero;

    private String cidade;

    private String estado;

    public Long getCpf() {
        return Cpf;
    }

    public void setCpf(Long cpf) {
        Cpf = cpf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
