package Model;

public class Usuario  extends Endereco{
    String nomeCompleto;
    String dataDeNascimento;
    String cpf;
    String contato;

    public Usuario(String nomeCompleto, String dataDeNascimento, String cpf, String contato,String email, String rua, String complemento, String numero, String cidade, String cep, String uf) {
        super(email, rua, complemento, numero, cidade, cep, uf);
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.contato = contato;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
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
}
