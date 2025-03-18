    package Conditional;

    public class Conditional {
        public static void main(String[] args) {
            // boolean rain = false;
            // boolean umbrella = true;

            // // String output = rain == true && umbrella == false ? "go out" : "cannot go out";
            // String output = rain==false ? "go out": umbrella==true ? "go out" : "can not go out";
            // System.out.println(output);

            int a = 10;
            int b = 0;
            char symbol = '/';
            switch (symbol) {
                case'+': System.out.println(a+b);
                    break;

                case'-': System.out.println(a-b);
                    break;

                case'*': System.out.println(a*b);
                    break;

                case'/': if(b==0){
                    System.out.println("it's not devisible");
                }else{
                    System.out.println(a+b);
                };
                    break;

                case'%':  if(b==0){
                    System.out.println("it's not devisible");
                }else{
                    System.out.println(a%b);
                };
                    break;
            
                default:System.out.println("Please Enter Valid value");
                    break;
            }


        }
    }
