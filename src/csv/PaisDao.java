package csv;

import co.edu.uniquindio.modelo.Pais;

import java.io.IOException;

public class PaisDao extends ADao<Pais, Integer> {

    public PaisDao() throws IOException {
        super("D:\\ED\\pais.csv");
    }
}
