/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imagePGM;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author vvielzeu
 */
public class SauvegardePGM {
    
    private String nomFichier;
    private BufferedWriter fichier;
    
    /**
     *
     * @param source
     */
    public SauvegardePGM(String source){
     this.nomFichier=source;
     try{
        fichier=new BufferedWriter(new FileWriter(source));}
        catch(Exception e){}
    }
 
    /**
     *
     * @param PGM L'image à charger
     * @param Pixels L'ensemble des niveaux de gris des pixels
     * @param Commentaires Les commentaires de la deuxième ligne
     */
    public void sauvegarderPGM(ImagePGM PGM, ArrayList<Integer> Pixels, String Commentaires){
     try{
     int l=PGM.getLongueur();
     int h=PGM.getHauteur();
     this.fichier.write("P2");
     this.fichier.newLine();
     this.fichier.write("#"+Commentaires);
     this.fichier.newLine();
     this.fichier.write(l+" "+h);
     this.fichier.newLine();
     int tot = l*h;
     int j = 0;
     
     for(int i=0 ; i<tot ; i++ ){
         this.fichier.write(Pixels.get(i));
         if(j==17){
             j=0;
             this.fichier.newLine();
         }
     }
     
     }
     catch (IOException ex){
}
     finally{
         try{
             if(this.fichier!=null){
                 this.fichier.flush();
                 this.fichier.close();
             };
             
         }
         catch (IOException ex){
         }
     }
     }
    
}
