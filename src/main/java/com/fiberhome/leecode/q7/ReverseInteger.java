package com.fiberhome.leecode.q7;

public class ReverseInteger {
    public int reverse(int x) {

        String s = String.valueOf(x);
        int length = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        int endIndex = 0;
        if(x<0){
            endIndex=1;
            stringBuilder.append("-");
        }
        for(int i = length-1;i>=endIndex;i--){
            stringBuilder.append(s.charAt(i));
        }

        int result;
        try {
            result = Integer.valueOf(stringBuilder.toString());
        }catch (Exception e){
            result = 0;
        }

        return result;

    }
}
