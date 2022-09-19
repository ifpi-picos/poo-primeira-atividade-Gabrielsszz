import java.time.LocalDate;

public class Aluno {

        private String nome;
        private String matricula;
        private int idade;
        private String email;
        private LocalDate dataDeNascimento;

        public Aluno(String nome, String matricula, int idade, String email, LocalDate dataDeNascimento) {
                this.nome = nome;
                this.matricula = matricula;
                this.idade = idade;
                this.email = email;
                this.dataDeNascimento = dataDeNascimento;

        }

        public String getNome() {
                return nome;
        }

        public String getMatricula() {
                return matricula;
        }

        public int getIdade() {
                return idade;
        }

        public String getEmail() {
                return email;
        }

        public LocalDate getDataDeNascimento() {
                return dataDeNascimento;
        }

}
