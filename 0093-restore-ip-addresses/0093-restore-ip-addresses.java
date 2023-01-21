class Solution {
    public static List<String> restoreIpAddresses(String s) {
      /*  List<String> addresses = new ArrayList<>();
        List<String> address = new ArrayList<>();
        rec(s, 0, address, addresses);
        return addresses;
    }
    private static void rec(String s, int i, List<String> address, List<String> addresses) {
        if (address.size() == 4) {
            if (i == s.length()) {
                addresses.add(String.join(".", address));
            }
        } else {
            for (int j = i + 1; j <= i + 3 && j <= s.length(); j++) {
                String nextInt = s.substring(i, j);
                if (Integer.parseInt(nextInt) <= 255 && (nextInt.equals("0") || !nextInt.startsWith("0"))) {
                    address.add(nextInt);
                    rec(s, j, address, addresses);
                    address.remove(address.size() - 1);
                }
            }
        }
    }
}*/
        List<String>al=new ArrayList<>();
        if(s.length()>12) return al;
        help(0,s,al,new ArrayList<>());
        return al;
    }
    public static void help(int ind,String s,List<String>al,ArrayList<String>ds){
        if(ind==s.length()&&ds.size()==4){
            al.add(String.join(".",ds));
            return;
        }
        for(int i=1;i<=3;i++){
            if(ind+i>s.length()) return;
            String add=s.substring(ind,ind+i);
            if(!(add.charAt(0)=='0'&&add.length()>1||Integer.parseInt(add)>255)){
                ds.add(add);
                help(ind+i,s,al,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
}