class Professor extends Pessoa {
    private String disciplina;
    private String endereco;
    private String telefone;

    public Professor(String nome, int idade, String disciplina, String endereco, String telefone) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}

