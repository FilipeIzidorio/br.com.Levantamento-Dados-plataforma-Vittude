package Main;

import Model.Agenda;
import Model.Paciente;
import Model.Pagamento;
import Model.Psicologo;

public class Main {
    public static void main(String[] args) {


        Psicologo psicologo = new Psicologo("LUIZ MATHEUS", "10/05/1982", "987.654.123-01",
                "(83)9-9855-7485", "psicologomatheus@gmail.com", "AVENIDA JOAO PESSOA", "CONSULTORIO",
                "1231", "CZ", "58900-00", "PB", 80, "202010", "DEPRESSAO,BEM ESTAR E RELACIONAMENTOS",
                "PSICOLOGIA CLINICA E ANALISE DE COMPORTAMENTO", "MESTRADO", "UNIVERSIDADE DO ESTADO DA PARAIBA",
                120);
        Agenda agendaPsi = new Agenda("segunda,terca,quarta,quinta,sexta","07:00,07:50,08:40,09:30,10:20,11:10");

        System.out.println(psicologo);

        psicologo.atendimento_Online_Presencial();
        psicologo.duracaoDaConsulta();
        psicologo.publicoAlvo();
        System.out.println(agendaPsi);
        System.out.println("\n");

        Paciente paciente = new Paciente("RAFAEL DANTAS", "01/01/2000", "123.456.789-00",
                "(83)9-9988-77-55", "RAFA@HOTMAIL.COM", "RUA CORONEL PEBA", "AP", "0", "CZ",
                "58900-000", "PB", "DEPRESSAO");
        Agenda agendaPaciente = new Agenda("segunda-feira","08:40");
        System.out.println(agendaPaciente);
        paciente.setOnline(false);
        paciente.setPresencial(true);
        System.out.println(paciente);
        paciente.atendimento_Online_Presencial();
        Pagamento pagamentoPaciente = new Pagamento(80, false, false);
        System.out.println("Pagamento via pix: " + pagamentoPaciente.getPix()+"\n");


    }
}
