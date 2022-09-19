import java.time.LocalDate;

public class Certificado {
        private String nomeDaInstituicao;
        private String nomeDoAluno;
        private String nomeDoCurso;
        private LocalDate dataDeTermino;

        public Certificado(String nomeDaInstituicao, String nomeDoAluno, String nomeDoCurso, LocalDate dataDeTermino){
                this.nomeDaInstituicao = nomeDaInstituicao;
                this.nomeDoAluno = nomeDoAluno;
                this.nomeDoCurso = nomeDoCurso;
                this.dataDeTermino = dataDeTermino;
        }

        public String getNomeDaInstituicao() {
                return nomeDaInstituicao;
        }

        public String getNomeDoAluno() {
                return nomeDoAluno;
        }

        public String getNomeDoCurso() {
                return nomeDoCurso;
        }

        public LocalDate getDataDeTermino() {
                return dataDeTermino;
        }



}
