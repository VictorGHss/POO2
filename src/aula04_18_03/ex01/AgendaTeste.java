package aula04_18_03.ex01;

public class AgendaTeste {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(null);
        agenda.adicionarContatos("Juninho", "Mete Bala", "4199873216", "Av. Mariano Procopio", "11/09");
        agenda.exibirTodosContatos();
    }
    
}
