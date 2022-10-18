class Solution {
    public String countAndSay(int n) {
        /*String ans="1";
        for(int i=2;i<=n;i++){
            String lastString=ans;
            int l=ans.length();
            int j=0;
            ans="";
            while(j<l){
                int count=j;
                while(j<l&& String.charAt[j]==String.charAt[count])
                {
                    count++;
                }
                ans+=to_string(count-j)+ lastString[j];
                j=count;
            }
        }
        return ans;
    }
}
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            sb = getNextState(sb);
        }
        return sb.toString();
    }

    private StringBuilder getNextState(StringBuilder curSb) {
        StringBuilder nextSb = new StringBuilder();
        int len = curSb.length();
        int i = 0;
		
        while (i < len) {
            char c = curSb.charAt(i++);
            int count = 1;
            while (i < len && c == curSb.charAt(i)) {
                count++;
                i++;
            }
            nextSb.append(count).append(c);
        }
		
        return nextSb;
    }
}*/
        if (n == 1) return "1";
        String s = countAndSay(n - 1);

        //say
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) count++;
            else{
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        sb.append(count).append(s.charAt(s.length() - 1));
        return sb.toString();
    }
    }