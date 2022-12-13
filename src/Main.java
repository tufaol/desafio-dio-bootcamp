import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Java Básico");
        curso1.setCargaHoraria(16);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("JS Básico");
        curso2.setCargaHoraria(16);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        mentoria1.setTitulo("Mercado JAVA");
        mentoria1.setDescricao("Informações sobre como está o mercado JAVA em 2022");
        mentoria1.setData(LocalDate.now());

        mentoria2.setTitulo("Mercado JS");
        mentoria2.setDescricao("Informações sobre como está o mercado JS em 2022");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria1);
        System.out.println(mentoria2);

        Conteudo curso3 = new Curso();
        Conteudo mentoria3 = new Mentoria();
        curso3.setTitulo("GO");
        curso3.setDescricao("GO Básico");

        mentoria3.setTitulo("Mercado GO");
        mentoria3.setDescricao("Informações sobre como está o mercado GO em 2022");

        System.out.println(curso3);
        System.out.println(mentoria3);


    }
}