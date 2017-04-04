/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author cervanteshernandez
 */
public class UniqueResult<T> {
    private final T dato;
    private final Long cantidad ;

    public UniqueResult(T first, Long second) {
        this.dato = first;
        this.cantidad = second;
    }

    public T getDato() {
        return dato;
    }

    public Long getCantidad() {
        return cantidad;
    }
    
}
