import java.util.Date;

public class HotwhellsVendedor {
    private int ID;
    private String nome;
    private int matricula;
    private Date data;
    private int preço;

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
