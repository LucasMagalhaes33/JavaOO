package executavel;

import classes.Aluno;
import classes.Disciplina;

import javax.swing.*;

public class PrimeiraClasse {
    public static void main(String[] args) {
        /*objeto não existe na memória*/
        //Aluno aluno1;

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
        String rg = JOptionPane.showInputDialog("Qual o RG do aluno?");
        String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
        String mae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
        String pai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
        String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula do aluno?");
        String serie = JOptionPane.showInputDialog("Qual a série do aluno?");
        String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");



        /*String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
        String nota1 = JOptionPane.showInputDialog("Qual a primeira nota do aluno?");

        String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
        String nota2 = JOptionPane.showInputDialog("Qual a segunda nota do aluno?");

        String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
        String nota3 = JOptionPane.showInputDialog("Qual a terceira nota do aluno?");

        String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
        String nota4 = JOptionPane.showInputDialog("Qual a quarta nota do aluno?");*/

        //bjeto agora existe na memória
        Aluno aluno2 = new Aluno();

        aluno2.setNome(nome);
        aluno2.setIdade(Integer.valueOf(idade));
        aluno2.setDataNascimento(dataNascimento);
        aluno2.setRegistroGeral(rg);
        aluno2.setNumeroCpf(cpf);
        aluno2.setNomeMae(mae);
        aluno2.setNomePai(pai);
        aluno2.setDataMatricula(dataMatricula);
        aluno2.setSerieMatriculado(serie);
        aluno2.setNomeEscola(nomeEscola);

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de dados");
        disciplina1.setNota(90);
        aluno2.getDisciplinas().add(disciplina1);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Matemática");
        disciplina2.setNota(80);
        aluno2.getDisciplinas().add(disciplina1);

        Disciplina disciplina3 = new Disciplina();
        disciplina3.setDisciplina("Geografia");
        disciplina3.setNota(97);
        aluno2.getDisciplinas().add(disciplina3);

        Disciplina disciplina4 = new Disciplina();
        disciplina4.setDisciplina("Java Web");
        disciplina4.setNota(70);
        aluno2.getDisciplinas().add(disciplina4);

        System.out.println("O nome do aluno é " + aluno2.getNome());
        System.out.println("A idade do aluno é " + aluno2.getIdade());
        System.out.println("Nascimento = " + aluno2.getDataNascimento());
        System.out.println("Nome Mãe = " + aluno2.getNomeMae());
        System.out.println("Nome pai = " + aluno2.getNomePai());
        System.out.println("Data da matrícula = " + aluno2.getDataMatricula());
        System.out.println("Série = " + aluno2.getSerieMatriculado());
        System.out.println("Escola = " + aluno2.getNomeEscola());
        System.out.println("Média da nota é = " + aluno2.getMediaNota());
        System.out.println("Resultado = " + (aluno2.getALunoAprovado() ? "Aprovado" : "Reprovado"));
        /*====================================================

        System.out.println("==========================================================");
        System.out.println(aluno2); //descriação do objeto na memória
        System.out.println("Média do alunoe = " + aluno2.getMediaNota());
        System.out.println("Resultado = " + aluno2.getALunoAprovado());

        /*new Aluno() é uma instância (Criação de objeto)
        aluno3 é uma referência para o objeto Aluno
        Aluno aluno3 = new Aluno();

        Aluno aluno4 = new Aluno("Maria");

        Aluno aluno5 = new Aluno("José", 50);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Alex");
        aluno1.setNumeroCpf("300");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Alex");
        aluno1.setNumeroCpf("310");

        if (aluno1.equals(aluno2)) {
            System.out.println("Alunos são iguais");
        } else {
            System.out.println("Alunos não são iguais");
        }*/
    }


}
