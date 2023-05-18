/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 * Clase que implementa el comportamiento común de cualquier tipo de carta.
 *
 * @author Miguel Bastos Gándara.
 */
public abstract class Card {

    /**
     *
     */
    protected String text;

    /**
     *
     */
    protected boolean hit;

    /**
     * Constructor de la clase Card.
     *
     * @param text Texto de la carta.
     */
    public Card(String text) {
        this.text = text;
        this.hit = false;
    }

    /**
     * Devuelve el texto de la carta.
     *
     * @return Texto de la carta.
     */
    public String getText() {
        return text;
    }

    /**
     * Cambia el texto de la carta.
     *
     * @param text Texto de la carta.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Devuelve si la carta está emparejada o no.
     *
     * @return True si la carta está emparejada, false si no.
     */
    public boolean isHit() {
        return hit;
    }

    /**
     * Cambia si la carta está emparejada o no.
     *
     * @param hit True si la carta está emparejada, false si no.
     */
    public void setHit(boolean hit) {
        this.hit = hit;
    }

    /**
     * Método que comprueba si dos cartas forman una pareja.
     *
     * @param card Carta a checkear.
     * @return True si hace pareja, false si no.
     */
    public abstract boolean isEquals(Card card);

}
