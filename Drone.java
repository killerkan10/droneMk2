
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

   
class Drone{ 

    static void finalPosition() throws IOException 
    { 
        //String st = "r+-+l++r++l--r--";
        String st;
        String right = "R";
        String left = "L";
        
        String North = "N";
        String East = "E";
        String South = "S";
        String West = "W";
        
        String plus = "+";
        String minus = "-";
        
        int baring = 1;
        int baringHolder = 1;
        int longitude = 0;
        int latitude =0;
        
        File file = new File("C:\\Users\\adam.evans\\Documents\\NetBeansProjects\\Drone\\src\\problem-basic-input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        
       while ((st = br.readLine()) != null){
        
       // String[] splitArray = st.split("");
       // System.out.print(st);
        
      
        String[] splitArray = st.split("");
        System.out.println(Arrays.toString(splitArray));
        //System.out.println("start"+baring);
        
        
        for (int i = 0; i <= splitArray.length - 1; i++) { 
            //System.out.println(i);
            
            
            if(baring == 0){
                baring = 4;
                baringHolder = baring;
                System.out.println("baring reset to 4");
            }else if(baring == 5){
                baring = 1;
                baringHolder = baring;
                System.out.println("baring reset to 1");
            }
            
  
            if (splitArray[i].equals(right)){ 
                baring = baringHolder;          
                System.out.println("baringholder" + baringHolder);
                System.out.println("baring" + baring);
                baring++; 
                baringHolder = baring;
                System.out.println("baring right "+baring);
                
            }else if(splitArray[i].equals(left)){
                baring = baringHolder;           
                baring--;
                baringHolder = baring;
                System.out.println("baring left "+ baring); 
                
                
                
                
                 
            } else if(splitArray[i].equals(North)){
                baringHolder = baring;
                baring = 1;
                System.out.println("Cardinal north "+ baring); 
                
            } else if(splitArray[i].equals(East)){
                baringHolder = baring;
                System.out.println("baringholder" + baringHolder);
                baring = 2;
                System.out.println("Cardinal east "+ baring); 
                
            } else if(splitArray[i].equals(South)){
                baringHolder = baring;
                baring = 3;
                System.out.println("baring holder"+ baringHolder);
                System.out.println("Cardinal south "+ baring);  
                
            } else if(splitArray[i].equals(West)){
                baringHolder = baring;
                baring = 4;
                System.out.println("Cardinal west "+ baring);           
            } 
            
            
            
            
            else if(splitArray[i].equals(plus) && baring == 1){
                longitude++; 
                System.out.println("1 + longitude ="+longitude);
                
            } else if(splitArray[i].equals(plus) && baring == 2){
                latitude++; 
                System.out.println("1 + latitude ="+latitude);
            } 
            else if(splitArray[i].equals(plus) && baring == 3){
                longitude--; 
                System.out.println("1 - longitude ="+longitude);
                
            } else if(splitArray[i].equals(plus) && baring == 4){
                latitude--; 
                System.out.println("1 - latitude ="+latitude);             
            }
            
            
            
            
            else if(splitArray[i].equals(minus) && baring == 1){
                longitude--; 
                System.out.println("1 - longitude ="+longitude);
                
            } else if(splitArray[i].equals(minus) && baring == 2){
                latitude--; 
                System.out.println("1 - latitude ="+latitude);
            } 
            else if(splitArray[i].equals(minus) && baring == 3){
                longitude++; 
                System.out.println("1 + longitude ="+longitude);
                
            } else if(splitArray[i].equals(minus) && baring == 4){
                latitude++; 
                System.out.println("1 + latitude ="+latitude);
            }
            
            
            
            System.out.printf("(%s,%s)\n",latitude,longitude);
            
            
      
        }
        System.out.printf("The final coordinates are (%s,%s)\n",latitude,longitude);
          
       }
    }
  

    public static void main(String[] args) throws IOException 
    { 

        finalPosition(); 
        
        
    } 
} 
