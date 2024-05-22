import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentor1 = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprendendo poo");
        curso1.setCargaHoraria(7);
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Desenvolvendo js do zero");
        curso2.setCargaHoraria(4);

        mentor1.setTitulo("Mentoria Java");
        mentor1.setDescricao("Aprendendo java");
        mentor1.setData(LocalDate.now());

        //criando bootcamp
        Bootcamp bootcampSantander = new Bootcamp();
        bootcampSantander.setNome("Bootcamp Java Developer");
        bootcampSantander.setDescricao("Abstraindo um bootcamp usando poo em java");
        bootcampSantander.getConteudos().add(curso1);
        bootcampSantander.getConteudos().add(curso2);
        bootcampSantander.getConteudos().add(mentor1);

        Dev devEdson = new Dev();
        devEdson.setNome("Edson");
        devEdson.inscreverBootcamp(bootcampSantander);
        System.out.println("Os conteudos de " + devEdson.getNome() + " é: " + devEdson.getConteudosInscritos());
        devEdson.progredir();
        System.out.println("Os conteudos de " + devEdson.getNome() + " é: " + devEdson.getConteudosInscritos());
        System.out.println("O total de xp do Edson é " + devEdson.calcularTotalXp());




    }
}