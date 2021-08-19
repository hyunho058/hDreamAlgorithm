package short_term_growth.normal_backpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * No.12865
 * https://www.acmicpc.net/problem/12865
 *
 * @author hyunho
 * @since 2021/08/19
 **/
public class Hyunho {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int k = 0;
        List<BackValue> backValues = new ArrayList<>();
        String[] nkValue = br.readLine().split(" ");
        n = Integer.parseInt(nkValue[0]);
        k = Integer.parseInt(nkValue[1]);

        for (int i = 0; i < n; i++) {
            String[] value = br.readLine().split(" ");
            backValues.add(i, new BackValue(Integer.parseInt(value[0]), Integer.parseInt(value[1])));
        }

        System.out.println(calcMaxValue(k, backValues));
    }

    static int calcMaxValue(int k, List<BackValue> dataList) {
        int maxValue = 0;
        int tempValue = 0;
        int sumWeight = 0;
        for (int i = 0; i < dataList.size(); i++) {
            tempValue = dataList.get(i).v;
            sumWeight = dataList.get(i).w;
            for (int j = i+1; j < dataList.size(); j++){
                int weight = dataList.get(j).w;
                if (weight < k+1){
                    if (sumWeight + weight < k+1){
                        sumWeight += weight;
                        tempValue += dataList.get(j).v;
                    }
                }
            }
            if (maxValue < tempValue){
                maxValue = tempValue;
            }
        }
        return maxValue;
    }

    static class BackValue {
        int w = 0;
        int v = 0;

        public BackValue(int w, int v) {
            this.w = w;
            this.v = v;
        }
    }
}
