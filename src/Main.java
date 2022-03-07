import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setDescricao("descrição curso Ruby");
        curso1.setCargaHoraria(10);
        curso1.setTitulo("Curso Ruby");

        Curso curso2 = new Curso();
        curso2.setDescricao("descrição curso C");
        curso2.setCargaHoraria(10);
        curso2.setTitulo("Curso C");


        Mentoria mentoria = new Mentoria();


        mentoria.setDescricao("Descrição Mentoria");
        mentoria.setTitulo("Mentoria");
        mentoria.setData(LocalDate.now());
        //System.out.println(conteudo);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT Quality Assurance");
        bootcamp.setDescricao("Descrição Quality Assurance");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Felipe" + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Felipe" + devFelipe.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Felipe" + devFelipe.getConteudosConcluidos());
        System.out.println("XP: "+ devFelipe.calcularTotalXP());
        System.out.println("--------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXP());
    }
}
