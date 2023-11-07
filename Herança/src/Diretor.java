class Diretor extends Pessoa {
    private String departamento;
    private String endereco;
    private String telefone;

    public Diretor(String nome, int idade, String departamento, String endereco, String telefone) {
        super(nome, idade);
        this.departamento = departamento;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}


