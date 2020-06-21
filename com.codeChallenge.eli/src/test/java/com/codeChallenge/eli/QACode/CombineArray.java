package com.codeChallenge.eli.QACode;

import java.util.Arrays;

public class CombineArray {

    public static void main(String args[]) {
      
        int [] a = {1,2,3, 4};
        int [] b = {5,6,7,8};
      
        
            int length = a.length + b.length;
            int[] result = new int[length];
            System.arraycopy(a, 0, result, 0, a.length); //a:copied object; 0: index of where start to copy; destination; index at destination; length of a
            System.arraycopy(b, 0, result, a.length, b.length);
            
            Arrays.sort(result);
            System.out.println(Arrays.toString(result));
            
            String[] c = { "Apr", "May", "Jun", "Jul","aug", "Sep"};
            String[] d = { "Jan", "Feb", "Mar","Oct", "Nov", "Dec"};
            int size = c.length + d.length;
            String[] output = new String[size];      // new array that store two array
            System.arraycopy(c, 0, output, 0, c.length);
            System.arraycopy(d, 0, output, c.length, d.length);
            System.out.println(Arrays.toString(output));
            
        }


    
    }

