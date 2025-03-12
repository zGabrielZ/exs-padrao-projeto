package br.com.gabrielferreira.funcionario.main;

import br.com.gabrielferreira.funcionario.profissao.CEO;
import br.com.gabrielferreira.funcionario.profissao.Funcionario;
import br.com.gabrielferreira.funcionario.profissao.Gerente;
import br.com.gabrielferreira.funcionario.profissao.impl.CEOImpl;
import br.com.gabrielferreira.funcionario.profissao.impl.FuncionarioImpl;
import br.com.gabrielferreira.funcionario.profissao.impl.GerenteImpl;

public class App {

    public static void main(String[] args) {
        Funcionario funcionario = new FuncionarioImpl();
        System.out.println(funcionario.salario());

        System.out.println("------------------");

        Gerente gerente = new GerenteImpl();
        System.out.println(gerente.salario());
        gerente.contratar();
        gerente.treinar();
        System.out.println(gerente.adicionarBonus());

        System.out.println("------------------");

        CEO ceo = new CEOImpl();
        System.out.println(ceo.salario());
        ceo.decisoes();
        ceo.adicionarLucro();
        System.out.println(ceo.adicionarBonus());

    }
}
