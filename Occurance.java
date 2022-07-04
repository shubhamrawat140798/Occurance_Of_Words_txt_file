import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

class Occurance{
    public static void main(String[] args) throws Exception {
        File file =new File("Sample.txt");
        Map<String, String> map = new HashMap<String,String>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str="";
        
        while((str=br.readLine())!=null){
            //System.out.println((i++)+" "+str);
            String words[]=str.split(" ");
            for(int i=0;i<words.length;i++){
                if(map.containsKey(words[i])){
                   Integer n= Integer.parseInt(map.get(words[i]));
                   n++;
                   map.replace(words[i], map.get(words[i]), ""+n);
                }
                else{
                    map.put(words[i],"1");
                }
            }
           
        }
            System.out.println(map);
            br.close();
    }
}
