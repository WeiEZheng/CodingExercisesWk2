public class Solution {
  
  // use this method as a prototype for your answers...
  void soln1() {
    for (int i = 100; i>=5; i-=5){
      System.out.println(i);
    }
  }
  
  void soln2() {for (int i=100; i>=5;i-=5){}}
  
  void soln3() {
    int sum=0;
    for (int i =9;i<=17;i++){sum+=i}
  }
  
  void soln4() {
    int [] a = {9, 5, 6, 3, 8, 2, 4};
    int Smallnum=a[0];
    for (int i =1;i< a.length;i++){
      if (a[i]<Smallnum) Smallnum=a[i];
    }
    System.out.println(Smallnum);
  }
  
  void soln5() {
    int [] a = {9, 5, 6, 3, 8, 2, 4};
    int largenum=a[0];
    for (int i =1;i< a.length;i++){
      if (a[i]>largenum) largenum=a[i];
    }
    System.out.println(largenum);
  }
  
  void soln6() {
    Boolean [] a ={false, false, false, true, false};
    int index=0;
    for (int i=0;i<a.length;i++){
      if (a[i]==true) {
        System.out.println(index);
        break;
      }
    }

  }
  
  void soln7() {
    Boolean [] a = {false, false, false, true, false};
    int index=0;
    while (a[index]==false){
      index++;
    }
    System.out.println(index);
  }
  
  void soln8() {
    int[]  a = {9, 5, 6, 3, 8, 2, 4};
    for (int i=0;i<a.length;i++){
      a[i]+=5;
    }
  }
  
  void soln9() {
    double[] a = {0.5, 1.4, 6.7, 123.4 -34.6};
    for (int i=0; i<a.length;i++){
      a[i]/=1.3;
    }
  }
  
  void soln10() {
    double[] a = {1.3, 5.4, 6.1, 1.0, 9.2};
    for  (int i=0; i<a.length;i++)
      a[i]=(Math.pow(a[i],3)-a[i])/(a[i]/3);
  }
  
  void soln11() {
    int [][] a = new int[4][6];
    for (int i=0;i<a.length;i++){
      for (int j=0;i<a[0].length;i++){
        a[i][j]=0;
      }
    }
  }
  
  void soln12() {
    int [][] a = new int[5][5];
    for (int i=0;i<a.length;i++){
      for (int j=0;i<a[0].length;i++){
        a[i][j]*=7;
      }
    }
  }
  
  void soln13(int[][] a) {
    boolean[][] even =new boolean[a.length][a[0].length];
    for (int i=0;i<a.length;i++){
      for (int j=0;i<a[0].length;i++){
        if (a[i][j]%2==0){
          even[i][j]=true;
        }
      }
    }
  }
  void soln14() {
    // create a method that takes two doubles and returns the first parameter raised to the second parameter's value
    return Math.pow(firstPerm,secondPerm);
  }

  void soln15() {
    // create a method that returns a boolean if the Object passed to it is a Fish or not
    return Object instanceof Fish;
  }
  //study
  void soln16() {
    // There is an object x which has a method (double)Balance().
    // Build an IF statement that prints "Paid Off" if the result of the balance call is less than of equal to 1.0,
    // else it prints the balance as a Dollar figure (2 decimal places)

    if (balance <= 1.0){
      System.out.println("Paid Off");
    }else {
      System.out.println(String.format("%.2f", balance));
    }
  }

  void soln17() {
    // Build a WHILE loop that turns on the heat
    // if the thermo.getTemp() is less than 72.0 else it turns on the A/C if thermo.getTemp() is greater that 76.0.

    while (true) {
      if (temp > 76) {
        method acOn
      } else if {
        (temp < 72) {
          method heatOn
        }
      }
    }
  }

  void soln18() {
    // Find a number greater than Pi in a double array, print number and its index.
    double pi = Math.PI;
    for (int i = 0; i<a.length; i++) {
      if (a[i] > pi) {
        System.out.println(a[i] +" at index "+ i);
        break;
      }
    }
  }

  void soln19() {
    // Given an array of objects (of class Xaction) w/nulls,
    // sum all the values of the objects in the array, using Xaction::getValue(). Print the sum.
    for (int i = 0; i<a.length; i++) {
      if (array[i] != null) {
        sum += i;
      }
      return sum;
    }
  }

  void soln20() {
    // reverse an array of objects of type Xaction
    String[] reverse = new String[array.length];
    for (int i = 0; i <= array.length/2 ; i++) {
      reverse[i] =array[array.length - i - 1];
      reverse[reverse.length - i - 1] = array[i];
    }
    return reverse;
  }

  void soln21() {
    // Print a 5's times table
    String table = "";
    if (int i= 0; i < 6; i++){
      if int j =0; i < 6; j++){
        table = i*j;
      }table += "\n";
    }return table;
  }

  void soln22() {
    //detemine the hypotenuse of a 9 by 7 right triangle, assign it to a double
    return math.pow(9,2.0) + math.pow(7,2.0) }
}