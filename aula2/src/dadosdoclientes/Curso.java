package dadosdoclientes;

public class Curso {
    String nome;
    int CargaHoraria;
    double valor;
    String professor;

    public Curso(String nome, int CargaHoraria, double valor, String professor) {
        this.nome = nome;
        this.CargaHoraria = CargaHoraria;
        this.valor = valor;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.CargaHoraria= cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }


    public void ImprimeCurso() {
        System.out.println("Curso: " + this.nome);
        System.out.println("Carga Horaria: " + this.CargaHoraria);
        System.out.println("Valor: " + this.valor);
        System.out.println("Professor: " + this.professor);
    }
}
