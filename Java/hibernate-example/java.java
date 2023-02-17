class java{
  public static void main(String[] args) {
    int number=153,digit=0,sum=1,total=0;
    int temp=number;
    
    while(number>0){
      int reminder=temp%10;
      temp/=10;
      digit++;
    }
    System.out.println( "length of given number : "+digit);

    temp=number;
    while(number>0){
      int mod=number%10;
      temp/=10;
      for(int i=1;i<digit;i++){
        sum=sum*mod;
      }
    }
    total=total+sum;
    System.out.println("armstrong number: "+total);
  }
}