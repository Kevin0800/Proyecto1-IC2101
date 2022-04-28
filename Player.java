package logic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 * Esta clase contiene todos los metods que necesita el jugador para ejecutar
 * sus turnos
 * 
 * @author Kevin Melendez
 * @author Joseph Rojas
 *
 */
public class Player {
	public ArrayList<Color> colorTokens = new ArrayList<Color>();
	protected Random randomColor = new Random();
	protected ArrayList<Color> availableColor = new ArrayList<Color>();

	public Player() {
		this.availableColor.add(Color.green);
		this.availableColor.add(Color.yellow);
		this.availableColor.add(new Color(51, 204, 255));
		this.availableColor.add(Color.orange);
		this.availableColor.add(new Color(138, 43, 226));
	}

	public void makeCode() {

		this.colorTokens.add(this.availableColor.get(randomColor.nextInt(4)));
		this.colorTokens.add(this.availableColor.get(randomColor.nextInt(4)));
		this.colorTokens.add(this.availableColor.get(randomColor.nextInt(4)));
		this.colorTokens.add(this.availableColor.get(randomColor.nextInt(4)));
	}

	/**
	 * 
	 * @return devuelve el color de las fichas del jugador
	 */
	public ArrayList<Color> getTokens() {
		return this.colorTokens;

//	public ArrayList<ClueToken> getClueToken(){
//		return this.clueTokens;
	}
}
