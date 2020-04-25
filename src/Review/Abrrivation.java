package Review;


import java.util.ArrayList;
import java.util.List;

public class Abrrivation {
    public static void main(String... args) {
        String states[] = {"Arizona","CA","NY","Nevada"};
        listStates(states,"abb");
        listStates(states,"full");
        listStates(states,"asd");
        System.out.println(returnStateList(states,"abb"));
        System.out.println(returnStateList(states,"full"));
        System.out.println(returnStateList(states,"asd"));
    }
    public static void listStates(String states[],String way){
        if(way.equals("abb")){
            for(String state : states){
                if(state.length()==2){
                    System.out.println(state);
                }
            }
        }
        else if(way.equals("full")){
            for(String state : states){
                if(state.length()>2){
                    System.out.println(state);
                }
            }
        }
        else{
            System.out.println("invalid parameter");
        }
    }
    public static List<String> returnStateList(String states[], String way ){
        List<String> st = new ArrayList<String>();
        if(way.equals("abb")){
            for (String state : states){
                if(state.length()==2){
                    st.add(state);
                }
            }
        }
        else if(way.equals("full")){
            for(String state : states){
                if(state.length()>2){
                    st.add(state);
                }
            }

        }
        else {
            System.out.println("invalid parameter");
        }
        return st;
    }
}




