
package ec.edu.ister.modelo;

/**
 *
 * @author Alfonso
 */
public class Nodo {
    
    private Nodo anterior;
     private Nodo siguiente;//Al ser doblemente enlazadas contiene una referencia a un nodo anterior y siguiente.
     private Character info;//La clase Character funciona similar a un char pero permite el uso de funciones
   public Nodo(Nodo anterior, Nodo siguiente, char info) {
    this.anterior = anterior;
    this.siguiente = siguiente;
    this.info = info;
 }
   public Nodo(char info) {
    anterior=siguiente=null;
    this.info = info;
 }
   public Nodo getAnterior() {
    return anterior;
 }
   public void setAnterior(Nodo anterior) {
    this.anterior = anterior;
 }
   public Nodo getSiguiente() {
    return siguiente;
 }
   public void setSiguiente(Nodo siguiente) {
    this.siguiente = siguiente;
 }
   public char getInfo() {
    return info;
 }
   public void setInfo(char info) {
    this.info = info;
 }
    
}
