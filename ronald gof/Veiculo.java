public abstract class Veiculo {
    protected String modelo;
    protected double precoPorDia;

    public abstract String getTipo();

    public double calcularAluguel(int dias) {
        return precoPorDia * dias;
    }

    public String getDetalhes() {
        return "Tipo: " + getTipo() + " | Modelo: " + modelo + " | R$ " + precoPorDia + "/dia";
    }
}