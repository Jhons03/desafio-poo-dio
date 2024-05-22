import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentor1 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo poo");
        curso1.setCargaHoraria(7);
        mentor1.setTitulo("Mentoria Java");
        mentor1.setDescricao("Aprendendo java");
        mentor1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentor1);
    }
}