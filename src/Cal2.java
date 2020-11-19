public class Cal2 {

    public void dec_to_bin(Double dec){
        long bin = Double.doubleToLongBits(dec);
        String str = Long.toBinaryString(bin);
        System.out.println(str);
//        cal2(str);
    }
    public void cal2(String str){
        int decimal_pt_index = str.indexOf(".");
        String whole = str.substring(0,decimal_pt_index);
        String dec = str.substring(decimal_pt_index+1);
        int exponent = whole.length()-1 + 127;
        String exponent_part = Integer.toBinaryString(exponent);
        if(exponent_part.length()<8){
            exponent_part = "0".repeat(8-exponent_part.length()) + exponent_part;
        }
        String mantissa = whole.substring(1) + dec;
        if(mantissa.length() < 23){
            mantissa = mantissa + "0".repeat(23-mantissa.length());
        }
        String bin_str = "0" + exponent_part + mantissa;
        int bin_str_dec = Integer.parseInt(bin_str,2);
        String hex = Integer.toHexString(bin_str_dec);
        System.out.println(hex);
    }
}
