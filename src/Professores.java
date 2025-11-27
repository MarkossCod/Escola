public class Professores {
    // Atributos privados
    private int id; // Chave primária
    private String nome;
    private String email;
    private String estado;
    private String cidade;
    private String estado_civil;
    private String materia_responsavel;

    public Professores(String nome, String email,String estado,String cidade,String estado_civil,String materia_responsavel) {
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.cidade = cidade;
        this.estado_civil = estado_civil;
        this.materia_responsavel = materia_responsavel;
    }

    public Professores(int id, String nome, String email, String estado, String cidade, String estado_civil, String materia_responsavel) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.estado_civil = estado_civil;
        this.materia_responsavel = materia_responsavel;
        this.cidade = cidade;
    }

    // Métodos Getters (Acessores)
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getEstado(){
        return estado;
    }
    public String getCidade(){
        return cidade;
    }
    public String getEstado_civil(){
        return estado_civil;
    }
    public String getMateria_responsavel(){
        return materia_responsavel;
    }

    // Métodos Setters (Modificadores)
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setEstado_civil(String estado_civil){
        this.estado_civil = estado_civil;
    }
    public void setMateria_responsavel(String materia_responsavel){
        this.materia_responsavel = materia_responsavel;
    }
}