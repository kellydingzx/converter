public class Cal {
    private String sign;
    private String exponent;
    private String mantissa;
    private int exponent_int;
    //IEEE single precision
    //1 bit sign, 8 bit exponent, 23 bit mantissa
    public Cal(String binary){
        this.sign = binary.substring(0,1);
        this.exponent = binary.substring(1,9);
        this.mantissa = binary.substring(9);
        this.exponent_int = Integer.parseInt(exponent,2) - 127;
    }

    public void get_binary_float(){
        System.out.println(
                "1" + mantissa.substring(0,exponent_int) + "." + mantissa.substring(exponent_int)
        );
    }

}
