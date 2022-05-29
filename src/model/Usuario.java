
package model;


public class Usuario {
    
    private int id;
    private String username;
    private String senha;
    private String turma;
    private String perfil;
    

    public Usuario(){
        
        
    }
    
    public Usuario(int id, String nome, String senha, String turma, String perfil) {
        this.id = id;
        this.username = username;
        this.senha = senha;
        this.turma = turma;
        this.perfil = perfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
        public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }  

}
