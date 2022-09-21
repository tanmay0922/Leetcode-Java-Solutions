class Solution {
    public String multiply(String num1, String num2) {       
      if(num1.charAt(0) - '0' == 0 || num2.charAt(0) - '0' == 0){
            return "0";
        }
        
        int product = 0;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int[] res = new int[num1.length() + num2.length()];
        
        for(int i = num1.length() - 1; i >= 0; i--){
            for(int j = num2.length() - 1; j >= 0; j--){
                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';
                
                res[i + j] += n1 * n2;
            }
        }
        
        for(int i = res.length - 1; i >= 0; i--){
            product = (res[i] + carry) % 10;
            carry = (res[i] + carry) / 10;
            
            if(i == res.length - 1 && res[i] == 0){
                continue; //avoid leading zero
            }
            sb.append(product);
        }
        
        if(carry != 0){
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}