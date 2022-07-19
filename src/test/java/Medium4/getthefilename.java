package Medium4;

import java.util.Arrays;

public class getthefilename {
    public static String getFilename(String path) {
        String [] arr;
        if(path.contains("/")){
            arr = path.split("/");
           return  arr[arr.length-1];
        }
        return path;
    }

    public static void main(String[] args) {
        System.out.println(getFilename("Users/darkko/Downloads/lombok.jar"));
    }
}
