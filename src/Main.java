import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        StringBuilder ret = new StringBuilder();
        process(N, M, "", ret);
        System.out.println(ret);
        return;
    }

    public static void process(int N, int M, String str, StringBuilder ret){
        //base case
        if(str.length() == M * 2){
            ret.append(str + "\n");
            return;
        }
        //recursion
        for(int a = 1; a <= N; a++){
            if(str.contains(Integer.toString(a)))continue;
            str += a + " ";
            process(N, M, str, ret);
            str = str.substring(0, str.length() -2);
        }
    }
}
