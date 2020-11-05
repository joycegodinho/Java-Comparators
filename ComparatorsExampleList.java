package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("---Ordem de inserção---");
        System.out.println(estudantes);
        //[Pedro-19, Carlos-23, Mariana-21, João-18, Thiago-20, George-22, Larissa-21]

        estudantes.sort((first,second) -> first.getIdade() - second.getIdade());
        System.out.println("---Ordem crescente de idade---");
        System.out.println(estudantes);
        //[João-18, Pedro-19, Thiago-20, Mariana-21, Larissa-21, George-22, Carlos-23]

        estudantes.sort((first,second) -> second.getIdade() - first.getIdade());
        System.out.println("---Ordem decrescente de idade---");
        System.out.println(estudantes);
        //[Carlos-23, George-22, Mariana-21, Larissa-21, Thiago-20, Pedro-19, João-18]

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("---Ordem crescente de idade (method reference)---");
        System.out.println(estudantes);
        //[João-18, Pedro-19, Thiago-20, Mariana-21, Larissa-21, George-22, Carlos-23]

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("---Ordem decrescente de idade (method reference)---");
        System.out.println(estudantes);
        //[Carlos-23, George-22, Mariana-21, Larissa-21, Thiago-20, Pedro-19, João-18]

        Collections.sort(estudantes);
        System.out.println("---Ordem crescente de idade (interface Comparable)---");
        System.out.println(estudantes);
        //[João-18, Pedro-19, Thiago-20, Mariana-21, Larissa-21, George-22, Carlos-23]

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println("---Ordem decrescente de idade (interface Comparator)---");
        System.out.println(estudantes);
        //[Carlos-23, George-22, Mariana-21, Larissa-21, Thiago-20, Pedro-19, João-18]


    }


}
