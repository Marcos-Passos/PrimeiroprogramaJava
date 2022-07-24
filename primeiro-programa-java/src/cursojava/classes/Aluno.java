package cursojava.classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Aluno {

    private String nome;
    private int idade;
    private String DataNascimento;
    private String RegistroGeral;
    private String NumeroCpf;
    private String NomeMae;
    private String NomePai;
    private String DataMatricula;
    private String NomeEscola;
    private String SerieMatriculado;
    
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    
    
    

    public List<Disciplina> getDisciplinas() {
return disciplinas;
 }
public void setDisciplinas(List<Disciplina> disciplinas) {
this.disciplinas = disciplinas;
 }
public Aluno() {
        /* commit */
    }
    public Aluno (String nomePadrao) { nome  = nomePadrao;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return RegistroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        RegistroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return NumeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        NumeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return NomeMae;
    }

    public void setNomeMae(String nomeMae) {
        NomeMae = nomeMae;
    }

    public String getNomePai() {
        return NomePai;
    }

    public void setNomePai(String nomePai) {
        NomePai = nomePai;
    }

    public String getDataMatricula() {
        return DataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        DataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return NomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        NomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return SerieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        SerieMatriculado = serieMatriculado;
    }


   

public double getMediaNota(){
  
double somaNotas = 0.0;
  
for (Disciplina disciplina : disciplinas ) {
somaNotas += disciplina.getNota();
  }
return  somaNotas / disciplinas.size();
    }
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if  (media >= 70){ /*APROVADO*/
            return true;
        }else{
            return false; /*REPROVADO*/
        }
    }
    /* métdo que retorna true para aprovado e false para reprovado*/
    public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if  (media >= 50){
        	if  (media >= 70) {
        	}else {
        		return "Aluno em recuperação !";
        	}
            return "Aluno está aprovado!";
        }else{
            return "Aluno está reprovado!";
        }
        
    }



@Override
public int hashCode() {
return Objects.hash(DataMatricula, DataNascimento, NomeEscola, NomeMae, NomePai, NumeroCpf, RegistroGeral,
SerieMatriculado, disciplinas, idade, nome);
 }
@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Aluno other = (Aluno) obj;
return Objects.equals(DataMatricula, other.DataMatricula)
&& Objects.equals(DataNascimento, other.DataNascimento) && Objects.equals(NomeEscola, other.NomeEscola)
&& Objects.equals(NomeMae, other.NomeMae) && Objects.equals(NomePai, other.NomePai)
&& Objects.equals(NumeroCpf, other.NumeroCpf) && Objects.equals(RegistroGeral, other.RegistroGeral)
&& Objects.equals(SerieMatriculado, other.SerieMatriculado)
& Objects.equals(disciplinas, other.disciplinas) && idade == other.idade
&& Objects.equals(nome, other.nome);
 }
@Override
public String toString() {
return "Aluno [nome=" + nome + ", idade=" + idade + ", DataNascimento=" + DataNascimento + ", RegistroGeral="
+ RegistroGeral + ", NumeroCpf=" + NumeroCpf + ", NomeMae=" + NomeMae + ", NomePai=" + NomePai
+ ", DataMatricula=" + DataMatricula + ", NomeEscola=" + NomeEscola + ", SerieMatriculado="
+ SerieMatriculado + "]";
 }
    
    
}