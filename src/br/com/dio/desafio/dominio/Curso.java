package br.com.dio.desafio.dominio;

public class Curso {
    private String tiulo;
    private String descricao;
    private int cargaHoraria;

    public Curso() {

    }

    public String getTiulo() {
        return tiulo;
    }

    public void setTiulo(String tiulo) {
        this.tiulo = tiulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tiulo='" + tiulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
