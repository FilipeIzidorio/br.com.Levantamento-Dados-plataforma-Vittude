package Model;

import Interface.IAtendimento;

public class Paciente extends Usuario implements IAtendimento {
    String tipoDeAtendimento;

    public Paciente(String nomeCompleto, String dataDeNascimento, String cpf, String contato, String email, String rua, String complemento, String numero, String cidade, String cep, String uf, String tipoDeAtendimento) {
        super(nomeCompleto, dataDeNascimento, cpf, contato, email, rua, complemento, numero, cidade, cep, uf);
        this.tipoDeAtendimento = tipoDeAtendimento;
    }

    public String getTipoDeAtendimento() {
        return tipoDeAtendimento;
    }

    public void setTipoDeAtendimento(String tipoDeAtendimento) {
        this.tipoDeAtendimento = tipoDeAtendimento;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "tipoDeAtendimento='" + tipoDeAtendimento + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", contato='" + contato + '\'' +
                ", email='" + email + '\'' +
                ", rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }

    boolean online;
    boolean presencial;



    public void setOnline(boolean online) {
        this.online = online;
    }


    public void setPresencial(boolean presencial) {
        this.presencial = presencial;
    }

    @Override
    public void atendimento_Online_Presencial() {
        System.out.println(" ATENDIMENTO ONLINE: "+online + "\n" +" ATENDIMENTO PRESENCIAL: "+ presencial);


    }

    @Override
    public void duracaoDaConsulta() {

    }

    @Override
    public void publicoAlvo() {

    }
}
