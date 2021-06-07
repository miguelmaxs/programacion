package dos;

public class Tabla {
private int [][]ArrayBi ;
private int [][] arrayBiRamdon ;

public Tabla () {
	
}

public void CreaRamdon (int SizeFil ,int SizeCol ){
System.out.println("su array es de altura "+SizeCol+" y "+SizeFil+" de anchura");
int [][] ArrayBiRamdon=new int [SizeFil][SizeCol];
int num;	
for (int fila=0;fila<ArrayBiRamdon.length;fila++) {
	for(int columna=1;columna<ArrayBiRamdon[fila].length;columna++) {
num=(int)(Math.random()*10+1);	
ArrayBiRamdon[fila][columna]=num;

		
	}
}
	
}

public void muestra (int [][] ArrayBiRamdon) {
	for (int fila=0;fila<ArrayBiRamdon.length;fila++) {
		for(int columna=0;columna<ArrayBiRamdon[fila].length;columna++) {

	System.out.println(ArrayBiRamdon [fila][columna]);
		
		}}}
	
}
