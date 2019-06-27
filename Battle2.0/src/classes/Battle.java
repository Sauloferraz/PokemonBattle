package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Battle {

    public static void main(String args[]) throws Exception {

        /* Move m1A = new Move("Flamethrower", "Fire", "Special", 90, 100, 10);
        Move m2A = new Move("Air Slash", "Flying", "Special", 75, 95, 20);
        Move m3A = new Move("Dragon Pulse", "Dragon", "Special", 85, 100, 10);
        Move m4A = new Move("Slash", "Normal", "Physical", 70, 100, 20);
        Move m5A = new Move("Swords Dance", "ATK", "Status", 2, 100, 20);
        Move m1B = new Move("Stone Edge", "Rock", "Special", 100, 80, 5);
        Move m2B = new Move("Crunch", "Dark", "Special", 80, 100, 15);
        Move m3B = new Move("Ice Punch", "Ice", "Special", 75, 100, 15);

        new Move("Earthquake", "Ground", "Physical", 100, 100, 10);

        Pokemon P2 = new Pokemon("Tyranitar", 404, 305, 350, 203, 236, 158, "Rock", "Dark", 100, m1B, m2B, m3B, m5A);
        Pokemon P1 = new Pokemon("Charizard", 297, 184, 192, 348, 206, 299, "Fire", "Flying", 100, m1A, m2A, m3A, m4A);*/


        List<Move> mdex = new ArrayList<Move>();
        mdex.add(new Move("Flamethrower", "Fire", "Special", 90, 100, 10));
        mdex.add(new Move("Air Slash", "Flying", "Special", 75, 95, 20));
        mdex.add(new Move("Dragon Pulse", "Dragon", "Special", 85, 100, 10));
        mdex.add(new Move("Slash", "Normal", "Physical", 70, 100, 20));


        List<Pokemon> dex = new ArrayList<Pokemon>();
        dex.add(new Pokemon("Charizard", 297, 184, 192, 348, 299, 206, "Fire",
                "Flying", 100, mdex.get(0), mdex.get(1), mdex.get(2), mdex.get(3)));

        File file = new File("dex.txt");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(dex);
        out.flush();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        List<Pokemon> list2 = (List<Pokemon>) in.readObject();
        in.close();
        for (Pokemon p : list2) {
            System.out.println(p.toString());
        }
        out.close();
    }
}