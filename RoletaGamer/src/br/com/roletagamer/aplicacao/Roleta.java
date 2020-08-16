package br.com.roletagamer.aplicacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * 
 * @author Ricardo França Rodrigues
 */
public class Roleta extends JFrame {

	private Double telaWidth;
	private Double telaHeight;

	public Roleta() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setTelaWidth(screenSize.getWidth());
		setTelaHeight(screenSize.getHeight());
		setSize(getTelaWidth().intValue(), getTelaHeight().intValue());
	}

	public static void main(String[] args) {
		new Roleta().setVisible(true);
	}

	public void paint(Graphics g) {

		try {
			this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("dayz-game_3840x2160.jpg")))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2.setPaint(new GradientPaint(-1200, -1200, Color.BLUE, 1200, 1200, Color.CYAN));
		g2.fillOval(700, 300, 500, 500);
		g2.setColor(Color.BLACK);

		g2.drawOval(700, 300, 500, 500);
	}

	public Double getTelaWidth() {
		return telaWidth;
	}

	public void setTelaWidth(Double telaWidth) {
		this.telaWidth = telaWidth;
	}

	public Double getTelaHeight() {
		return telaHeight;
	}

	public void setTelaHeight(Double telaHeight) {
		this.telaHeight = telaHeight;
	}
}