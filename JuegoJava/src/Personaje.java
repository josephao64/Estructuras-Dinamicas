import javax.management.NotCompliantMBeanException;

public class Personaje {
    int vida;

    public Personaje(){
        this.vida =100;
    }


    public void atacar(Personaje personaje ,  int dano){
        personaje.recibirDaño(dano);
    }
    public void recibirDaño(int dano){
        vida -= dano;
        
        if (vida < 0) {
            vida = 0;
        }
        if (vida == 0) {
            System.out.println("el personaje esta muerto ");
        }
    }

    public int getVida() {
        return vida;
    }
}



