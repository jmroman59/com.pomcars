package utilities;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.How;
import pages.HondaSearchPage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Condition {

    /***
     * This method return car stock parameter from Condition.json
     * @param condition
     * @throws IOException
     */
    public String getCarStockType(String condition) {
        File file = new File("src//test//resources//data//parameters.json");
        String userJSON = null;
        try {
            userJSON = new String(FileUtils.readFileToByteArray(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();

        Map map = gson.fromJson(userJSON, Map.class);
        List<Map<String, String>> users = new ArrayList<>();
        users.add((Map<String, String>) map.get(condition));

        return users.get(0).get("selectCondition");
    }

    /***
     * This method return car stock parameter from Condition.json
     * @param condition
     * @throws IOException
     */
    public String getCarStock(String condition) {
        File file = new File("src//test//resources//data//parameters.json");
        String userJSON = null;
        try {
            userJSON = new String(FileUtils.readFileToByteArray(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();

        Map map = gson.fromJson(userJSON, Map.class);
        List<Map<String, String>> users = new ArrayList<>();
        users.add((Map<String, String>) map.get(condition));

        return users.get(0).get("condition");
    }

    /***
     * This method return car make parameter from Condition.json
     * @param condition
     * @throws IOException
     */
    public String getCarMake(String condition) {
        File file = new File("src//test//resources//data//parameters.json");
        String userJSON = null;
        try {
            userJSON = new String(FileUtils.readFileToByteArray(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();

        Map map = gson.fromJson(userJSON, Map.class);
        List<Map<String, String>> users = new ArrayList<>();
        users.add((Map<String, String>) map.get(condition));

        return users.get(0).get("make");
    }

    /***
     * This method return car model parameter from Condition.json
     * @param condition
     * @throws IOException
     */
    public String getCarModel(String condition) {
        File file = new File("src//test//resources//data//parameters.json");
        String userJSON = null;
        try {
            userJSON = new String(FileUtils.readFileToByteArray(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();

        Map map = gson.fromJson(userJSON, Map.class);
        List<Map<String, String>> users = new ArrayList<>();
        users.add((Map<String, String>) map.get(condition));

        return users.get(0).get("model");
    }

    /***
     * This method return car price parameter from Condition.json
     * @param condition
     * @throws IOException
     */
    public String getCarPrice(String condition) {
        File file = new File("src//test//resources//data//parameters.json");
        String userJSON = null;
        try {
            userJSON = new String(FileUtils.readFileToByteArray(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();

        Map map = gson.fromJson(userJSON, Map.class);
        List<Map<String, String>> users = new ArrayList<>();
        users.add((Map<String, String>) map.get(condition));

        return users.get(0).get("price");
    }

    /***
     * This method return car radius parameter from Condition.json
     * @param condition
     * @throws IOException
     */
    public String getCarRadius(String condition) {
        File file = new File("src//test//resources//data//parameters.json");
        String userJSON = null;
        try {
            userJSON = new String(FileUtils.readFileToByteArray(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();

        Map map = gson.fromJson(userJSON, Map.class);
        List<Map<String, String>> users = new ArrayList<>();
        users.add((Map<String, String>) map.get(condition));

        return users.get(0).get("radius");
    }

    /***
     * This method return car zip parameter from Condition.json
     * @param condition
     * @throws IOException
     */
    public String getCarZip(String condition) {
        File file = new File("src//test//resources//data//parameters.json");
        String userJSON = null;
        try {
            userJSON = new String(FileUtils.readFileToByteArray(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();

        Map map = gson.fromJson(userJSON, Map.class);
        List<Map<String, String>> users = new ArrayList<>();
        users.add((Map<String, String>) map.get(condition));

        return users.get(0).get("zip");
    }
}














