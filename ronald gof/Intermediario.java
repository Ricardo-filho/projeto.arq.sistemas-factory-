public class Intermediario extends Veiculo {
    public Intermediario() {
        this.modelo = "Toyota Corolla";
        this.precoPorDia = 150.0;
    }

    @Override
    public String getTipo() {
        return "Intermediário";
    }
}