public class Economico extends Veiculo {
    public Economico() {
        this.modelo = "Volkswagen Gol";
        this.precoPorDia = 80.0;
    }

    @Override
    public String getTipo() {
        return "Econômico";
    }
}