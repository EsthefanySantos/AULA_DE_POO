import dadosdoclientes.Cliente;
import dadosdoclientes.Curso;

public static void main(String[] args) {
    Cliente pessoal = new Cliente("Jonas", 19, "123-456-789-10", "teste@gmail.com");
    Curso curso1 = new Curso("Programação", 60,799.99, "Carlos Mendes");

    pessoal.Imprime();
    System.out.println("---------------------------------------------------------------------------------");
    curso1.ImprimeCurso();



}
