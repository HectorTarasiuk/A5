public class Cliente {
    private String nome;
    private String email;
    void ExibirDetalhes(){
        System.out.println("Nome de cliente:"+this.nome);
        System.out.println("Email de cliente:"+this.email);
    }
    public Cliente(String nome, String email){
        this.nome=nome;
        this.email=email;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
