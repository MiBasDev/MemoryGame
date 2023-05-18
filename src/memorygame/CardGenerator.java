/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 * Interfaz que define el comportamiento de los generadores de cartas.
 *
 * @author Miguel Bastos Gándara.
 */
public interface CardGenerator {

    /**
     * Método que genera cartas aleatorias.
     *
     * @param rows Fila de la carta.
     * @param columns Columna de la carta.
     * @return Array de cartas aleatorio.
     * @throws GenerateCardsException Excepción.
     */
    public Card[][] generateCards(int rows, int columns) throws GenerateCardsException;

}
