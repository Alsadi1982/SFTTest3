import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        int result = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader("02.txt"))){

            String str;
            while ((str = reader.readLine()) != null){

                List<Integer> data = new ArrayList<>();
                String[] numStr = str.split("\\s+");

                for (String elem: numStr) {
                    int num = Integer.parseInt(elem);
                    data.add(num);
                }

                int number = 0;
                for (int i = 0; i < data.size(); i++){
                    for (int j = i + 1; j < data.size() ; j++){
                        
                        if ( data.get(i) > data.get(j)){
                            if (data.get(i)%data.get(j) == 0){
                            number = data.get(i)/data.get(j);
                            result += number;
                            }
                        }else {
                            if (data.get(j) % data.get(i) == 0) {
                                number = data.get(j) / data.get(i);
                                result += number;
                            }
                        }
                    }
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result);

    }
}
