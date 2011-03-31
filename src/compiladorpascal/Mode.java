package compiladorpascal;

public enum Mode {
    C(".c"),
    PASCAL(".pas");

    public String extensao;
    Mode(String ext){
        this.extensao = ext;
    }
}
