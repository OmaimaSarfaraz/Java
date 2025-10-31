class RevStr{public static void main(String[]a){
    String s="hello",r="";
    for(int i=s.length()-1;i>=0;i--)
        r+=s.charAt(i);
    System.out.println(r);
    }
}