package Servicio;
import Controlador.Contributor;
import java.util.PriorityQueue;

public class ContributorQueue {
    private PriorityQueue<Contributor> contributores;

    public ContributorQueue() {
        contributores = new PriorityQueue<>();
    }

    public void addContributor(Contributor contributor) {
        contributores.add(contributor);
    }

    public Contributor getContributor() {
        return contributores.poll();
    }
}
