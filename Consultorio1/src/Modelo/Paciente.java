package Modelo;

public class Paciente {
    
    private Integer id;
    private String nome;
    private Integer peso;
    private Integer altura;
    
    public Paciente(){}
    
    public Paciente (String nome, Integer peso, Integer altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    
    
}
