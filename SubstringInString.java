public class SubstringInString {
    public static void main(String[] args) {
        String str="I have no money at the moment but I will return your money soon";
        String subStr="money";
        substringCount(str,subStr);
    }
    public static void substringCount(String str, String subStr){
        int count=0;
        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++){
            if(subStr.equals(words[i])){
                count++;
            }
        }
        System.out.println("Substring Count is "+count);
    }
}
