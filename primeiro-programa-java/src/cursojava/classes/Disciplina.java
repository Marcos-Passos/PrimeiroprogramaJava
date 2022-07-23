package cursojava.classes;

import java.util.Objects;

public class Disciplina {

private double nota;

private String disciplina;

public double getNota() {
return nota;
 }

public void setNota(double nota) {
this.nota = nota;
 }

public String getDisciplina() {
return disciplina;
 }

public void setDisciplina(String disciplina) {
this.disciplina = disciplina;
 }

@Override
public int hashCode() {
return Objects.hash(disciplina, nota);
 }

@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Disciplina other = (Disciplina) obj;
if (disciplina == null) {
if (other.disciplina != null)
return false;
} else if (!disciplina.equals(other.disciplina))
return false;
if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
return false;
return true;
 }

@Override
public String toString() {
return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
 }

}