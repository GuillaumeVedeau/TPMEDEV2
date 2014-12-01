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

    private ImagePGM image = new ImagePGM();
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
        boolean finDuDocument = false;
        try {

            if (((ligne = fichier.readLine()) != null) && (new StringTokenizer(ligne, delimiteur)).nextToken().equalsIgnoreCase("p2")) {
      
                ligne = fichier.readLine(); // On ignore la ligne de commentaires
                
                // On lit la hauteur et la largeur
                ligne = fichier.readLine();
                StringTokenizer tokenizer = new StringTokenizer(ligne, delimiteur);
                this.getImage().setLongueur(Integer.getInteger(tokenizer.nextToken()));
                this.getImage().setHauteur(Integer.getInteger(tokenizer.nextToken()));
                
                //On lit la valeur max
                ligne = fichier.readLine();
                tokenizer = new StringTokenizer(ligne, delimiteur);
                this.getImage().setPlusHaut(Integer.getInteger(tokenizer.nextToken()));

                
                ligne = fichier.readLine();

                while (!finDuDocument) {



                    tokenizer = new StringTokenizer(ligne, delimiteur);

                    if (tokenizer.hasMoreTokens()) {
                        mot = tokenizer.nextToken();
                        image.getImage().add(Integer.getInteger(mot));
                    } else {
                        if ((ligne = fichier.readLine()) != null) {
                            tokenizer = new StringTokenizer(ligne, delimiteur);
                            mot = tokenizer.nextToken();
                            image.getImage().add(Integer.getInteger(mot));
                        } else {
                            finDuDocument = true;
                        }


                    }



                }
            }

            fichier.close();




        } catch (Exception e) {
            e.printStackTrace();



        }
        return image;
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
