/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;


public class Function {
    static Integer count;
    
    public Function(){ this.count = 0;  }
    
    public double fun(double x) 
   {
   
   this.count++;    
   return (Math.pow(x,3) - 3 * Math.pow(x,2) - 9*x + 15 );
   
   }
    
}
