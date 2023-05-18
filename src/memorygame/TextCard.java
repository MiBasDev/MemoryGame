/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 * Clase que implementa una carta de texto.
 *
 * @author Miguel Bastos Gándara.
 */
public class TextCard extends Card {

    /**
     * Constructor de la clase TextCard.
     *
     * @param text Texto de la carta.
     */
    public TextCard(String text) {
        super(text);
    }

    /**
     * Método que comprueba si dos cartas forman una pareja.
     *
     * @param card Carta a checkear.
     * @return True si hace pareja, false si no.
     */
    @Override
    public boolean isEquals(Card card) {
        return super.text.equals(card.getText());
    }

}
