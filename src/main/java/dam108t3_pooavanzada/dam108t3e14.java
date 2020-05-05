
package dam108t3_pooavanzada;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dam108t3e14 {
    public static String dominio;
    public static String ip;
    public static int puerto;

    public static void main(String[] args) {
        WebSite web;
        leerFichero();
        boolean validarIp = comprobarIp();
        if (validarIp) System.out.println("Ip valida");
        else System.out.println("La ip no es valida");
        
        web = new WebSite(dominio, ip, puerto);
        
        System.out.println("Dominio: "+web.getDominio());
        System.out.println("Ip: "+web.getIp());
        System.out.println("Puerto: "+web.getPuerto());

    }

    public static void leerFichero(){
        Properties config = new Properties();

        try{
            config.load(new FileInputStream("archivos\\web.props"));
            dominio = config.getProperty ("dominio");
            ip = config.getProperty ("ip");
            puerto = Integer.valueOf(config.getProperty ("puerto"));
        }
        catch(FileNotFoundException e){System.out.println("No Existe el"
                + " archivos");}
        catch(IOException ioe){ioe.printStackTrace();}
    }
    
    public static boolean comprobarIp(){
        String rexExp = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
        boolean validar = Pattern.matches(rexExp, ip);
        if (validar){
            Pattern patron = Pattern.compile("(\\d{1,3}).(\\d{1,3}).(\\d{1,3}).(\\d{1,3})");
            Matcher matcher = patron.matcher(ip);
            matcher.find();
            
            for (int i = 0; i < 4; i++) {
                if(!comprobarGrupo(matcher.group(i+1))) return false;
            }
            return true;
        } else return false;
    }
    
    public static boolean comprobarGrupo(String g){
        int n = Integer.valueOf(g);
        if (n >= 0 && n < 256) return true;
        return false;
    }
    
}
