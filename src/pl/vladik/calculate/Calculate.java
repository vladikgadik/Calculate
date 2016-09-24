
package pl.vladik.calculate;
/**
* Calculate Класс для вычисления арифметических операций + - * / ^
* @author vladikgadik
* @since 15.08.2016
* @versoin 1
*/

      public class Calculate{
		private double result;
		
		public double result (){
			return this.result;
		}
		
		
		
		/**
		* Вычисляем сложение.
		* @param first первый аргумент
		* @param second второй аргумент
		*/
		public void add(double first,double second){
			this.result = first + second;
		}
		
		/**
		* Вычисляем вычитание.
		* @param first первый аргумент
		* @param second второй аргумент
		*/
		public void substract(double first,double second){
			this.result = first - second;
		}
		
		/**
		* Вычисляем уможение.
		* @param first первый аргумент
		* @param second второй аргумент
		*/
		public void multiple(double first,double second){
			this.result = first * second;
		}
				
		
		/**
		* Вычисляем деление.Метод выкинет исключение если второй аргумент 0.
		* @param first первый аргумент
		* @param second второй аргумент
		*/
		public void div(double first,double second){
			if (second != 0d){
				this.result = first / second;
			}else{
				throw new ArithmeticException("Cound not by 0");
			}	
		}
		
		/**
		* Вычисляем возведение в степень.
		* @param first первый аргумент
		* @param second второй аргумент
		*/
		public void expand(double first,int second){
			double temp = first;
			for(int index = 0;index != second;++index){
				temp *= first;
			}
			this.result = temp;
		}
		
		/**
		* Вычисляем арифметическую операцию на основании входных значений.
		* @param operation операция + - * / ^
		* @param first первый аргумент
		* @param second второй аргумент
		*/
		public void calc(String operation,double first,double second){
			if ("+".equals(operation)){
				this.add(first,second);
			}else if ("-".equals(operation)){
				this.substract(first,second);
			}else if ("*".equals(operation)){
				this.multiple(first,second);
			}else if ("/".equals(operation)){
				this.div(first,second);
			}else if ("^".equals(operation)){
				this.expand(first,(int)second);
			}else {
				throw new UnsupportedOperationException();
			}
				
		}
				
}