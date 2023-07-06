package com.epam.mjc;

import java.util.*;

public class  StringSplitter {

    /**
     * Splits given string applying all delimeters to it. Keeps order of result substrings as in source string.
     *
     * @param source source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
        ArrayList<String> result = new ArrayList<>();
        result.add(source);
        ArrayList<String> resultCopy = new ArrayList<>();
        for (String k:delimiters){
            for (int i=0;i< result.size();i++){
                StringTokenizer strings = new StringTokenizer(result.get(i), k);
                while (strings.hasMoreTokens()){
                    resultCopy.add(strings.nextToken());
                }
            }
            result.clear();
            for (int i=0;i<resultCopy.size();i++){
                result.add(resultCopy.get(i));
            }
            resultCopy.clear();
        }
        return result;
    }

    public static void main(String[] args) {
        StringSplitter ss = new StringSplitter();
        System.out.println(ss.splitByDelimiters("qw3e1rt4yu2i3opa1sd1fg2hj4kl", List.of("1", "2", "3")).toString());
    }
}
