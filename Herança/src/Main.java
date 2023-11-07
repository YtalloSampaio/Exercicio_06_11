public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 18, 12345, "Rua A, 123", "(61) 9 9988 7766");
        Professor professor = new Professor("Maria", 35, "Matemática", "Rua B, 456", "(61) 9 9955 4433");
        Diretor diretor = new Diretor("Carlos", 50, "Administração", "Rua C, 789", "(61) 9 9922 1100");

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Matrícula do aluno: " + aluno.getMatricula());
        System.out.println("Endereço do aluno: " + aluno.getEndereco());
        System.out.println("Telefone do aluno: " + aluno.getTelefone());

        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Disciplina do professor: " + professor.getDisciplina());
        System.out.println("Endereço do professor: " + professor.getEndereco());
        System.out.println("Telefone do professor: " + professor.getTelefone());

        System.out.println("Nome do diretor: " + diretor.getNome());
        System.out.println("Departamento do diretor: " + diretor.getDepartamento());
        System.out.println("Endereço do diretor: " + diretor.getEndereco());
        System.out.println("Telefone do diretor: " + diretor.getTelefone());
    }
}

