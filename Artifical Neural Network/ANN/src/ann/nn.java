/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ann;

import static ann.Ann.HIDDENLAYER;
import java.util.Random;

/**
 *
 * @author kivancenes
 */
public class nn {

    /**
     *
     * @param args
     */
    
    
    public static void main(String[]args){
        
    }
    
    
    public static void random(){
        //weight initialize
            double[][] weight_inputhidden = new double[15][HIDDENLAYER];//15-9
            double[] weight_hiddenoutput = new double[HIDDENLAYER];//hiddenla output arası
            //-1,+1 arası weight initialize
            Random rand = new Random();
            for (int i = 0; i < (16); i++) {
                for (int j = 0; j < HIDDENLAYER; j++) {
                    weight_inputhidden[i][j] = (rand.nextDouble() * 2) - 1;
                }
            }
            for (int i = 0; i < HIDDENLAYER; i++) {
                weight_hiddenoutput[i] = (rand.nextDouble() * 2) - 1;
            }
    }
    
    public static void okuma(){
        
        
    }
}
