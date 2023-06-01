/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 * @author Thiago Aguiar
 */
public class Fatorial {

    // atributos
    private int numeroParaFatorial = 0;
    private int resultadoFatorial = 1;
    private String formulaUsadaFatorial = "";

    // métodos
    public void setFatorialEFormula(int n) {

        numeroParaFatorial = n;
        String formula = "";
        int resultado = 1;
        
        for (int i = numeroParaFatorial; i > 1; i--) {

            resultado *= i;

            formula += i + " x ";

        }
        
        formula += "1 = ";
        resultadoFatorial = resultado;
        formulaUsadaFatorial = formula;        

    }
    
    public int getResultadoFatorial(){
        
        return resultadoFatorial;
        
    }
    
    public String getFormulaUsadaFatorial(){
    
        return formulaUsadaFatorial;
        
    }

}
