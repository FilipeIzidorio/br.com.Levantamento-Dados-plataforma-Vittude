package Model;

import Interface.IAtendimento;

public class Psicologo extends Usuario implements IAtendimento {
    float valorDaConsulta = 80;
    String CRP;
    String topicosDeAtendimento;
    String areasPesquisa;
    String formacaoAcademica;
    String instituicaoDeEnsino;
    int consultasRealizadas;

    public Psicologo(String nomeCompleto, String dataDeNascimento, String cpf, String contato, String email, String rua, String complemento, String numero, String cidade, String cep, String uf, float valorDaConsulta, String CRP, String topicosDeAtendimento, String areasPesquisa, String formacaoAcademica, String instituicaoDeEnsino, int consultasRealizadas) {
        super(nomeCompleto, dataDeNascimento, cpf, contato, email, rua, complemento, numero, cidade, cep, uf);
        this.valorDaConsulta = valorDaConsulta;
        this.CRP = CRP;
        this.topicosDeAtendimento = topicosDeAtendimento;
        this.areasPesquisa = areasPesquisa;
        this.formacaoAcademica = formacaoAcademica;
        this.instituicaoDeEnsino = instituicaoDeEnsino;
        this.consultasRealizadas = consultasRealizadas;
    }

    public float getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setValorDaConsulta(float valorDaConsulta) {
        this.valorDaConsulta = valorDaConsulta;
    }

    public String getCRP() {
        return CRP;
    }

    public void setCRP(String CRP) {
        this.CRP = CRP;
    }

    public String getTopicosDeAtendimento() {
        return topicosDeAtendimento;
    }

    public void setTopicosDeAtendimento(String topicosDeAtendimento) {
        this.topicosDeAtendimento = topicosDeAtendimento;
    }

    public String getAreasPesquisa() {
        return areasPesquisa;
    }

    public void setAreasPesquisa(String areasPesquisa) {
        this.areasPesquisa = areasPesquisa;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getInstituicaoDeEnsino() {
        return instituicaoDeEnsino;
    }

    public void setInstituicaoDeEnsino(String instituicaoDeEnsino) {
        this.instituicaoDeEnsino = instituicaoDeEnsino;
    }

    public int getConsultasRealizadas() {
        return consultasRealizadas;
    }

    public void setConsultasRealizadas(int consultasRealizadas) {
        this.consultasRealizadas = consultasRealizadas;
    }

    @Override
    public String toString() {
        return "Psicologo{" +
                "valorDaConsulta=" + valorDaConsulta +
                ", CRP='" + CRP + '\'' +
                ", topicosDeAtendimento='" + topicosDeAtendimento + '\'' +
                ", areasPesquisa='" + areasPesquisa + '\'' +
                ", formacaoAcademica='" + formacaoAcademica + '\'' +
                ", instituicaoDeEnsino='" + instituicaoDeEnsino + '\'' +
                ", consultasRealizadas=" + consultasRealizadas +
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
    String duracaoDaconsultA = "50";

    public String getDuracaoDaconsultA() {
        return duracaoDaconsultA;
    }

    public void setDuracaoDaconsultA(String duracaoDaconsultA) {
        this.duracaoDaconsultA = duracaoDaconsultA;
    }

    @Override
    public void duracaoDaConsulta() {
        System.out.println("DURACAO DA CONSULTA: "+duracaoDaconsultA + " min");

    }
    String publiAlvO = "Pessoas com Depresao";

    public String getPubliAlvO() {
        return publiAlvO;
    }

    public void setPubliAlvO(String publiAlvO) {
        this.publiAlvO = publiAlvO;
    }

    @Override
    public void publicoAlvo() {
        System.out.println("PUBLICO ALVO: " + publiAlvO);

    }
    boolean online = true;
    boolean presencial = true;

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public boolean isPresencial() {
        return presencial;
    }

    public void setPresencial(boolean presencial) {
        this.presencial = presencial;
    }

    @Override
    public void atendimento_Online_Presencial() {
        System.out.println(" ATENDIMENTO ONLINE: "+online + "\n" +" ATENDIMENTO PRESENCIAL: "+ presencial);

    }
}
