package ex_22_Enum;

enum APIurls {
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;
    APIurls(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}
