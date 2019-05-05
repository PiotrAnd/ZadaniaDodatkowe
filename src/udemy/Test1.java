package udemy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Test1 {
    int id;
    public String name;
    public Test1 (int id, String name){
        this.id = id;
        this.name= name;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(" ").append(name);
        return sb.toString();
    }
}
class app {
    public static void main(String[] args) {
        Test1 test = new Test1(8,"Freddy");
        System.out.println(test);
        System.out.println(Long.MAX_VALUE);
        byte as = (byte)129;
        System.out.println(as);
        ArrayList<String> list = new ArrayList<>();
        list.add("Mel");
        list.add("Mel2");
        list.add("Mel3");
        for (String value:list) {
            System.out.println(value);
        }
        File file = new File("text.txt");
        try (BufferedWriter br=new BufferedWriter(new FileWriter(file))){
        br.write("One line");
        br.newLine();
        br.write("Second line");
        br.newLine();
        br.write("Third line");
        br.newLine();
        br.write("Last line");
        } catch (IOException e) {
            System.out.println("Unable to read file: "+file.toString());;
        }
    }

}
