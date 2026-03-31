package aula07_31_03.ex03;

public class TesteReserva {
    public static void main(String[] args) {

    Quarto q1 = new Quarto(101, "Luxo", 500.0, true);
    Hospede h1 = new Hospede("123.456.789-00", "");
    Reserva reserva = new Reserva();
    
    try {
    reserva.realizarReserva(q1, h1, 10);
    
    } catch (Exception e) {
    System.err.println(e.getMessage());
    }
    
    h1.nome = "Victor";
    try {
    reserva.realizarReserva(q1, h1, 40);
    
    } catch (Exception e) {
    System.err.println(e.getMessage());
    }

    try {
    reserva.realizarReserva(q1, h1, 5);
    } catch (Exception e) {
    System.err.println("Isso não deve aparecer.");
       }
    }
}
