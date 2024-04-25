package com.gchaldu.interfaces;

public interface Repository {
    void registrar(Object obj);
    Object consultar(String id);
    void actualizar(String id, Object obj);
    void eliminar(String id);
}
