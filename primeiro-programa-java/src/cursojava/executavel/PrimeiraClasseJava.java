package cursojava.executavel;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			/* new Aluno () � uma instancia ( criacao de objeto ) */
			/* aluno1 � uma referencia para o bjeto Alino'x */

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");

			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de Nascimento:"); String
			 * registroGeral = JOptionPane.showInputDialog("Registro Geral:"); String cpf =
			 * JOptionPane.showInputDialog("CPF:"); String mae =
			 * JOptionPane.showInputDialog("Nome da m�e:"); String pai =
			 * JOptionPane.showInputDialog("Nome do pai:"); String matricula =
			 * JOptionPane.showInputDialog("data da matricula: "); String serie =
			 * JOptionPane.showInputDialog("Qual a serie?");
			 * 
			 * String escola = JOptionPane.showInputDialog("Nome da escola");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento);
			 * aluno1.setRegistroGeral(registroGeral); aluno1.setNumeroCpf(cpf);
			 * aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
			 * aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

			if (escolha == 0) {/* op��o sim � zero */

				int continuarRemover = 0;
				
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4? ");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");

				}

			}
			alunos.add(aluno1);
		}
		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("marcos")) {
				alunos.remove(aluno);
				break;
			} else {

				System.out.println(aluno);
				System.out.println("M�dia do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado 2 = " + aluno.getAlunoAprovado2());
				System.out.println("-----------------------------------------------------");
			}
		}
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobrarma na lista: ");
			System.out.println(aluno.getNome());
			System.out.println("Suas mat�rias s�o: ");

			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}
	}
}