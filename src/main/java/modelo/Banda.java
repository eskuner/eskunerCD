
package modelo;

public class Banda {
   private int id_banda;
   private int numero_integrante;
   private Artista artista;
   private Grupo grupo;

    public int getId_banda() {
        return id_banda;
    }

    public void setId_banda(int id_banda) {
        this.id_banda = id_banda;
    }

    public int getNumero_integrante() {
        return numero_integrante;
    }

    public void setNumero_integrante(int numero_integrante) {
        this.numero_integrante = numero_integrante;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
   
   
}
