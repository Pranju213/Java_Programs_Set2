class StringBasics{
    public static void main(String args[]){
        int n;
        String s="Java Programming",t="",u="";
        System.out.println("String s = "+s);
        System.out.println("The length of String s = "+s.length());
        //Replace string with another word
        t=s.replace("Java","C++");
        System.out.println("The modified string is = "+t);
        //Concatenate the String
        u=t.concat(" is fun");
        System.out.println("After concatenation string is = "+u);
    }
}