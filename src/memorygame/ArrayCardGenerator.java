/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorygame;

/**
 * Clase que genera cartas.
 *
 * @author Miguel Bastos Gándara.
 */
public class ArrayCardGenerator implements CardGenerator {

    // Arrays coa información para as cartas
    private static final String[] words = new String[]{"Elefante", "Pataca", "Pera"};
    private static final int[] operators1 = new int[]{3, 5, 6};
    private static final int[] operators2 = new int[]{9, 5, 3};
    private static final char[] operations = new char[]{MathCard.SUM, MathCard.MULT, MathCard.SUB};

    /**
     * Método que genera cartas aleatorias.
     *
     * @param rows Fila de la carta.
     * @param columns Columna de la carta.
     * @return Array de cartas aleatorio.
     * @throws GenerateCardsException Excepción.
     */
    @Override
    public Card[][] generateCards(int rows, int columns) throws GenerateCardsException {
        if (rows * columns > 12) {
            throw new GenerateCardsException("Se queres tantas cartas, debes mercar a versión PRO");
        }
        Card[][] cards = new Card[rows][columns];
        int countPairs = rows * columns / 2;
        for (int i = 0, index = 0; i < countPairs; i++) {
            Card[] cardPair = new Card[2];
            if (i < countPairs / 2) {
                cardPair[0] = new TextCard(words[i]);
                cardPair[1] = cardPair[0];
            } else {
                cardPair[0] = new MathCard(operators1[index], operators2[index], operations[index], MathCard.CARD_OPERATION);
                cardPair[1] = new MathCard(operators1[index], operators2[index], operations[index], MathCard.CARD_RESULT);
                index++;
            }
            insertPair(cardPair, cards, rows, columns);
        }
        return cards;
    }

    /**
     * Inserta un array de duas cartas aleatoriamente nun array bidimensional de
     * cartas que ten o número de filas e de columnas indicado
     *
     * @param cardPair Array con dúas cartas
     * @param cards Array bidimensional no que se queren colocar as cartas
     * @param rows Número de filas
     * @param columns Número de columnas
     */
    private void insertPair(Card[] cardPair, Card[][] cards, int rows, int columns) {
        // Recorremos o array co par de cartas para colocar as dúas cartas
        for (int i = 0; i < 2; i++) {
            boolean cardInserted = false;
            do {
                // Xeramos aleatoriamente unha fila e unha columna para colocar
                // a carta
                int row = new java.util.Random().nextInt(rows);
                int column = new java.util.Random().nextInt(columns);
                // Se na posición xerada non hai ningunha carta, colocamos
                // a carta nesa posición e marcamos que está insertada
                if (cards[row][column] == null) {
                    cards[row][column] = cardPair[i];
                    cardInserted = true;
                }
            } while (!cardInserted);
        }
    }

}
