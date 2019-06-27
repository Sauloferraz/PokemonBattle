package classes;

import java.io.Serializable;

public class Pokemon implements Serializable{

    private String nome;
    private int LVL;
    private String type1;
    private String type2;
    private int HP;
    private int ATK;
    private int DEF;
    private int SPD;
    private int SPA;
    private int SPE;
    private Move move1;
    private Move move2;
    private Move move3;
    private Move move4;

    public Pokemon (String nome, int HP, int ATK, int DEF, int SPD, int SPA, int SPE, String type1, String type2, int LVL, Move move1, Move move2, Move move3, Move move4) {

        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.SPD = SPD;
        this.SPA = SPA;
        this.SPE = SPE;
        this.LVL = LVL;
        this.type1 = type1;
        this.type2 = type2;
        this.nome = nome;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }


    public Move getMove1() {
        return move1;
    }

    public void setMove1(Move move1) {
        this.move1 = move1;
    }

    public Move getMove2() {
        return move2;
    }

    public void setMove2(Move move2) {
        this.move2 = move2;
    }

    public Move getMove3() {
        return move3;
    }

    public void setMove3(Move move3) {
        this.move3 = move3;
    }

    public Move getMove4() {
        return move4;
    }

    public void setMove4(Move move4) {
        this.move4 = move4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int hP) {
        HP = hP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int aTK) {
        ATK = aTK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int dEF) {
        DEF = dEF;
    }

    public int getSPD() {
        return SPD;
    }

    public void setSPD(int sPD) {
        SPD = sPD;
    }

    public int getSPA() {
        return SPA;
    }

    public void setSPA(int sPA) {
        SPA = sPA;
    }

    public int getSPE() {
        return SPE;
    }

    public void setSPE(int sPE) {
        SPE = sPE;
    }

    public int getLVL() {
        return LVL;
    }

    public void setLVL(int lVL) {
        LVL = lVL;
    }

    public String toString() {
        return "Name: " + nome + "\n" + "Type: " + type1 + "/" + type2 + "\n" + "Moves: " + getMove1().getNome();
    }
}