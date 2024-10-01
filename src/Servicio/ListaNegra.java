package Servicio;

import Modelo.Contributor;

public class ListaNegra {
    private LinkedListPropio<Contributor> listaNegra = new LinkedListPropio<>();

    public void addContributor(Contributor contributor) {
        listaNegra.add(contributor);
    }

    public LinkedListPropio<Contributor> getListaNegra() {
        return listaNegra;
    }

}
