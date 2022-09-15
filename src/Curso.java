import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    
        int cargaHoraria;
        int nivel;
        private String nomeDoCurso;
        private String modalidade;
        private LocalDate dataDeInicio;
        private LocalDate dataDeTermino;
        private Boolean gratuito;
        private Professor professor;
        private List<Aluno> alunos;
        
        
        public Curso(String nomeDoCurso,int nivel, int cargaHoraria, Professor professor){
                this.nomeDoCurso = nomeDoCurso;
                this.nivel = nivel;
                this.cargaHoraria = cargaHoraria;
                this.professor = professor;
                this.alunos = new ArrayList<>();
        }
        public int getCargaHoraria() {
                return cargaHoraria;
        }
        public int getNivel() {
                return nivel;
        }
        public String getNomeDoCurso() {
                return nomeDoCurso;
        }
        public String getModalidade() {
                return modalidade;
        }
        public LocalDate getDataDeInicio() {
                return dataDeInicio;
        }
        public LocalDate getDataDeTermino() {
                return dataDeTermino;
        }
        public Boolean getGratuito() {
                return gratuito;
        }
        public Professor getProfessor() {
                return professor;
        }
        public List<Aluno> getAlunos() {
                return alunos;
        }





    

}
