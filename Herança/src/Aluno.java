class Aluno extends Pessoa {
    private int matricula;
    private String endereco;
    private String telefone;

    public Aluno(String nome, int idade, int matricula, String endereco, String telefone) {
        super(nome, idade);
        this.matricula = matricula;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}



