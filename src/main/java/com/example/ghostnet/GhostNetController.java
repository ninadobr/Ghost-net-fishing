package com.example.ghostnet;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Named
@RequestScoped
public class GhostNetController {

    @PersistenceContext
    private EntityManager em;

    private GhostNet ghostNet = new GhostNet();

    public GhostNet getGhostNet() {
        return ghostNet;
    }

    @Transactional
    public String save() {
        ghostNet.setStatus(Status.GEMELDET);
        em.persist(ghostNet);
        ghostNet = new GhostNet();
        return "index.xhtml?faces-redirect=true";
    }

    public List<GhostNet> getAllGhostNets() {
        return em.createQuery("SELECT g FROM GhostNet g", GhostNet.class).getResultList();
    }

    public Status[] getStatuses() {
        return Status.values();
    }

    public PersonType[] getPersonTypes() {
        return PersonType.values();
    }
}
