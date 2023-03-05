package view;

import javax.swing.JOptionPane;

import controller.modulos;

public class main {

	public static void main(String[] args) {
		modulos mod = new modulos();
		int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número "));
		while(x >10 || x < 0 ) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número até 10 "));
		}
		double res = mod.serie(x);
		System.out.println(res);
	}

}
