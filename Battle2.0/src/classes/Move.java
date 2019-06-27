package classes;

import java.io.Serializable;

public class Move implements Serializable {

    private String nome;
    private String type;
    private String category;
    private int Power;
    private int Acc;
    private int PP;

    public Move(String nome, String type, String category, int Power, int Acc, int PP) {

        this.nome = nome;
        this.type = type;
        this.category = category;
        this.Power = Power;
        this.Acc = Acc;
        this.PP = PP;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getPower() {
        return Power;
    }
    public void setPower(int power) {
        Power = power;
    }
    public int getAcc() {
        return Acc;
    }
    public void setAcc(int acc) {
        Acc = acc;
    }
    public int getPP() {
        return PP;
    }
    public void setPP(int pP) {
        PP = pP;
    }



}
