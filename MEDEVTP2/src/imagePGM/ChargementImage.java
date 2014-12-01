/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imagePGM;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 * charge une image à partir d'un fichier texte
 *
 * @author gvedeau
 */
public class ChargementImage {

    private ImagePGM image;
    protected String nomFichier;
    protected BufferedReader fichier;
    private boolean valide = false;

    public ChargementImage(String nomFichier) {
        try {

            this.nomFichier = nomFichier;
            fichier = new BufferedReader(new FileReader(nomFichier));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ImagePGM ChargerImage() {

        String ligne;
        String mot;
        String delimiteur = " ";
        try {
            
            

            while ((ligne = fichier.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(ligne, delimiteur);



                mot = tokenizer.nextToken();


                switch (mot) {
                    case "":

                        break;

                    default:

                }
            }

            fichier.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


        if (valide){
        return image;
        }
        else{
            return new ImagePGM();
        }

    }

    /**
     * Get the value of image
     *
     * @return the value of image
     */
    public ImagePGM getImage() {
        return image;
    }

    /**
     * Set the value of image
     *
     * @param image new value of image
     */
    public void setImage(ImagePGM image) {
        this.image = image;
    }
}
