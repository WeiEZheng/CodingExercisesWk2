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

  }
  
  void soln11() {

  }
  
  void soln12() {
  // and put your code here.
  }
  
  void soln13() {
  // and put your code here.
  }
  
  void soln14() {
  // and put your code here.
  }
  
  void soln15() {
  // and put your code here.
  }
  
  void soln16() {
  // and put your code here.
  }
  
  void soln17() {
  // and put your code here.
  }
  
  void soln18() {
  // and put your code here.
  }
  
  void soln19() {
  // and put your code here.
  }
  
  void soln20() {
  // and put your code here.
  }
  
  void soln21() {
  // and put your code here.
  }
  
  void soln22() {
  // and put your code here.
  }
  
}
