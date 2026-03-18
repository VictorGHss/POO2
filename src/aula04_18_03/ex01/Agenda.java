package aula04_18_03.ex01;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda(ArrayList<Contato> contatos) {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContatos(String nome, String sobrenome, String numTel, String endereco, String dataAniv) {
        for (Contato contatos : contatos) {
            if (contatos.getNumTel().equals(numTel)) {
                System.out.println("Este número já está salvo na agenda.");
                return;
            }
            this.contatos.add(contatos);
            System.out.println("Contato " + nome + " " + sobrenome + " adicionado a agenda");
        }
    }

    public void excluirContatos(String numTel, String nome){
        for(Contato contatos : contatos){
            if(contatos.getNumTel().equals(numTel) && contatos.getNome().equals(nome)){
                System.out.println("Contato: " + numTel + " excluido da agenda");
                this.contatos.remove(contatos);
            }
            System.out.println("O número : " + numTel + " não foi encontrado na agenda");
            return;
        }
    }

    public void exibirTodosContatos(){
        for(Contato contatos : contatos){
            System.out.println("Telefone: " + contatos.getNumTel());
            System.out.println("Nome Completo: " + contatos.getNome() + " " + contatos.getSobrenome());
            System.out.println("Endereço: " + contatos.getEndereco());
            System.out.println("Data de aniversário: " + contatos.getDataAniversario());
        }

    }
}