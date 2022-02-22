/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imcgraphique;

import javax.swing.JOptionPane;

/**
 *
 * @author khali
 */
public class CalculeIMC {
    
    private double poids,taille;

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

   

    public CalculeIMC(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
    }
    public long calculer()
    {
    //double indice=poids/(taille*taille);
    double indice=poids/(Math.pow(taille, 2));
    return Math.round(indice);
    
    }
    public void evaluation()
    {
    long imc=calculer();
    if(imc<20)
    {
    System.out.println("votre IMC est: "+imc+" vous êtes maigre");
      //  JOptionPane.showMessageDialog(null, "");
      JOptionPane.showMessageDialog(null, "votre IMC est: "+imc+" vous êtes maigre");
    }
    else if(imc<=25)
    {System.out.println("votre IMC est: "+imc+" vous êtes idéale");
          JOptionPane.showMessageDialog(null, "votre IMC est: "+imc+" vous êtes idéale");
    }
    else
    {  System.out.println("votre IMC est: "+imc+" vous êtes en surpoids");
          JOptionPane.showMessageDialog(null, "votre IMC est: "+imc+" vous êtes en surpoids");

    
    }
        
    
    }
    
    
    
    
}
