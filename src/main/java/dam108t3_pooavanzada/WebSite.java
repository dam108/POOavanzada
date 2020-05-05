
package dam108t3_pooavanzada;

class WebSite {
    private final String dominio;
    private final String ip;
    private final int puerto;
    
    public WebSite(final String d, final String ip, final int p){
        this.dominio = d;
        this.ip = ip;
        this.puerto = p;
    }

    public String getDominio() {
        return dominio;
    }

    public String getIp() {
        return ip;
    }

    public int getPuerto() {
        return puerto;
    }
}
