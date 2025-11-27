import java.util.Scanner;

public class Mainprofessores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProfessoresDAO dao = new ProfessoresDAO();

        System.out.println("=== CADASTRO DE PROFESSOR ===");

        // --- CREATE ---
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Estado civil: ");
        String estadoCivil = sc.nextLine();

        System.out.print("Matéria responsável: ");
        String materia = sc.nextLine();

        Professores novo = new Professores(nome, email, estado, cidade, estadoCivil, materia);
        dao.inserir(novo);

        // --- READ ---
        System.out.println("\n--- LISTA DE PROFESSORES ---");
        for (Professores p : dao.listar()) {
            System.out.println(
                    p.getId() + " - " +
                            p.getNome() + " - " +
                            p.getEmail() + " - " +
                            p.getEstado() + " - " +
                            p.getCidade() + " - " +
                            p.getEstado_civil() + " - " +
                            p.getMateria_responsavel()
            );
        }

        // --- UPDATE ---
        System.out.println("\n=== ATUALIZAR UM PROFESSOR ===");
        System.out.print("ID do professor a atualizar: ");
        int idAtualizar = sc.nextInt();
        sc.nextLine();

        System.out.print("Novo nome: ");
        String novoNome = sc.nextLine();

        System.out.print("Novo email: ");
        String novoEmail = sc.nextLine();

        System.out.print("Novo estado: ");
        String novoEstado = sc.nextLine();

        System.out.print("Nova cidade: ");
        String novaCidade = sc.nextLine();

        System.out.print("Novo estado civil: ");
        String novoEstadoCivil = sc.nextLine();

        System.out.print("Nova matéria responsável: ");
        String novaMateria = sc.nextLine();

        Professores atualizado = new Professores(
                idAtualizar, novoNome, novoEmail, novoEstado, novaCidade, novoEstadoCivil, novaMateria
        );

        dao.atualizar(atualizado);

        // --- DELETE ---
        System.out.println("\n=== DELETAR UM PROFESSOR ===");
        System.out.print("ID do professor a deletar: ");
        int idDelete = sc.nextInt();

        dao.deletar(idDelete);

        sc.close();
    }
}