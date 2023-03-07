import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

   public class HiloCancion extends Thread {
        String nombre;
        
        public HiloCancion(String nombre) {
            this.nombre = nombre;
        }   
        
        public void run() {
            try {
                System.out.println("Hola desde " + nombre + " reproducire una cancion");
                File archivoSonido = new File("C:\\Users\\Felipe\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\outoftime.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(archivoSonido));
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000);
            } catch (Exception e) {
                System.out.println("Error al reproducir el archivo de sonido: " + e.getMessage());
            }
        }
    }

