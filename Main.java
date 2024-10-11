public class Main {
    
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante("Rose", 1, 10.0, 7.0, 9.5);
        Estudante aluno2 = new Estudante("Fulano", 2, 5.5, 7.0, 6.0);
        
        System.out.println(aluno1);
        System.out.printf("MÉDIA = %.1f" , aluno1.getMedia());
        //System.out.printf("\nNOTA 1 = %.1f" , aluno1.getNota1());
        System.out.println(aluno2);
        System.out.printf("MÉDIA = %.1f" , aluno2.getMedia());

    }
}
