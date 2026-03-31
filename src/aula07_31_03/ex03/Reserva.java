package aula07_31_03.ex03;

public class Reserva {
    private Quarto quarto;
    private Hospede hospede;
    private int diasTotais;
    private double valorTotal;
    
    public void realizarReserva(Quarto q, Hospede h, int dias)
    throws QuartoIndisponivelException, HospedeNullException, PeriodoInvalidoException {
    
    if (!q.disponivel) {
    throw new QuartoIndisponivelException();
    }

    if (h.nome == null || h.nome.trim().isEmpty()) {
    throw new HospedeNullException();
    }

    if (dias <= 0 || dias > 30) {
    throw new PeriodoInvalidoException();
    }
 
    this.quarto = q;
    this.hospede = h;
    this.diasTotais = dias;
    this.valorTotal = dias * q.valorDiaria;

    q.disponivel = false;
    
    System.out.println("Reserva realizada com sucesso para " + h.nome);
    System.out.println("Valor total: R$ " + this.valorTotal);
    }    
}
    
    
