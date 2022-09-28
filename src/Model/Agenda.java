package Model;

public class Agenda {
    String diasDisponiveis;
    String horario;

    public Agenda(String diasDisponiveis, String horario) {
        this.diasDisponiveis = diasDisponiveis;
        this.horario = horario;
    }

    public String getDiasDisponiveis() {
        return diasDisponiveis;
    }

    public void setDiasDisponiveis(String diasDisponiveis) {
        this.diasDisponiveis = diasDisponiveis;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "diasDisponiveis='" + diasDisponiveis + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
