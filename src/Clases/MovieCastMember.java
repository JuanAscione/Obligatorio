package Clases;

import TADs.Implementaciones.ListaEnlazada;
import static Conversores.Conversores.convertToVarios;
import static Conversores.Conversores.convertToVariosMCM;

public class MovieCastMember implements Comparable<MovieCastMember> {

    //ATRIBUTOS

    private int ordering;

    private String category;

    private String job;

    private ListaEnlazada<String> characters;

    private String imdb_title_id;

    private String imdb_name_id;

    //CONSTRUCTOR

    public MovieCastMember(String[] atributos){
        this.imdb_title_id = atributos[0];
        this.ordering = Integer.parseInt(atributos[1]);
        this.imdb_name_id = atributos[2];
        this.category = atributos[3];
        this.job = atributos[4];
        this.characters = convertToVarios(atributos[5]);
    }

    //GETTERS

    public int getOrdering() {
        return ordering;
    }

    public String getCategory() {
        return category;
    }

    public String getJob() {
        return job;
    }

    public ListaEnlazada<String> getCharacters() {
        return characters;
    }

    public String getImdb_title_id() {
        return imdb_title_id;
    }

    public String getImdb_name_id() {
        return imdb_name_id;
    }

    @Override
    public int compareTo(MovieCastMember o) {

        if(this.characters.getSize() > o.getCharacters().getSize()){
            return 1;
        }

        else if(this.characters.getSize() < o.getCharacters().getSize()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
