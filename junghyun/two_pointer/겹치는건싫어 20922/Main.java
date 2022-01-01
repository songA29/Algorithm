import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size, time,answer;
        ArrayList<Integer> list= new ArrayList<Integer>();

        size = in.nextInt();
        time = in.nextInt();

        for(int i=0; i<size; i++){
            list.add(in.nextInt());

        }
        answer = getAnswer(list,time);
        System.out.println(answer);

    }
    public static int getAnswer(ArrayList<Integer> list,int time){
        int answer=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i:list){
            map.put(i,0);
        }

        for (int e: list) {
            map.put(e,map.get(e)+1);
            if(map.get(e)>time){
                break;
            }
           answer+=1;
        }
        return answer;
    }
    }

