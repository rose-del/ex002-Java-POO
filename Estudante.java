public class Estudante {

    String nome;
    int matricula;
    double n1;
    double n2;
    double n3;

    public Estudante(String nome, int matricula, double n1, double n2, double n3) {
        this.nome = nome;
        this.matricula = matricula;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double getMedia() {
        double media = (n1 + n2 + n3) / 3;

        return media;
    }

    public void setNotas(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double getNota1() {
        return n1;
    }

    public double getNota2() {
        return n2;
    }

    public double getNota3() {
        return n3;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s \nMatricula: %d", nome, matricula);
        // \nNota1: %.2f \nNota2: %.2f \nNota3: %.2f
    }
}