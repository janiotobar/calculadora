package main;
import javax.swing.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int op=0;
        double n1,n2,s,m,d,r,ra,p=1,l,f=1;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("\nCalculadora\n"+
            "************************\n"+
            "[1] SUMAR\n"+
            "[2] RESTAR\n"+
            "[3] MULTIPLICAR\n"+
            "[4] DIVIDIR\n"+
            "[5] RADICACION\n"+
            "[6] POTENCIA\n"+
            "[7] LOGARITMO\n"+
            "[8] FACTORIAL\n"+
            "[9] SALIR\n"+
            "Ingresa una opcion:\n\n"));

            switch(op)
            {
            	case 1:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    s=n1+n2;
                    JOptionPane.showMessageDialog(null,"La suma es:"+s);
                    break;
		
		case 2:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    r=n1-n2;
                    JOptionPane.showMessageDialog(null,"La resta es:"+r);
                    break;
                
                case 3:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    m=n1*n2;
                    JOptionPane.showMessageDialog(null,"La multiplicacion es:"+m);
                    break;
                
                case 4:
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 2"));
                    d=n1/n2;
                    JOptionPane.showMessageDialog(null,"La division es:"+d);
                    break;
                    
                case 5:
            		n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero"));
            		n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese radical"));
            		ra = Math.pow(n1,1/n2);
            		JOptionPane.showMessageDialog(null,"El radical es:"+ra);
            		break;    
                    
            	
            }
	  }while(op!=9);
	}

}
