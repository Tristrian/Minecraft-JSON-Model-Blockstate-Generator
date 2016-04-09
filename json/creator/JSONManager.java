package json.creator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AlmeidaCorreiaT
 */
public class JSONManager {

    public JSONManager() {
    }

    public void JSONCreate(String type, String genericName, String modID) {
        switch (type) {
            case "Simple Item":
                simpleItemCreate(modID, genericName);
                break;
            case "Stick Item":
                stickItemCreate(modID, genericName);
                break;
            case "Simple Block":
                simpleBlockCreate(modID, genericName);
                break;
        }
    }
    
    public void simpleItemCreate(String modId, String genericName){
        PrintWriter out = null;
        try {
            String s = "{\n" +
"	\"parent\": \"builtin/generated\",\n" +
"	\"textures\": {\n" +
"		\"layer0\": \""+modId+":items/"+genericName+"\"\n" +
"	},\n" +
"	\"display\": {\n" +
"		\"thirdperson\": {\n" +
"			\"rotation\": [-90, 0, 0],\n" +
"			\"translation\": [0, 1, -3],\n" +
"			\"scale\": [0.55, 0.55, 0.55 ]\n" +
"		},\n" +
"		\"firstperson\": {\n" +
"			\"rotation\": [0, -135, 25 ],\n" +
"			\"translation\": [0, 4, 2 ],\n" +
"			\"scale\": [1.7, 1.7, 1.7]\n" +
"		}\n" +
"	}\n" +
"}";
            File file = new File(".\\export\\"+modId+"\\models\\item\\"+genericName+".json");
            file.getParentFile().mkdirs();
            out = new PrintWriter(file);
            out.println(s);
            out.close();
            out = null;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JSONManager.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(out != null){
                out.close();
                out = null;
            }
        }
    }
    
    public void stickItemCreate(String modId, String genericName){
                PrintWriter out = null;
        try {
            String s = "{\n" +
"    \"parent\": \"builtin/generated\",\n" +
"    \"textures\": {\n" +
"        \"layer0\": \""+modId+":items/"+genericName+"\"\n" +
"    },\n" +
"    \"display\": {\n" +
"        \"thirdperson\": {\n" +
"            \"rotation\": [ 0, 90, -35 ],\n" +
"            \"translation\": [ 0, 1.25, -3.5 ],\n" +
"            \"scale\": [ 0.85, 0.85, 0.85 ]\n" +
"        },\n" +
"        \"firstperson\": {\n" +
"            \"rotation\": [ 0, -135, 25 ],\n" +
"            \"translation\": [ 0, 4, 2 ],\n" +
"            \"scale\": [ 1.7, 1.7, 1.7 ]\n" +
"        }\n" +
"    }\n" +
"}\n" +
"";
            File file = new File(".\\export\\"+modId+"\\models\\item\\"+genericName+".json");
            file.getParentFile().mkdirs();
            out = new PrintWriter(file);
            out.println(s);
            out.close();
            out = null;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JSONManager.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(out != null){
                out.close();
                out = null;
            }
        }
    }
    
    public void simpleBlockCreate(String modId, String genericName){
                        PrintWriter out = null;
        try {
            String sItem = "{\n" +
"    \"parent\": \""+modId+":block/copper_ore_overworld\",\n" +
"    \"display\": {\n" +
"        \"thirdperson\": {\n" +
"            \"rotation\": [ 10, -45, 170 ],\n" +
"            \"translation\": [ 0, 1.5, -2.75 ],\n" +
"            \"scale\": [ 0.375, 0.375, 0.375 ]\n" +
"        }\n" +
"    }\n" +
"}\n" +
"";
            File fileItem = new File(".\\export\\"+modId+"\\models\\item\\"+genericName+".json");
            fileItem.getParentFile().mkdirs();
            out = new PrintWriter(fileItem); 
            out.println(sItem);
            out.close();
            
            String sBlock = "{\n" +
"    \"parent\": \"block/cube_all\",\n" +
"    \"textures\": {\n" +
"        \"all\": \""+modId+":blocks/"+genericName+"\"\n" +
"    }\n" +
"}\n" +
"";
            File fileBlock = new File(".\\export\\"+modId+"\\models\\block\\"+genericName+".json");
            fileBlock.getParentFile().mkdirs();
            out = new PrintWriter(fileBlock);
            out.println(sBlock);
            out.close();
            String sBlockstate = "{\n" +
"    \"variants\": {\n" +
"        \"normal\": { \"model\": \"wou:copper_ore_overworld\" }\n" +
"    }\n" +
"}";
            File fileBlockstate = new File(".\\export\\"+modId+"\\blockstates\\"+genericName+".json");
            fileBlockstate.getParentFile().mkdirs();
            out = new PrintWriter(fileBlockstate);
            out.println(sBlockstate);
            out.close();
            out = null;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JSONManager.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(out != null){
                out.close();
                out = null;
            }
        }
    }
}
