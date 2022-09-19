public class Professor {
        private String nome;
        private String email;
        private String disciplina;
    
    public Professor(String nome, String email, String disciplina){
        this.nome = nome;
        this.email = email;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDisciplina() {
        return disciplina;
    }

    
    }