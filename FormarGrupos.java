import java.util.Random;
import java.util.Arrays;
public class FormarGrupos {
    // A Function to generate a random permutation of arr[]
    static String[] randomize( String arr[])
    {
        int n = arr.length;

        Random r = new Random();
          
        for (int i = n-1; i > 0; i--) {
              
            int j = r.nextInt(i);
              
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String[] args)
    {        
         String[] names = {"anaPMD", "anaelDSW", "andersonDC", "gabrielAD", "gabrielDSF", "gabrielVSC", "maitheSaldanhaFerrao", "marceloDSDA", "miguelJSDV", "rodrigoAS", "alejandroVTB", "eduardoMachadoDeLima", "eduardoRafaelGehrke", "eduardoRequiaSouza", "felipeColpoBagesteiro", "felipePeripolliSanfelice", "franciscoAlbrechtRibas", "giovanniRomanCacioli", "gleisonAntonioPiresDaSilva", "heitorArgentaPreigschadt", "joaoMarcosWilhelmsFrigo", "julioCesarAlvesSilvaDaSilva", "leonardoPiekalaSevero", "michaelCezarStrahl", "tiagoTrindadeMacedo", "walistonEuripedesDosSantos"};
         names = randomize (names);
         int grupo = 1;

         for ( int i = names.length - 1 ; i > 0 ; i=i-2){
            if ( names.length % 2 == 0 ) {
                System.out.println("Grupo " + grupo + ": " + names[i] + " " + names[i-1]);
                grupo++;
            }
            
            else{
                if( i != 2) {
                    System.out.println("Grupo " + grupo + ": " + names[i] + " " + names[i-1]);
                    grupo++;
                }
                else{
                    System.out.println("Grupo " + grupo + ": " + names[i] + " " + names[i-1] + " " + names[i-2]);
                }
            }
         }
    }
}