package csv;

import co.edu.uniquindio.modelo.Departamento;

import java.io.IOException;

public class DepartamentoDao extends ADao<Departamento, String> {

    public DepartamentoDao() throws IOException {
        super("D:\\ED\\departamento.csv");
    }
}
