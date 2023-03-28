package main.java.katas;

import java.util.StringTokenizer;

public class CamelCaser {
    /*
    Complete the method/function so that it converts dash/underscore delimited words into camel casing.
    The first word within the output should be capitalized only if the original word was capitalized
    (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
     */

    public static String toCamelCase(String s){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s, "_-");
        String aux;
        boolean first = true;
        while(st.hasMoreTokens()) {
            aux = st.nextToken();
            if (first) {
                sb.append(aux);
                first = false;
            } else {
                sb.append(aux.substring(0,1).toUpperCase()).append(aux.substring(1));
            }
        }
        return sb.toString();
    }

}
