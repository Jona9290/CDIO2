public class Gamefield {
    private int fieldvalue;
    private String fieldname;
    private String adventureText;


    public Gamefield(int fieldvalue, String fieldname, String adventureText) {
        this.fieldvalue = fieldvalue;
        this.fieldname = fieldname;
        this.adventureText = adventureText;
    }

    public String getAdventureText() {
        return adventureText;
    }

    public void setAdventureText(String adventureText) {
        this.adventureText = adventureText;
    }

    public int getFieldvalue() {
        return fieldvalue;
    }

    public void setFieldvalue(int fieldvalue) {
        this.fieldvalue = fieldvalue;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }



}

