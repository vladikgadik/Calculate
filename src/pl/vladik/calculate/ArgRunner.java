
package pl.vladik.calculate;

/**
* Калькулятор данные вводятся через консоль.
* @author vladikgadik
* @since 16.08.2016
*/

public class ArgRunner {
	public static void main(String[] args){
		 Calculate calculate = new Calculate();
		calculate.calc(args[1],Double.valueOf(args[0]),Double.valueOf(args[2]));
		System.out.println(String.format("%s %s %s = %s",args[0],args[1],args[2],calculate.result()));
				
	}	
}

