package ex_22_Enum;

enum Locators{
    page_button("#btn"),
    page_input("#input1");

    private String locator;
    Locators(String locator){
        this.locator = locator;
    }

    String getLocator(){
        return this.locator;
    }
}
