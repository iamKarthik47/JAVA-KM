import java.util.*;


class StringManip{
       
        public static void main(String[] args)
          {
            char ch[]={'w','e','l','c','o','m','e'};
            String newstr=new String(ch);
            System.out.println("The New String with new operator is : "+newstr);
            byte asciii[]={65,66,67,68,69};
            newstr=new String(asciii);
            System.out.println("The byte ascii :"+newstr);
            String s1="GOOD";
            String s2=" MORNING";
            String s4="good";
            String s5="have a nice day";
            String s3=s1.concat(s2);
            System.out.println("LENGTH OF STRING S1 IS :"+s1.length()); 
            System.out.println("LENGTH OF STRING S2 IS :"+s2.length()); 
            System.out.println("CONCATENATION OF S1 AND S2 IS :"+s1.concat(s2));
            System.out.println("CONCATENATION USING + OPERATOR : "+(s1 + s2));
            System.out.println("TO LOWER CASE OF S1 :"+s1.toLowerCase());
            System.out.println("TO LOWER CASE OF S2 :"+s2.toLowerCase());
            System.out.println("TO UPPERCASE OF S1 :"+s1.toUpperCase());
            System.out.println("TO UPPERCASE OF S2 :"+s2.toUpperCase());
            System.out.println("CHARACTER AT STRING 3 OF S1 :"+s1.charAt(3));
            System.out.println("CHARACTER AT STRING 5 OF S2 :"+s2.charAt(5));
            char[] c=new char[20];
            s3.getChars(1,6,c,0);
            System.out.println("GET CHARACTERS FROM A STRING USING getChars :"+new String(c));
            System.out.println("USING EQUALS :"+s1.equals(s4));
            System.out.println("USING EQUALS IGNORE CASE : "+s1.equalsIgnoreCase(s4));
            System.out.println("USING COMPARES TO : "+s1.compareTo(s4));
            System.out.println("USING COMPARES TO IGNORE CASE : "+s1.compareToIgnoreCase(s4));
            System.out.println("USING INDEX OF : "+s5.indexOf("nice"));
            System.out.println("USING SUBSTRING : "+s5.substring(7));
            System.out.println("USING REPLACE : "+s5.replace("nice",s4));
            System.out.println("USING STARTS WITH : "+s4.startsWith("g"));
            float n=77.6f;
            System.out.println("USING VALUE OF : "+String.valueOf(n));
            }
            }
