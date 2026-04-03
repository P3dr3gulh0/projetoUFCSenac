package atividade5;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar() {
        System.out.println("Senhoras e senhores, está na hora!\n Apresentamos diretamente de "
                + getNacionalidade() + " com " + getIdade() + " anos de idade, medindo "
                + getAltura() + "m de altura e pesando " + getPeso()
                + "kg!\n Competindo na categoria " + getCategoria() + ", com um cartel de "
                + getVitorias() + " vitórias, " + "\n Apresentamos... " + getNome() + "!");

    }

    public void status() {
        System.out.println("Quantidade de vitorias: " + getVitorias());
        System.out.println("Quantidade de derrotas: " + getDerrotas());
        System.out.println("Quantidade de empates: " + getEmpates());
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 52) {
            setCategoria("Invalida!");
        } else if (peso > 52 && peso <= 70) {
            setCategoria("Leve!");
        } else if (peso > 70 && peso <= 83) {
            setCategoria("Médio!"); 
        } else if (peso > 83 && peso <= 110) {
            setCategoria("Pesado!");
        } else {
            setCategoria("Invalida!");
        }
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
