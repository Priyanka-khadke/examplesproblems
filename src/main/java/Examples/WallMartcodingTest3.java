package Examples;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WallMartcodingTest3 {

    /*1. Count no. of test passed for each service

    Input: Service1-Feature1-Passed Service1-Feature2-Failed Service2-Feature1-Passed Service2-Feature2-Passed
    Output: Service1- 1/2 Service2- 2/2*/


    public static void main(String[] args) {
        getRequiredOutput("Service1-Feature1-Passed Service1-Feature2-Failed Service2-Feature1-Passed Service2-Feature2-Passed Service2-Feature3-Passed Service3-Feature1-Passed Service3-Feature2-Failed");

    }

    public static void getRequiredOutput(String input){
        String[] split = input.split(" ");
        int pass = 0;
        int tests = 0;
        int service2Pass =0;
        int service2Tests=0;
        Map<String, List<Integer>>hm = new HashMap<>();
        for(String s:split) {
            String[] split1 = s.split("-");
            if(hm.containsKey(split1[0])){
                if(split1[2].equalsIgnoreCase("passed")){
                    List<Integer>res = hm.get(split1[0]);
                    res.set(0, res.get(0)+1);
                    res.set(1, res.get(1)+1);
                    hm.put(split1[0],res);
                } else {
                    List<Integer> res = hm.get(split1[0]);
                    res.set(1, res.get(1) + 1);
                    hm.put(split1[0], res);
                }


            }else {
                List<Integer> arry = new ArrayList<Integer>();
                arry.add(1);
                arry.add(1);
                hm.put(split1[0], arry);
            }
        }



            /*if(s.contains("Service1-")){
                if(s.contains("Passed")){
                    pass++;
                }tests++;

            }

            else if(s.contains("Service2-")){

                if(s.contains("Passed")){
                    service2Pass++;
                }service2Tests++;

            }


        }System.out.println("Service1-"+pass+"/"+tests);
        System.out.println("Service2-"+service2Pass+"/"+service2Tests);*/


        System.out.println(hm);

    }




}
